package com.solvd.OnlineShopping.interfaces;

import java.util.List;

import com.solvd.OnlineShopping.tableBeans.Cart;
import com.solvd.OnlineShopping.tableBeans.User;

public interface ICartDAO extends IBaseDAO<Cart> {

	List<Cart> getCartsByUser(User u);
}
