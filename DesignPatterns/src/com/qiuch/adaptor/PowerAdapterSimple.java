package com.qiuch.adaptor;

/**
 *  接口模式适配器，用于想实现某接口却不想实现接口所有方法时使用
 * 
 * @author qiuch
 *
 */
public class PowerAdapterSimple extends ThreePlugSocketSimple {

	@Override
	public void getPower() {
		super.getPower();
		System.out.println("only adapt power,dont care about type");
	}

}
