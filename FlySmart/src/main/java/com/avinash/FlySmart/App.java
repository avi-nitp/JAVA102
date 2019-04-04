package com.avinash.FlySmart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.avinash.model.Flight;
import com.avinash.service.GetAllAvailableFlights;
import com.avinash.service.GetAllAvailableFlightsImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  GetAllAvailableFlights getflights=new GetAllAvailableFlightsImpl();
    	String sourceCity,destinationCity;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Source City");
    	sourceCity=sc.next();
    	System.out.println("Enter Source City");
        destinationCity=sc.next();
        System.out.println("Showing All Flights between "+sourceCity+" and "+destinationCity);
        
    	Runnable r1=()->
    	{
    		System.out.println(getflights.flightsSortByPrice(sourceCity.toLowerCase(), destinationCity.toLowerCase()));
    	};
    	
    	Runnable r2=()->
    	{
    		System.out.println(getflights.flightsSortByPrice("Delhi".toLowerCase(), "Bangalore".toLowerCase()));
    	};
     
//       ArrayList<Flight>allflights= getflights.flightsSortByPrice(sourceCity.toLowerCase(), destinationCity.toLowerCase());
//       Iterator<Flight>itr=allflights.iterator();
//       while(itr.hasNext())
//       {
//    	   System.out.println(itr.next());
//       }
    	
    	List<Runnable>list=new ArrayList<>();
    	list.add(r1);
    	list.add(r2);
    	ExecutorService pool=Executors.newFixedThreadPool(2);
    	for(Runnable task:list)
    		pool.execute(task);
    	pool.shutdown();
    }
}
