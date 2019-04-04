package com.avinash.service;

import java.util.Scanner;

import com.avinash.persistence.GetProducts;
import com.avinash.persistence.GetProductsImpl;
import com.avinash.persistence.OrderProducts;
import com.avinash.persistence.OrderProductsImpl;

public class UserMenu {

	public void showMenu()
	{
		System.out.println("Please select:");
		System.out.println("1.Search a Product");
		System.out.println("2.Order a Product");
		System.out.println("3.Exit");
	}
	
	public void selectMenu(int ch)
	{
		 GetProducts getAllProducts=new GetProductsImpl();
	     OrderProducts orderProducts=new OrderProductsImpl();
	     Scanner sc=new Scanner(System.in);
	     String productName,brandName;
	     int quantity;
		switch(ch)
		{
		case 1:
			System.out.println("Please enter the product to be searched");
			productName=sc.next();
			System.out.println(getAllProducts.getProducts(productName));
			break;
		case 2:
			System.out.println("Enter the product to be ordered");
			productName=sc.next();
			System.out.println("Enter the Brand name of the product to be ordered");
			brandName=sc.next();
			System.out.println("Enter the quantity of the product to be ordered");
			quantity=sc.nextInt();
			System.out.println(orderProducts.orderProduct(productName, brandName, quantity));
			break;
		case 3:
			
		}
	}
}
