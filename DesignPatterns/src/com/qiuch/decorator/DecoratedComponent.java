package com.qiuch.decorator;

public class DecoratedComponent implements DecoratorInterface {

	@Override
	public void decorate() {
		System.out.println("I am the DecoratedComponent");
	}

}
