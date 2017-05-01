package com.qiuch.iterator;

/**
 * 就是抽象容器的具体实现类，比如List接口的有序列表实现ArrayList，List接口的链表实现LinkList，Set接口的哈希列表的实现HashSet等
 * 
 * @author qiuch
 *
 */
public class ConcreteAggregate implements Aggregate {

	private Object[] list;
	private int size = 0;
	private int index = 0;

	public ConcreteAggregate() {
		index = 0;
		size = 0;
		list = new Object[100];
	}

	@Override
	public void add(Object obj) {
		list[index++] = obj;
		size++;
	}

	@Override
	public Iterator iterator() {

		return new ConcreteIterator(this);
	}

	@Override
	public Object get(int index) {

		return list[index];
	}

	@Override
	public int getSize() {

		return size;
	}

}
