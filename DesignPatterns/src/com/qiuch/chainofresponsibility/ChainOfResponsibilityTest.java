package com.qiuch.chainofresponsibility;

/**
 * 责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。
 * 请求在这个链上传递，直到链上的某一个对象决定处理此请求。发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，
 * 这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。
 * 
 * 在以下条件下可考虑使用Chain of Responsibility： 
 * 1 有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。 
 * 2 你想在不明确指定接受者的情况下，想过个对象中的一个提交一个请求。 
 * 3 可处理一个请求的对象集合应该被动态指定。
 * 
 * 
 * Tomcat中的过滤器 Filter 使用类责任链模式
 * 
 * @author qiuch
 *
 */
public class ChainOfResponsibilityTest {
	public static void main(String[] args) {
		ChainedHandler h1 = new ChainedHandler("h1");
		ChainedHandler h2 = new ChainedHandler("h2");
		ChainedHandler h3 = new ChainedHandler("h3");

		h1.setHandler(h2);
		h2.setHandler(h3);

		h1.operator("h1");
		h1.operator("h2");
		h1.operator("h3");
	}

}
