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
public class Order {

	private String productName;
	private String brandname;
	private int quantity;
	private double totalAmount;
	
}
