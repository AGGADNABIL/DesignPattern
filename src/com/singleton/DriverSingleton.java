package com.singleton;

public class DriverSingleton {

	public static void main(String[] args) {
		
		LazySingleton single1 = LazySingleton.getInstance();
		LazySingleton single2 = LazySingleton.getInstance();
		
		System.out.println(single1.hashCode());
		single1.printData();
		System.out.println("=======================");
		
		System.out.println(single2.hashCode());
		single2.printData();
		
		
	}

}
