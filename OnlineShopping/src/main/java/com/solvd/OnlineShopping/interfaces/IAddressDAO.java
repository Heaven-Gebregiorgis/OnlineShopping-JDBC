package com.solvd.OnlineShopping.interfaces;

import java.util.List;

import com.solvd.OnlineShopping.tableBeans.Address;



public interface IAddressDAO extends IBaseDAO<Address> {

	
	List<Address> getAddressesByCity(String city);
}
