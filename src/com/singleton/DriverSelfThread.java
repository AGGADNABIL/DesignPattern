package com.singleton;

public class DriverSelfThread {

	public static void main(String[] args) {
		
		new DataPrinter().start();
		new DataPrinter().start();	
	}
}

class DataPrinter extends Thread{
	
	@Override
	public void run() {
		ThreadSelfSingleton.getInstance().printData();
	}
}