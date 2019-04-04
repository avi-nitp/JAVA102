package com.avinash.OnlineShopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.avinash.model.Order;
import com.avinash.persistence.GetProducts;
import com.avinash.persistence.GetProductsImpl;
import com.avinash.persistence.OrderProducts;
import com.avinash.persistence.OrderProductsImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Scanner sc=new Scanner(System.in);
        GetProducts getAllProducts=new GetProductsImpl();
        OrderProducts orderProducts=new OrderProductsImpl();
        
        Runnable r1=()->{
        	System.out.println("Ordering 101 Samsung HeadPhone");
        	 List<Order>myOrders=orderProducts.orderProduct("Headphones", "Samsung",101);
             if(myOrders.size()==0)
             	System.out.println("Sorry 101 Samsung HeadPhone is not available");
             else
             	{
            	 System.out.println(myOrders);
            	 System.out.println("Ordering of 101 Samsung HeadPhones is successful");
             	}
        };
        
        Runnable r2=()->
        {
        	System.out.println("Searching HeadPhones");
        	 System.out.println(getAllProducts.getProducts("Headphones"));
        };
       
        Runnable r3=()->
        {
        	System.out.println("Searching Laptops");
        	 System.out.println(getAllProducts.getProducts("Laptop"));
        };
        Runnable r4=()->
        {
        	System.out.println("Ordering 20 Toshiba Laptops");
       	 List<Order>myOrders=orderProducts.orderProduct("Laptop", "Toshiba",20);
            if(myOrders.size()==0)
            	System.out.println("Sorry 20 Toshiba Laptops is not available");
            else
            	{
            	System.out.println(myOrders);
            	System.out.println("Ordering of 20 Toshiba Laptops is successful");
            	}
        };
        Runnable r5=()->
        {
        	System.out.println("Searching pendrives");
        	 System.out.println(getAllProducts.getProducts("Pendrive"));
        };
        Runnable r6=()->
        {
        	System.out.println("Ordering 25 Sony Pendrives");
       	 List<Order>myOrders=orderProducts.orderProduct("Pendrive", "Sony",25);
            if(myOrders.size()==0)
            	System.out.println("Sorry 25 Sony Pendrives is not available");
            else
            	{
            	System.out.println(myOrders);
            	System.out.println("Ordering of 25 Sony Pendrives is successful");
            	}
        };
        Runnable r7=()->
        {
        	System.out.println("Ordering 10 Kingston Pendrives");
       	 List<Order>myOrders=orderProducts.orderProduct("Pendrive", "Kingston",10);
            if(myOrders.size()==0)
            	System.out.println("Sorry 10 Kingston Pendrives is not available");
            else
            	{
            	System.out.println(myOrders);
            	System.out.println("Ordering of 10 Kingston Pendrives is successful");
            	}
        };
        
        
        List<Runnable>list=new ArrayList<>();
    	list.add(r1);
    	list.add(r2);
    	list.add(r3);
    	list.add(r4);
    	list.add(r5);
    	list.add(r6);
    	list.add(r7);
    	
    	ExecutorService pool=Executors.newFixedThreadPool(7);
    	for(Runnable task:list)
    		pool.execute(task);
    	pool.shutdown();
    }
}
