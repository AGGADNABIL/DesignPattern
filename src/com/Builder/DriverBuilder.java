package com.Builder;

public class DriverBuilder {

	public static void main(String[] args) {
		
		Builder builder= new Builder();
		Person person = builder
		.and(p -> {
			p.firstName="NABIL";
			p.lastName ="AGGAD";
	  }).build();
		
		System.out.println(person.toString());
	}
}
