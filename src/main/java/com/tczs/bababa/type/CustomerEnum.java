package com.tczs.bababa.type;

/**
 * 客户种类
 * @author TaoerLi
 *
 */
public enum CustomerEnum {

	REGULAR("常规用户"),
	REWARDS("特价用户");
	
	private String description;

	CustomerEnum(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
