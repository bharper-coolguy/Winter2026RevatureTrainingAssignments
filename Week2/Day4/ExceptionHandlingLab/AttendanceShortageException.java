package com.day4.ExceptionHandlingLab;

public class AttendanceShortageException extends Exception{
	public AttendanceShortageException(String message) {
		super(message);
	}
}
