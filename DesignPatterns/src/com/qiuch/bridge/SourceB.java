package com.qiuch.bridge;

public class SourceB extends Bridge {
	@Override
	public void toTheDestiation() {
		System.out.println("from Source B ");
		getDestiation().toTheDestiation();
	}
}
