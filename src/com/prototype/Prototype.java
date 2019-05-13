package com.prototype;

import java.util.HashMap;
import java.util.Map;

public class Prototype  {
 private static Map<Integer,Person> map =new HashMap<>();
 static {
	 map.put(1, new Person("NABIL", "AGGAD"));
	 map.put(2, new Person("ACHRAF", "CHARKI"));
 }
 
 public Person clonePerson(Integer id) throws CloneNotSupportedException{
	 Person p =map.get(id);
	 if (p!=null) {
		return (Person) p.clone() ;
	}
	 return null;
 }
}
