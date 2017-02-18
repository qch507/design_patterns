package com.qiuch.proxy;

public class Person implements RentHouse {
	private int money;
	private String name;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void rent() {
		System.out.println("renting.....");
	}

}
