package com.qiuch.decorator;

public class Decorator implements DecoratorInterface {

	private DecoratorInterface decoratorInterface;

	public Decorator(DecoratorInterface decoratorInterface) {
		this.decoratorInterface = decoratorInterface;
	}

	@Override
	public void decorate() {
		System.out.println("add some thing before");
		decoratorInterface.decorate();
		System.out.println("add some thing after");
	}

}
