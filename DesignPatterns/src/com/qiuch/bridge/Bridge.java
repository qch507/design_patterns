package com.qiuch.bridge;

public abstract class Bridge {
	private Destiation destiation;

	public Destiation getDestiation() {
		return destiation;
	}

	public void setDestiation(Destiation destiation) {
		this.destiation = destiation;
	}

	public void toTheDestiation() {
		destiation.toTheDestiation();
	}

}
