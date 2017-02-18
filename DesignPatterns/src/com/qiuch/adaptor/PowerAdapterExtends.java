package com.qiuch.adaptor;

/**
 * 类（继承）型适配器，只能适配一个类
 * 
 * @author qiuch
 *
 */
public class PowerAdapterExtends extends TwoPlugSocket implements ThreePlugSocket {
	@Override
	public void getPower() {
		super.getPower();
		System.out.println("with adapter extends");
	}
}
