package com.adapter;


public interface LoggerWithLevel {
	
	void log(Level level , String msg);
	
	default Logger level(Level level) {
		return msg -> log(level, msg);
	}
}
