package com.solvd.OnlineShopping.tableBeans;

public enum Permission {
	
	ALLOW("Allow"),
	DONOTALLOW("Do not allow");
	
	private String value;
	
	Permission(String value) {
		this.value= value;
	}

	public String getValue() {
		return value;
	}

}
