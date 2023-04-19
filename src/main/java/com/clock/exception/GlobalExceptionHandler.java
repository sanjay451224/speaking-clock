package com.clock.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clock.model.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(DateTimeFormatterException.class)
	@ResponseBody
	public ErrorResponse datetimeFormaterException(DateTimeFormatterException e) {
		 
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage("Date is not valid format");
		return errorResponse;
		
	}

}
