package com.avinash.model;

import java.util.ArrayList;

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
public class FlightOptions {

	private String sourceCity;
	private String destinationCity;
	private ArrayList<Flight>allFlights;
}
