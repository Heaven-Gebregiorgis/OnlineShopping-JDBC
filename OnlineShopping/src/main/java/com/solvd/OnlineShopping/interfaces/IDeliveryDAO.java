package com.solvd.OnlineShopping.interfaces;

import java.util.List;


import com.solvd.OnlineShopping.tableBeans.Delivery;
import com.solvd.OnlineShopping.tableBeans.User;

public interface IDeliveryDAO extends IBaseDAO<Delivery> {

	List<Delivery> getDeliveriesByUser(User u); 

}
