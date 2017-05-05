package com.qiuch.mediator;

public class ConcreteMediator extends Mediator {

	Colleague1 colleague1;
	Colleague2 colleague2;

	public Colleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(Colleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public Colleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(Colleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	@Override
	public void contact(String content, AbstractColleague coll) {
		if (coll == colleague1) {
			colleague2.getMessage(content);
		} else {
			colleague1.getMessage(content);
		}
	}
}
