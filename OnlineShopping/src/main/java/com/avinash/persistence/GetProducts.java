package com.avinash.persistence;

import java.util.List;

import com.avinash.model.Product;

public interface GetProducts {

	public List<Product>getProducts(String productName);
}
