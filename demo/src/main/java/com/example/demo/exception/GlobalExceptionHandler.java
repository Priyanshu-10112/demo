package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;

import com.example.demo.utility.ResponseStatus;
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseStatus handleUserNotFoundException(UserNotFoundException ex)
	{
		return new ResponseStatus(404,ex.getMessage());
	}
//	@ExceptionHandler(Exception.class)
//	public String demo(Exception e) 
//	{
//		return "Something went wrong";
//	}
}
