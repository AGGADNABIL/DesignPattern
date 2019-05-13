package com.Builder;

import java.util.function.Consumer;

public class Builder {
	
	public String firstName ; 
	public String lastName ;
	
	public Builder and(Consumer<Builder> builder) {
		builder.accept(this);
		return this;
	}
	
	public Person build() {
		return new Person(firstName, lastName);
	}

	
}
