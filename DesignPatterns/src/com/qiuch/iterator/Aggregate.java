package com.qiuch.iterator;

/**
 * 一般是一个接口，提供一个iterator()方法，例如java中的Collection接口，List接口，Set接口等
 * 
 * @author qiuch
 *
 */
public interface Aggregate {

	public void add(Object obj);

	public Object get(int index);

	public Iterator iterator();

	public int getSize();
}
