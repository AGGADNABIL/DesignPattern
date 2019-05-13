package com.SingletonWithFactory;

import java.util.HashMap;
import java.util.function.Supplier;

public class VehiculeFactory {
	
	private HashMap<String,Supplier<Vehicule>> map=new HashMap<>();
	public void register(String name , Supplier<Vehicule> supplier) {
		map.put(name, supplier);
	}
	
	public Vehicule create(String name) {
		Supplier<Vehicule> supplier=map.get(name);
		if(supplier==null) throw new RuntimeException("Vehicule non trouvé.");
		return supplier.get();
	}
}
