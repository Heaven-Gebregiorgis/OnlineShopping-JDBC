package com.solvd.OnlineShopping.tableBeans;

public enum Department {

	CLOTHES("Clothes"),
	SHOES("Shoes"),
	HOME("Home"),
	ELECTRONICS("Electronics");
	
	private String value;
	
	Department(String value) {
			this.value= value;
		}

		public String getValue() {
			return value;
		}
}
