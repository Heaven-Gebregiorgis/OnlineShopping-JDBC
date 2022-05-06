package com.solvd.OnlineShopping.interfaces;

import java.util.List;

import com.solvd.OnlineShopping.tableBeans.Message;
import com.solvd.OnlineShopping.tableBeans.User;

public interface IMessageDAO extends IBaseDAO<Message> {

	List<Message> getMessagesByUser(User u);  

}
