package com.qiuch.chainofresponsibility;

public class ChainedHandler extends AbstractHandler implements Handler {

	private String name;

	public ChainedHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator(String name) {
		if (this.name.equals(name)) {
			System.out.println(name + "deal!");
		} else if (getHandler() != null) {
			getHandler().operator(name);
		}
	}
}
