package com.qiuch.mediator;

public abstract class AbstractColleague {
	protected String name;
	protected Mediator mediator;

	public AbstractColleague(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
}
