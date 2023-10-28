package com.promineotech;

public class App  {

	public static void main(String[] args) {
		String messageLog = "Have a nice day";
		String messageError = "Interface not found";
		System.out.println(messageLog);

		AsteriskLogger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log(messageLog);
		asteriskLogger.error(messageError);
		
		SpacedLogger spacedLogger = new SpacedLogger();
		spacedLogger.log(messageLog);
		spacedLogger.error(messageError);
	}

	}