package com.qiuch.composite;

public class Leaf extends TreeNode {

	public Leaf(String nodeName) {
		super(nodeName);
	}

	@Override
	public void add(TreeNode node) {

	}

	@Override
	public void remove(TreeNode node) {

	}

	@Override
	public void eachChild() {
		System.out.println("node:" + super.getName());

	}

}
