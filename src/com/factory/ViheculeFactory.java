package com.factory;

import java.util.HashMap;
import java.util.function.Supplier;

public class ViheculeFactory {

	private HashMap<String,Supplier<Vehicule>> map=new HashMap<>();
	
	public Vehicule create(String name)  {
		Supplier<Vehicule> supplier=map.get(name);
		if(supplier==null){
			throw new RuntimeException("vehicule non trouvé");
			}
		
		return supplier.get();
	}
	
	public void Registre(String name , Supplier<Vehicule> v) {
		map.put(name, v);
	}
}
