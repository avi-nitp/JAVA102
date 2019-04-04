package com.avinash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {

	private String productCode;
	private String name;
	private String brand;
	private double price;
	private int stock;
	@Override
	public String toString() {
		return "ProductCode:" + productCode + "\n name:" + name + "\n brand:" + brand + "\n price:" + price
				+ "\n stock:" + stock + "\n\n";
	}
	
	
}
