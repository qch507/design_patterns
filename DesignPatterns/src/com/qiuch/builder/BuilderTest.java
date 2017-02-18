package com.qiuch.builder;

/**
 * 适用于构建较为复杂类的创建
 * 
 * 常见于三方SDK
 * 
 * @author qiuch
 *
 */
public class BuilderTest {
	public static void main(String[] args) {
		System.out.println(new Builder().build().getBuildContent());
	}
}
