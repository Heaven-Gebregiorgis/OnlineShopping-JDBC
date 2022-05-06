package com.solvd.OnlineShopping.tableBeans;

public enum TransactionStatus {

	
	POSTED("Posted"),
	PENDING("Pending");
	
	private String value;
	
	TransactionStatus(String value) {
			this.value= value;
		}

		public String getValue() {
			return value;
		}
}
