package com.promineotech;

public class SpacedLogger implements Logger {

	@Override
	 public void log(String messageLog) {
	for (int i = 0; i < messageLog.length(); i++)	{	
	System.out.print(messageLog.charAt(i) + space);
				}		
}
	@Override
	public void error(String messageError) {
		System.out.print("ERROR: " );
		for (int i = 0; i < messageError.length(); i++)	{	
			System.out.print(messageError.charAt(i) + space);
						}		
	}
	}
			
		
