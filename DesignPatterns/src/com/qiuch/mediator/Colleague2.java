package com.qiuch.mediator;

public class Colleague2 extends AbstractColleague {
	public Colleague2(String name, Mediator mediator) {
		super(name, mediator);
	}

	public void getMessage(String message) {
		System.out.println("colleague 2's name:" + name + "and mesage:" + message);
	}

	// 同事A与中介者通信
	public void contact(String message) {
		mediator.contact(message, this);
	}
}
