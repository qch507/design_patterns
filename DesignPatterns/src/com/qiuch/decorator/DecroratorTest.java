package com.qiuch.decorator;

/**
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
 * 
 * 用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息, 且代理类对被代理的对象有控制权，决定其执行或者不执行。
 * 
 * 装饰类对被装饰对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能。
 * 
 * 当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
 * 
 * 当我们使用装饰器模式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
 * 
 * @author qiuch
 */
public class DecroratorTest {

	public static void main(String[] args) {
		new Decorator(new DecoratedComponent()).decorate();
	}

}
