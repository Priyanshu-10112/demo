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

}
