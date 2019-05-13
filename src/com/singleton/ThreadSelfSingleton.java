package com.singleton;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreadSelfSingleton {
	
	//private String [] LETTRES= {"A","B","C","D"};

	private List<String> list =Stream.of("A","B","C","D").collect(Collectors.toList());
	private static ThreadSelfSingleton instance;
	private static boolean delayMe=true;
	
	private ThreadSelfSingleton() {
		Collections.shuffle(list);
	}
	
	
	public static ThreadSelfSingleton getInstance() {
		if(instance==null)
		{
			synchronized (ThreadSelfSingleton.class) {
				if(instance==null) {
					if(delayMe=true) {
						delayMe=false;
						Thread.currentThread();
						try {
							Thread.sleep(1000);
							
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						instance=new ThreadSelfSingleton();
					}
				}
				
			}
			
			
		}	
		return instance;
			
	}
	
	
	public void printData() {
		list.forEach(System.out::println);
	}
}
