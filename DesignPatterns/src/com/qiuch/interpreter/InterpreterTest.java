package com.qiuch.interpreter;

/**
 * 解释器模式是类的行为模式。给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。客户端可以使用这个解释器来解释这个语言中的句子。
 * 
 * 主要应用在使用面向对象语言开发编译器中；在实际应用中，我们可能很少碰到去构造一个语言的文法的情况
 * 
 * @author qiuch
 *
 */
public class InterpreterTest {
	public static void main(String[] args) {
		Context ctx = new Context();
		Variable x = new Variable("x");
		Variable y = new Variable("y");
		Constant c = new Constant(true);
		ctx.assign(x, false);
		ctx.assign(y, true);

		Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
		System.out.println("x=" + x.interpret(ctx));
		System.out.println("y=" + y.interpret(ctx));
		System.out.println(exp.toString() + "=" + exp.interpret(ctx));
	}
}
