package com.avinash.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.avinash.model.Order;
import com.avinash.model.Product;

public class OrderProductsImpl implements OrderProducts {

	@Override
	public  List<Order> orderProduct(String productName, String brandName, int quantity) {
		
		synchronized (this) {
			List<Order> orders = new ArrayList<>();
			final List<Product> products = new ArrayList<>();
			
			try (Stream<String> stream = Files.lines(Paths.get("Products_SuperStore.csv"))) {

			stream.map(line -> {
			String[] s = line.split(",");
			Product p = new Product(s[0],s[1],s[2],
			Double.parseDouble(s[3]),Integer.parseInt(s[4]));
			products.add(p);
			return p;
			}).collect(Collectors.toList());

			} catch (IOException ioe) {
			System.out.println(ioe);
			}
			
//			Comparator<Product> compareByName = Comparator
//					.comparing(Product::getName);
			List<Product> myProducts = new ArrayList<>();
			myProducts=products.stream().filter(p-> p.getName().equalsIgnoreCase(productName) && p.getBrand().equalsIgnoreCase(brandName)).collect(Collectors.toList());
			for(Product p:myProducts)
			{
				if(p.getStock()>=quantity)
				{
					Order o=new Order(productName,brandName,quantity,quantity*p.getPrice());
					orders.add(o);
				}
		    }
			return orders;
		}
	}

}
