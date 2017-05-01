package com.qiuch.iterator;

/**
 * 实现迭代器接口中定义的方法，完成集合的迭代。
 * 
 * @author qiuch
 *
 */
public class ConcreteIterator implements Iterator {
	private Aggregate aggreate = null;
	private int index;

	public ConcreteIterator(Aggregate list) {
		super();
		this.aggreate = list;
	}

	@Override
	public boolean hasNext() {
		if (index >= aggreate.getSize()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Object object = aggreate.get(index);
		index++;
		return object;
	}

}