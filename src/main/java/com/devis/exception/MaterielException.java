package com.devis.exception;

public class MaterielException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public MaterielException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public MaterielException() {
		super();
	}

}
