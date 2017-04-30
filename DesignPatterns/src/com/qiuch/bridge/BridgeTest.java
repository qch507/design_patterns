package com.qiuch.bridge;

/**
 * 桥接模式就是：将抽象与实现解耦，使得二者可以独立变化，使用了封装、聚合，可以用继承将不同的功能拆分为不同的类。
 * 
 * 常见的使用场景为JDBC桥DriverManager，JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动代码
 * 
 * 原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。
 * 
 * ----------桥接和适配器模式的不同---------------
 * 
 * 共同点 桥接和适配器都是让两个东西配合工作
 * 
 * 不同点 出发点不同。
 * 
 * 1）适配器：改变已有的两个接口，让他们相容。 2）桥接模式：分离抽象化和实现，使两者的接口可以不同，目的是分离。
 * 
 * 所以说，如果你拿到两个已有模块，想让他们同时工作，那么你使用的适配器。 如果你还什么都没有，但是想分开实现，那么桥接是一个选择。
 * 
 * 桥接是先有桥，才有两端的东西 适配是先有两边的东西，才有适配器
 * 
 * 桥接是在桥好了之后，两边的东西还可以变化。
 * 
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
