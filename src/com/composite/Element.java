package com.composite;

public class Element implements Component {
	@Override
	public void operation(String color) {
		System.out.println("c'est un element : " + color);
	}

}
