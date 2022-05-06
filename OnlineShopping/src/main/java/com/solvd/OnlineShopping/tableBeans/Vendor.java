package com.solvd.OnlineShopping.tableBeans;

public class Vendor {

	private int id;
	private String vandorName;
	private String contactName;
	private String email;
	private String phone;
	private Address address;
	
	
	public Vendor() {}
	public Vendor(int id, String vandorName, String contactName, String email, String phone, Address address) {
		super();
		this.id = id;
		this.vandorName = vandorName;
		this.contactName = contactName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVandorName() {
		return vandorName;
	}
	public void setVandorName(String vandorName) {
		this.vandorName = vandorName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
