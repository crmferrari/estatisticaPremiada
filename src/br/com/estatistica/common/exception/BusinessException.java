package br.com.estatistica.common.exception;

public class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	private String message;
	
	public BusinessException(String aMessage) {
		message = aMessage;
	}

	public String getMessage() {
		return message;
	}	

}
