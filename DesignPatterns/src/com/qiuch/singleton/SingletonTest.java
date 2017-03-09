package com.qiuch.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// 不使用线程
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Singleton.getInstanceNormally());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 使用线程
		for (int i = 1; i < 6; i++) {
			CreateInstanceThread thread = new CreateInstanceThread("thread" + i, 0);
			// CreateInstanceThread thread = new CreateInstanceThread("thread" +
			// i, 1);
			// CreateInstanceThread thread = new CreateInstanceThread("thread" +
			// i, 2);
			// CreateInstanceThread thread = new CreateInstanceThread("thread" +
			// i, 3);
			thread.start();
		}
	}

}
