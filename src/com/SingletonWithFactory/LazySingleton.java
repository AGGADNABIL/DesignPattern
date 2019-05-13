package com.SingletonWithFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazySingleton {

	private static LazySingleton instance;
	private static List<Vehicule> vhs=Stream.of(new Moto(), new Car()).collect(Collectors.toList());
	private  static boolean delayMe =true;
	private LazySingleton() {
	}
	
	public static LazySingleton getInstance() {
		if(instance==null)
		{
			synchronized (LazySingleton.class) {
				if (instance==null) {
					if(delayMe=true) {
						delayMe=false;
						try {
							Thread.currentThread();
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					instance= new LazySingleton();
				}
			}
			
		}
		
		return instance;
	}
	
	public static void addInstance(Vehicule v) {
		vhs.add(v);
	}
	public void printData() {
		vhs.forEach(System.out::println);
		System.out.println("============");
	}
}
