package com.solvd.OnlineShopping.interfaces;

import java.util.List;

import com.solvd.OnlineShopping.tableBeans.Feedback;
import com.solvd.OnlineShopping.tableBeans.Product;


public interface IFeedbackDAO extends IBaseDAO<Feedback> {

	List<Feedback> getFeedbacksByProduct(Product p);  

}
