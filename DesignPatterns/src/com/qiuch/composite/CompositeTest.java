package com.qiuch.composite;

/**
 * 
 * 当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式了
 * 
 * @author qiuch
 *
 */
public class CompositeTest {

	public static void main(String[] args) {
		Branch treeRoot = new Branch("root");
		Branch leftBranch = new Branch("left branch");
		Branch rightBranch = new Branch("right branch");

		Leaf leftLeaf = new Leaf("left Leaf");
		Leaf rightLeaf = new Leaf("right Leaf");

		leftBranch.add(leftLeaf);
		rightBranch.add(rightLeaf);

		treeRoot.add(leftBranch);
		treeRoot.add(rightBranch);

		treeRoot.eachChild();

	}

}
