package com.solvd.OnlineShopping.tableBeans;

public enum Group {

	MEN("Men"),
	WOMEN("Women"),
	KIDS("Kids"),
	BABIES("Banies");
	
	
	private String value;
	
	Group(String value) {
			this.value= value;
		}

		public String getValue() {
			return value;
		}
}
