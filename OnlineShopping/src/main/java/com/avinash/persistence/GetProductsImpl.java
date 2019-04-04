package com.avinash.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.avinash.model.Product;

public class GetProductsImpl implements GetProducts {

	@Override
	public  List<Product> getProducts(String productName) {
		
		synchronized (this) {
			
			List<Product> products = new ArrayList<>();

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
					return products.stream().filter(p-> p.getName().equalsIgnoreCase(productName)).collect(Collectors.toList());
		}
		
		
	}

}
