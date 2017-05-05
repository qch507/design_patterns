package com.qiuch.visitor;

class ConcreteElement2 extends Element {
	public void doSomething() {
		System.out.println("this is element 2");
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
