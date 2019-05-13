package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private List<Component> list =new ArrayList<>();
	@Override
	public void operation(String color) {
		list.forEach(c -> c.operation(color));
	}
	public void add(Component c) {
		list.add(c);
	}
	public void remove(Component c) {
		list.remove(c);
	}
}
