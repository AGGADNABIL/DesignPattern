package com.factory;

public class DriverFactory {

	public static void main(String[] args) {
		
		ViheculeFactory viheculeFactory=new ViheculeFactory();
		viheculeFactory.Registre("moto",Moto::new);
		viheculeFactory.Registre("car",Car::new);
		
		viheculeFactory.create("moto").affiche();
		viheculeFactory.create("car").affiche();
	}

}
