package br.com.estatistica.common.exception;

public class ApplicationException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	private Exception exceptionParent;

	public ApplicationException(Exception aExceptionParent) {
		
		exceptionParent = aExceptionParent;
		
	}

	public Exception getExceptionParent() {
		
		return exceptionParent;
		
	}
	
	
	public ApplicationException(String strMessageKey) {
		
		super(strMessageKey);
		
	}

    public ApplicationException(String strMessageKey, Throwable t)
	{
	    
    	super(strMessageKey);
	    
	}

	
}
