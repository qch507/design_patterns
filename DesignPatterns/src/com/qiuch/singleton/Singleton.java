package com.qiuch.singleton;

/**
 * 适合只需要一个实例的情况，配置文件，缓存 日志对象等
 * 
 * @author qiuch
 *
 */
public class Singleton {

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	/* 假定对象必然被使用，则在启动时就实例化(饿汉) */
	// private static Singleton instance = new Singleton();

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 静态方法，创建实例，适合单线程 */
	public static Singleton getInstanceNormally() throws InterruptedException {
		if (instance == null) {
			Thread.sleep(1000);
			instance = new Singleton();
		}
		return instance;
	}

	/* 加入synchronized关键字，保证线程同步，适合多线程（懒汉式） */
	public static synchronized Singleton getInstanceThreadSafety() throws InterruptedException {
		if (instance == null) {
			Thread.sleep(1000);
			instance = new Singleton();
		}
		return instance;
	}

	/* 优化上面的方法，不用每次获取同步锁，只需在创建对象时获取同步锁 */

	/*
	 * 这段是抄的 在Java指令中创建对象和赋值操作是分开进行的， 也就是说instance = new Singleton();
	 * 语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序， 也就是说有可能JVM会为新的Singleton实例分配空间，
	 * 然后直接赋值给instance成员， 然后再去初始化这个Singleton实例。 这样就可能出错了，我们以A、B两个线程为例：
	 * 
	 * a>A、B线程同时进入了第一个if判断 b>A首先进入synchronized块，由于instance为null，所以它执行instance =
	 * new Singleton(); c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，
	 * 并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
	 * d>B进入synchronized块，由于instance此时不是null，
	 * 因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
	 * e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
	 */

	public static Singleton getInstanceThreadSafety2() throws InterruptedException {
		if (instance == null) {
			Thread.sleep(1000);
			synchronized (Singleton.class) {
				if (instance == null) {
					Thread.sleep(1000);
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	/* 优化上面的方法，不用每次获取同步锁，只需在创建对象时获取同步锁 (分方法实现) */
	public static Singleton getInstanceThreadSafety3() throws InterruptedException {
		if (instance == null) {
			Thread.sleep(1000);
			createInstance();
		}
		return instance;
	}

	private static synchronized void createInstance() throws InterruptedException {
		if (instance == null) {
			Thread.sleep(1000);
			instance = new Singleton();
		}
	}

	/* 饿汉模式下获取实例，因为启动时已创建，所以直接获取，缺点时内存始终被占 */
	// public static Singleton getInstance() {
	// return instance;
	// }

	/*
	 * 用静态内部类来维护 构造函数异常时无法创建？
	 */
	private static class SingletonHolder {
		private static Singleton instance = new Singleton();
	}

	/* 获取实例 */
	public static Singleton getInstanceFromHolder() {
		return SingletonHolder.instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return instance;
	}
}
