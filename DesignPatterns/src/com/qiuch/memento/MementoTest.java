package com.qiuch.memento;

/**
 * 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。
 * 备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化，存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态。
 * 备忘录模式常常与命令模式和迭代子模式一同使用。
 * 
 * 适合功能比较复杂的，但需要维护或记录属性历史的功能。
 * 
 * 此微白箱模式，黑箱模式及扩展等，抽空完善
 * 
 * @author qiuch
 *
 */
public class MementoTest {

	public static void main(String[] args) {

		// 创建原始类
		Original origi = new Original("original");

		// 创建备忘录
		Storage storage = new Storage(origi.createMemento());

		// 修改原始类的状态
		System.out.println("初始化状态为：" + origi.getValue());
		origi.setValue("value changed");
		System.out.println("修改后的状态为：" + origi.getValue());

		// 回复原始类的状态
		origi.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + origi.getValue());
	}
}
