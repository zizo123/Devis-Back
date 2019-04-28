package com.devis.exception;

public class DevisException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public DevisException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public DevisException() {
		super();
	}

}
