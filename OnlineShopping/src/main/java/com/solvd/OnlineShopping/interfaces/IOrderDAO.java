package com.solvd.OnlineShopping.interfaces;

import java.util.List;

import com.solvd.OnlineShopping.tableBeans.Order;


public interface IOrderDAO extends IBaseDAO<Order> {

	List<Order> getOrdersByConfirmationNumber(String cn);  

}
