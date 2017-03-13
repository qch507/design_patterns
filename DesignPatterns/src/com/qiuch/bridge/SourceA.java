package com.qiuch.bridge;

public class SourceA extends Bridge {
	@Override
	public void toTheDestiation() {
		System.out.println("from Source A ");
		getDestiation().toTheDestiation();
	}
}
