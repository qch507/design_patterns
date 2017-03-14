package com.qiuch.composite;

public abstract class TreeNode {

	private String name;

	public abstract void add(TreeNode node);

	public abstract void remove(TreeNode node);

	public abstract void eachChild();

	public TreeNode(String nodeName) {
		this.name = nodeName;
	}

	public String getName() {
		return name;
	}
}