package com.promineotech;

public interface Logger {

	String asterisk = "***";
	String asteriskLine = "********************";
	String space = " ";
	int index = 0;

	
	 public void log(String messageLog);

	 public void error(String messageError);
}

