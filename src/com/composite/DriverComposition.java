package com.composite;

public class DriverComposition {
	public static void main(String[] args) {	
		Composite c1= new Composite();
		Composite c2= new Composite();
	
		Element e1 = new Element();
		Element e2 = new Element();
		e1.operation("ROUGE1");
		e2.operation("ROUGE2");
		c1.add(e1);
		c1.add(e2);
		
		Element e3 = new Element();
		Element e4 = new Element();
		e3.operation("BLUE1");
		e4.operation("BLUE2");
		c2.add(e3);
		c2.add(e4);	
	}
}
