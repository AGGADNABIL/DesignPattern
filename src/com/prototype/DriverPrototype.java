package com.prototype;

public class DriverPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

		Prototype prototype = new Prototype();

		Person p = prototype.clonePerson(1);
		Person p2 = prototype.clonePerson(1);
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println("======================");
		System.out.println(p2.hashCode());
		System.out.println(p2.toString());
	}
}
