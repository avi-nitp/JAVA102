package com.myapp.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;
public class TestLambda {

	public static void main(String[] args) {
		
		List<Customer>list=Arrays.asList(
				new Customer(1,"Name1",45),
				new Customer(4,"Name2",35),
				new Customer(2,"Name3",26),
				new Customer(3,"Name4",28));
		
		Stream<Customer>myStream=(list.stream().filter(o->o.getAge()>30));
		OptionalDouble avg=myStream.mapToInt(o->o.getAge()).average();
		double ageAvg=avg.getAsDouble();
		System.out.println(avg+" "+ageAvg);
	}
	
     

}
