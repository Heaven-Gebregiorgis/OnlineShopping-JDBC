package com.solvd.OnlineShopping.interfaces;

import java.util.List;


import com.solvd.OnlineShopping.tableBeans.Transaction;
import com.solvd.OnlineShopping.tableBeans.TransactionStatus;


public interface ITransactionDAO extends IBaseDAO<Transaction> {

		List<Transaction> getTranactionsByStatus(TransactionStatus s); 
}
