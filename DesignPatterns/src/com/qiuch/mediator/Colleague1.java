package com.qiuch.mediator;

public class Colleague1 extends AbstractColleague {
	public Colleague1(String name, Mediator mediator) {
		super(name, mediator);
	}

	public void getMessage(String message) {
		System.out.println("colleague 1's name:" + name + "and mesage:" + message);
	}

	public void contact(String message) {
		mediator.contact(message, this);
	}
}
