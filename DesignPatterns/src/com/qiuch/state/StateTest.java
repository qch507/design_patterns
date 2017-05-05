package com.qiuch.state;

/**
 * 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并被自动更新。
 * 
 * 适用于： 1.一个对象的行为取决于它的状态,并且它必须在运行时刻根据状态改变它的行为。
 * 
 * 2.一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。 这个状态通常用一个或多个枚举常量表示。 通常,有多个操作包含这一相同的条件结构。
 * State模式将每一个条件分支放入一个独立的类中。 这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化
 * 
 * @author qiuch
 * 
 * 
 */
public class StateTest {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new StateA());
		System.out.println(context.stateMessage());
		context.setState(new StateB());
		System.out.println(context.stateMessage());
	}

}
