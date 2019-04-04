package com.avinash.persistence;

import java.util.List;

import com.avinash.model.Order;

public interface OrderProducts {

	public List<Order> orderProduct(String productName,String brandName,int quantity);
}
