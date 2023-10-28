package com.promineotech;

public class SpacedLogger implements Logger {

	@Override
	 public void log(String messageLog) {
char[] messageLogArray  = messageLog.toCharArray();

	String messageLog;
	for (int i = 0; i < messageLog.length(); i++)	{	
	System.out.print(messageLogArray[i] + space);
				}		
}
	@Override
	public void error(String messageError) {
	for (char M : messageError.toCharArray())	{
	String spacedError = M + space;		
	System.out.print("ERROR: " + spacedError);
	}
	
}
}			
				
		
