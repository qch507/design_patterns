package com.qiuch.singleton;

class CreateInstanceThread extends Thread {
	private String name;
	private int type;//

	public CreateInstanceThread(String name, int type) {
		this.name = name;
		this.type = type;
	}

	public void run() {
		try {
			switch (type) {
			case 0:
				System.out.println(name + " " + Singleton.getInstanceNormally().toString());
				break;
			case 1:
				System.out.println(name + " " + Singleton.getInstanceThreadSafety().toString());
				break;
			case 2:
				System.out.println(name + " " + Singleton.getInstanceThreadSafety2().toString());
				break;
			case 3:
				System.out.println(name + " " + Singleton.getInstanceThreadSafety3().toString());
				break;

			default:
				break;
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}