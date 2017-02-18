package com.qiuch.builder;

public class Builder {

	private String buildContent = "";

	public String getBuildContent() {
		return buildContent;
	}

	public Builder build() {
		layFoundation();
		buildWall();
		buildRoof();
		buildContent = buildContent + "\n房子造好了";
		return this;
	}

	public void buildRoof() {
		buildContent = buildContent + "加盖了屋顶";
	}

	public void buildWall() {
		buildContent = buildContent + "建造了墙壁";
	}

	public void layFoundation() {
		buildContent = buildContent + "打了地基";
	}
}
