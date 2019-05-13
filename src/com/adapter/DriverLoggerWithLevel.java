package com.adapter;

public class DriverLoggerWithLevel {
	public static void main(String[] args) {
		
		LoggerWithLevel logger= (Level level, String msg) -> System.out.println(level +":\n "+msg);
		logger.log(Level.INFO,"how are you");			
		}

}