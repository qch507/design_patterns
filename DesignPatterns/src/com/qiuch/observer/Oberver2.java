package com.qiuch.observer;

import java.util.Observable;
import java.util.Observer;

public class Oberver2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (arg == null) {
			System.out.println("obesever 2:" + o.getClass().getName() + "; changed:" + ((Subject) o).getData());
		} else {
			System.out.println("obesever 2: changed:" + arg.toString());
		}
	}

}
