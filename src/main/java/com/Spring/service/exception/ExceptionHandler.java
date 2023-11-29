package com.Spring.service.exception;


	public class ExceptionHandler {

	    public static void logException(Exception e) {
	        // Logic to log the exception, such as printing to the console, logging to a file, or sending an alert
	    }

	    public static String getFriendlyMessage(Exception e) {
	        // Logic to convert the exception to a user-friendly message
	        return "An error occurred: " + e.getMessage();
	    }

}
