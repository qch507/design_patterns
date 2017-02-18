package com.qiuch.observer;

/**
 * 联动类型的情况下适合，如消息订阅等等
 * 
 * @author qiuch
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new Subject();
		Oberver1 oberver1 = new Oberver1();
		Oberver2 oberver2 = new Oberver2();
		subject.addObserver(oberver1);
		subject.addObserver(oberver2);
		// subject.setData("data changed 1");

		subject.deleteObserver(oberver2);

		// subject.setIsPullMode(true);//pull在多线程下数据异常
		// subject.setData("data changed 2");

		// 多线程下的探索
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					subject.setData("data changed thread 1 - " + i);
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					subject.setData("data changed thread 2 - " + i);
				}

			}
		});

		t1.start();
		t2.start();
	}

}
