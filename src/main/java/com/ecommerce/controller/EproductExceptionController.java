package com.ecommerce.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import com.ecommerce.exception.ProductNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class EproductExceptionController {
	@ExceptionHandler(value = ProductNotFoundException.class)
	 public ResponseEntity<Object> exception(ProductNotFoundException
	exception) {
	 return new ResponseEntity<>("Product not found",
	HttpStatus.NOT_FOUND);
	 }
	
}
