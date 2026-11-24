package com.day4.ExceptionHandlingLab;

public class InvalidMarksException extends RuntimeException{
	public InvalidMarksException(String message) {
		super(message);
	}
}
