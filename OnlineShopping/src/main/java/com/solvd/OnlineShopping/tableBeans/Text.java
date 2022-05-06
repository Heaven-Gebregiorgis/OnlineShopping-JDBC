package com.solvd.OnlineShopping.tableBeans;

public enum Text {

	SEND("Send"),
	DONOTSEND("Do not send");
	
	private String value;
	
	Text(String value) {
		this.value= value;
	}

	public String getValue() {
		return value;
	}
}
