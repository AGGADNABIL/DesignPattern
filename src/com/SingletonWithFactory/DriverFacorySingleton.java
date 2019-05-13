package com.SingletonWithFactory;

public class DriverFacorySingleton {
	
	 public static void main(String[] args) {
		
		 VehiculeFactory vehiculeFactory=new VehiculeFactory();
		 // add l'instance taxi to list of singleton
		 LazySingleton.addInstance(new Taxi());
		 // registre taxi in vehiculeFactry map.
		 vehiculeFactory.register("taxi",Taxi::new);
		 vehiculeFactory.register("moto",Moto::new);
		 vehiculeFactory.register("car",Car::new);
		 
		 vehiculeFactory.create("taxi").affiche();
		 vehiculeFactory.create("moto").affiche();
		 vehiculeFactory.create("car").affiche();
		 
		 
	}
}
