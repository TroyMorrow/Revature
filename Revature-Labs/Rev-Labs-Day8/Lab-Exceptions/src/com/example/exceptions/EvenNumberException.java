package com.example.exceptions;

public class EvenNumberException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You cannot input an even number.";
	}
	
}
