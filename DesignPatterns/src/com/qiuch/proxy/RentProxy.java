package com.qiuch.proxy;

public class RentProxy implements RentHouse {
	private Person person;
	private boolean isRentSuccess;

	public RentProxy(Person person) {
		this.person = person;
	}

	@Override
	public void rent() {
		before();
		person.rent();
		after();
	}

	private void before() {
		System.out.print("proxy judge: ");
		if (person == null) {
			System.out.println("no one wants to rent a house");
			isRentSuccess = false;
			return;
		}

		if (person.getMoney() > 1000) {
			System.out.println(person.getName() + " can rent a house");
			isRentSuccess = true;
		} else {
			System.out.println("there is no house lower than 1000");
			isRentSuccess = false;
		}
	}

	private void after() {
		if (isRentSuccess) {
			System.out.println(person.getName() + " has rented the house");
		} else {
			System.out.println("rent failed");
		}
	}

}
