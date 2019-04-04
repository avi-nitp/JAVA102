package com.avinash.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.avinash.model.Flight;

public class GetAllFlightsImpl implements GetAllFlights {

	public ArrayList<Flight> getAllFlights(String sourceCity, String destinationCity) {
		ArrayList<Flight>allFlights=new ArrayList<>();
		
		  String csvFile = "/Users/avisingh3/Downloads/AirIndia_Flights.csv";
	        String line = "";
	        String cvsSplitBy = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	            	
	                String[] flight = line.split(cvsSplitBy);

	                if((flight[1].toLowerCase()).equals(sourceCity) && (flight[2].toLowerCase()).equals(destinationCity))
	                {
	                	Flight desiredFlight=new Flight();
	                	desiredFlight.setDestinationCity(destinationCity);
	                	desiredFlight.setSourceCity(sourceCity);
	                	desiredFlight.setFare(Integer.parseInt(flight[3]));
	                	desiredFlight.setFlightNo(flight[0]);
	                	desiredFlight.setDuration(Integer.parseInt(flight[4]));
	                	allFlights.add(desiredFlight);
	                }
	                
	               
	               // System.out.println(line);

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        csvFile = "/Users/avisingh3/Downloads/SpiceJet_Flights.csv";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	            	
	                String[] flight = line.split(cvsSplitBy);

	                if((flight[1].toLowerCase()).equals(sourceCity) && (flight[2].toLowerCase()).equals(destinationCity))
	                {
	                	Flight desiredFlight=new Flight();
	                	desiredFlight.setDestinationCity(destinationCity);
	                	desiredFlight.setSourceCity(sourceCity);
	                	desiredFlight.setFare(Integer.parseInt(flight[3]));
	                	desiredFlight.setFlightNo(flight[0]);
	                	desiredFlight.setDuration(Integer.parseInt(flight[4]));
	                	allFlights.add(desiredFlight);
	                }
	                
	               
	               // System.out.println(line);

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        csvFile = "/Users/avisingh3/Downloads/SpiceJet_Flights.csv";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	            	
	                String[] flight = line.split(cvsSplitBy);

	                if((flight[1].toLowerCase()).equals(sourceCity) && (flight[2].toLowerCase()).equals(destinationCity))
	                {
	                	Flight desiredFlight=new Flight();
	                	desiredFlight.setDestinationCity(destinationCity);
	                	desiredFlight.setSourceCity(sourceCity);
	                	desiredFlight.setFare(Integer.parseInt(flight[3]));
	                	desiredFlight.setFlightNo(flight[0]);
	                	desiredFlight.setDuration(Integer.parseInt(flight[4]));
	                	allFlights.add(desiredFlight);
	                }
	                
	               
	               // System.out.println(line);

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
	      return allFlights;  
	}

}
