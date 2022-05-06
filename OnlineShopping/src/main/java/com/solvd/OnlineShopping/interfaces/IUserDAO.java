package com.solvd.OnlineShopping.interfaces;

import java.sql.Date;
import java.util.List;

import com.solvd.OnlineShopping.tableBeans.User;

public interface IUserDAO extends IBaseDAO<User> {

	
	List<User> getUsersByDate(Date d);
}

