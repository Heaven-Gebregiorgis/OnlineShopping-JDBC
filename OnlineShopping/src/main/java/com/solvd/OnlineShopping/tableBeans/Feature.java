package com.solvd.OnlineShopping.tableBeans;

public enum Feature {

	ON("On"),
	OFF("Off");
	
private String value;
	
Feature(String value) {
		this.value= value;
	}

	public String getValue() {
		return value;
	}
}
