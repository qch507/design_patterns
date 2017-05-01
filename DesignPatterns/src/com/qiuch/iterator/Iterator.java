package com.qiuch.iterator;

/**
 * 定义遍历元素所需要的方法，一般来说会有这么三个方法：取得下一个元素的方法next()，判断是否遍历结束的方法hasNext()），移出当前对象的方法remove(),
 * 
 * @author qiuch
 *
 */
public interface Iterator {

	public boolean hasNext();

	public Object next();
}
