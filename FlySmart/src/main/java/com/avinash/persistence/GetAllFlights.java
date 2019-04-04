package com.avinash.persistence;

import java.util.ArrayList;

import com.avinash.model.Flight;

public interface GetAllFlights {

	public ArrayList<Flight> getAllFlights(String sourceCity,String destinationCity);
}
