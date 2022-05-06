package com.solvd.OnlineShopping.interfaces;


import java.util.List;

import com.solvd.OnlineShopping.tableBeans.Product;


public interface IProductDAO extends IBaseDAO<Product> {

	List<Product> getProductsByBrand(String brand);
	
}
