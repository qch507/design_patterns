package com.qiuch.observer;

import java.util.Observable;

/**
 * 用Vector 存储Observer 对象，保证线程安全
 * 
 * @author qiuch
 *
 */
public class Subject extends Observable {
	private String data = "";
	/*观察者获取观察对象状态的模式，pull即从观察对象中取，push即直接把状态数据推到观察者 */
	private boolean isPullMode;

	public boolean getIsPullMode() {
		return isPullMode;
	}

	public void setIsPullMode(boolean isPullMode) {
		this.isPullMode = isPullMode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if (!this.data.equals(data)) {
			this.data = data;
			setChanged();

			// 只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。
			if (isPullMode) {
				notifyObservers();
			} else {
				notifyObservers(data);
			}
		}
	}

}
