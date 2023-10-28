package com.promineotech;

public class AsteriskLogger implements Logger {

	@Override
	 public void log(String messageLog) {
				System.out.println("***" + messageLog + "***");
			}
			@Override
			 public void error(String messageError) {
					System.out.println(asteriskLine);
					System.out.println(asterisk+ "Error: " +
								messageError+ asterisk);
					System.out.println(asteriskLine);
			}
	}
