package com.qiuch.template;

public class TemplateB extends AbstractTemplate {

	public TemplateB() {
		isSuperOperationNeeded = false;
	}

	@Override
	public void PrimitiveOperation1() {
		System.out.println("do the TemplateA PrimitiveOperation1");

	}

	@Override
	public void PrimitiveOperation2() {
		System.out.println("do the TemplateA PrimitiveOperation2");

	}

	@Override
	public void PrimitiveOperation3() {
		System.out.println("do the TemplateA PrimitiveOperation3");

	}

}
