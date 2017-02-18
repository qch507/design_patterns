package com.qiuch.adaptor;

/**
 * 对象型的适配器
 * 
 * 可适配子类，扩展较好
 * 
 * @author qiuch
 *
 */
public class PowerAdaptor implements ThreePlugSocket {

	TwoPlugSocket twoPlugSocket;

	public PowerAdaptor(TwoPlugSocket twoPlugSocket) {
		this.twoPlugSocket = twoPlugSocket;
	}

	@Override
	public void getPower() {
		twoPlugSocket.getPower();
		System.out.println("with adapter");
	}

}
