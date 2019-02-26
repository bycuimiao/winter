package com.winter.bean;

/**
 * bean简单定义.
 *
 * @author cuimiao123
 * @since 12 January 2019
 */
public class WinterBean {
	private String id;

	private String className;

	public WinterBean() {
	}

	public WinterBean(String id, String className) {
		this.id = id;
		this.className = className;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
