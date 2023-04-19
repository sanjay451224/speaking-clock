package com.clock.exception;

public class DateTimeFormatterException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DateTimeFormatterException() {
		super();
	}

	public DateTimeFormatterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DateTimeFormatterException(String message, Throwable cause) {
		super(message, cause);
	}

	public DateTimeFormatterException(String message) {
		super(message);
	}

	public DateTimeFormatterException(Throwable cause) {
		super(cause);
	}
	
	
	

}
