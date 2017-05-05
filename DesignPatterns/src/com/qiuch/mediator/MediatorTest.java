package com.qiuch.mediator;

/**
 * 用一个中介者对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使耦合松散，而且可以独立地改变它们之间的交互。
 * 
 * 适用于1.一组对象以定义良好但是复杂的方式进行通信，产生的相互依赖关系结构混乱且难以理解。
 * 
 * 2.一个对象引用其他很多对象并且直接与这些对象通信,导致难以复用该对象。
 * 
 * 3.想定制一个分布在多个类中的行为，但又不想生成太多的子类。
 * 
 * 将混乱的网状结构解耦成相对松散的星状结构
 * 
 * @author qiuch
 *
 */
public class MediatorTest {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Colleague1 colleague1 = new Colleague1("name colleague 1", mediator);
		Colleague2 colleague2 = new Colleague2("name colleague 2", mediator);
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		colleague1.contact("this is colleague 1");
		colleague2.contact("this is colleague 2");

	}

}
