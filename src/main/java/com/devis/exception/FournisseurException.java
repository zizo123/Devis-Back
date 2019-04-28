package com.devis.exception;

public class FournisseurException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public FournisseurException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public FournisseurException() {
		super();
	}

}
