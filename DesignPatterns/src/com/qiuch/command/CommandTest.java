package com.qiuch.command;

/**
 * 定义
 * 将来自客户端的请求传入一个对象，从而使你可用不同的请求对客户进行参数化。用于“行为请求者”与“行为实现者”解耦，可实现二者之间的松耦合，以便适应变化。分离变化与不变的因素。
 * 
 * 优点 1.降低对象之间的耦合度。 2.新的命令可以很容易地加入到系统中。 3.可以比较容易地设计一个组合命令。 4.调用同一方法实现不同的功能
 * 
 * 缺点
 * 使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个命令都需要设计一个具体命令类，因此某些系统可能需要大量具体命令类，这将影响命令模式的使用。
 * 
 * 适用情况 1.系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。 2.系统需要在不同的时间指定请求、将请求排队和执行请求。
 * 3.系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。 4.系统需要将一组操作组合在一起，即支持宏命令。
 * 
 * 不少Command模式的代码都是针对图形界面的，它实际就是菜单命令，我们在一个下拉菜单选择一个命令时，然后会执行一些动作。
 * Struts就是一种将请求和呈现分离的技术，使用了命令模式
 * 
 * @author qiuch
 *
 */
public class CommandTest {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}

}
