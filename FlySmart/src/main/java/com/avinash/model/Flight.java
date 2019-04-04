package com.avinash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Flight {

	private String flightNo;
	private String sourceCity;
	private String destinationCity;
	private int  fare;
	private int duration;
	@Override
	public String toString() {
		return "FlightNo:" + flightNo + "\n sourceCity:" + sourceCity + "\n destinationCity:" + destinationCity
				+ "\n fare:" + fare + "\n duration:" + duration + "\n\n\n";
	}
	
	
}
