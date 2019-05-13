package com.prototype;

public class Person implements Cloneable {

	private String firstName;
	private String lastName ;
	
	public Person() {
		
	}
	
	
	public Person(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return String.format("FirstName :\t\t%s \n LastName :\t\t%s\n", firstName, lastName);
	}
}

