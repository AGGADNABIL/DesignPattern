package com.adapter;

import java.util.Objects;
import java.util.logging.Filter;

@FunctionalInterface
public interface Logger {
	void log(String msg);
}
