package com.qiuch.bridge;

/**
 * 桥接模式就是：将抽象与实现解耦，使得二者可以独立变化，使用了封装、聚合，可以用继承将不同的功能拆分为不同的类。
 * 
 * 常见的使用场景为JDBC桥DriverManager，JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动代码
 * 
 * 原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。
 * 
 * @author qiuch
 *
 */
public class BridgeTest {

	public static void main(String[] args) {
		Bridge bridge = new SourceA();
		bridge.setDestiation(new DestiationA());
		bridge.toTheDestiation();

		bridge.setDestiation(new DestiationB());
		bridge.toTheDestiation();
	}

}
