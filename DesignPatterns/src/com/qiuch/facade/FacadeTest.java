package com.qiuch.facade;

/**
 * 
 * 外观模式又称为门面模式，它是一种对象结构型模式。
 * 
 * 外观模式是迪米特法则的一种具体实现，通过引入一个新的外观角色可以降低原有系统的复杂度，同时降低客户类与子系统的耦合度。
 * 
 * 像spring一样，可以将类和类之间的关系配置到配置文件中
 * 
 * 该模式中没有涉及到接口
 * 
 * @author qiuch
 *
 */
public class FacadeTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();

	}

}
