package com.qiuch.iterator;

/**
 * 迭代器模式（Iterator），提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 * 
 * 迭代器模式应用的场景及意义 
 * (1)访问一个聚合对象的内容而无需暴露它的内部表示 
 * (2)支持对聚合对象的多种遍历
 * (3)为遍历不同的聚合结构提供一个统一的接口
 * 
 * @author qiuch
 *
 */
public class IteratorTest {

	public static void main(String[] args) {
		Aggregate list = new ConcreteAggregate();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
