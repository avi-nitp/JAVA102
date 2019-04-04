package com.avinash.service;

import java.util.ArrayList;

import com.avinash.model.Flight;

public interface GetAllAvailableFlights {

	public ArrayList<Flight>getAllFlights(String sourceCity, String destinationCity);
	public ArrayList<Flight>flightsSortByPrice(String sourceCity, String destinationCity);
}
