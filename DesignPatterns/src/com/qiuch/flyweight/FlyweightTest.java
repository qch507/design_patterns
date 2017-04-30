package com.qiuch.flyweight;

/**
 * 
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用
 * 
 * Flyweight(享元)模式是如此的重要，因为它能帮你在一个复杂的系统中大量的节省内存空间。
 * 在Java语言中，String类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。
 * 在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。
 * 
 * 
 * 当客户端要求生成一个对象时，工厂会检测是否存在此对象的实例，如果存在那么直接返回此对象实例，如果不存在就创建一个并保存起来，这点有些单例模式的意思。
 * 通常工厂类会有一个集合类型的成员变量来用以保存对象，如hashtable,vector等。在java中，数据库连接池，线程池等即是用享元模式的应用。
 * 
 * 享元模式=单例模式+工厂模式+合成模式?
 * 
 * @author qiuch
 *
 */
public class FlyweightTest {
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1;
	Flyweight fly2;
	Flyweight fly3;
	Flyweight fly4;
	Flyweight fly5;
	Flyweight fly6;

	/** */
	/** Creates a new instance of FlyweightPattern */
	public FlyweightTest() {
		fly1 = factory.getFlyWeight("Google");
		fly2 = factory.getFlyWeight("Qutr");
		fly3 = factory.getFlyWeight("Google");
		fly4 = factory.getFlyWeight("Google");
		fly5 = factory.getFlyWeight("Google");
		fly6 = factory.getFlyWeight("Google");
	}

	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}

	public static void main(String[] args) {
		System.out.println("The FlyWeight Pattern!");
		FlyweightTest ft = new FlyweightTest();
		ft.showFlyweight();
	}
}
