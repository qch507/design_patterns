package com.qiuch.composite;

import java.util.LinkedList;
import java.util.List;

public class Branch extends TreeNode {

	public Branch(String nodeName) {
		super(nodeName);
	}

	List<TreeNode> nodeList = new LinkedList<>();

	@Override
	public void add(TreeNode node) {
		nodeList.add(node);
	}

	@Override
	public void remove(TreeNode node) {
		nodeList.remove(node);

	}

	@Override
	public void eachChild() {
		System.out.println("node:" + super.getName());
		for (TreeNode treeNode : nodeList) {
			treeNode.eachChild();
		}
	}

}
