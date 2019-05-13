package com.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazySingleton {

	Random random =new Random();
	private String [] LETTRES = {"AA","BB","CC","DD"};
	private List<String> list=Arrays.asList(LETTRES);
	//Stream.of("AA","BB","CC","DD").collect(Collectors.toList());
	private static LazySingleton instance ;
	
	private LazySingleton() {
		Collections.shuffle(list);	
	}
	
	public static LazySingleton getInstance() {
		if(instance==null)
			instance = new LazySingleton();
		
		return instance;
	}
	
	public void printData(){
		list.forEach(System.out::println);
	}
	
//	@Override
//	public int hashCode() {
//		return super.hashCode()+getRandom(1,1000);
//	}
//	
//	public int getRandom(int min , int max) {
//		return random.nextInt((max - min)+1)+min;
//	}
}
