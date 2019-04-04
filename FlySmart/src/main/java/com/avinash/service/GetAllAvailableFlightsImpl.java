package com.avinash.service;

import java.util.ArrayList;
import java.util.Comparator;

import com.avinash.model.Flight;
import com.avinash.persistence.GetAllFlights;
import com.avinash.persistence.GetAllFlightsImpl;

public class GetAllAvailableFlightsImpl implements GetAllAvailableFlights {

	@Override
	public ArrayList<Flight> getAllFlights(String sourceCity, String destinationCity) {
		ArrayList<Flight>allFlights=null;
		 GetAllFlights getflights=new GetAllFlightsImpl();
		 allFlights=getflights.getAllFlights(sourceCity, destinationCity);
		return allFlights;
	}

	@Override
	public ArrayList<Flight> flightsSortByPrice(String sourceCity, String destinationCity) {
		ArrayList<Flight>allFlights=null;
		 GetAllFlights getflights=new GetAllFlightsImpl();
		 allFlights=getflights.getAllFlights(sourceCity, destinationCity);
		 allFlights.sort((Flight o1, Flight o2)->o1.getFare()-o2.getFare());
		 return allFlights;
	}

}
