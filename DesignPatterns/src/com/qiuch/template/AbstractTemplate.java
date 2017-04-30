package com.qiuch.template;

abstract class AbstractTemplate {

	protected boolean isSuperOperationNeeded = true;// 让子类可以选择是否执行父类流程

	// 模板方法
	public void TemplateMethod() {
		if (isSuperOperationNeeded) {
			doInSuper();
		}
		PrimitiveOperation1();
		PrimitiveOperation2();
		PrimitiveOperation3();
	}

	public void doInSuper() {
		System.out.println("do the AbstractTemplate operation");
	}

	public abstract void PrimitiveOperation1();

	public abstract void PrimitiveOperation2();

	public abstract void PrimitiveOperation3();

}