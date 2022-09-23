package bankaccount;

public class ThrowException extends Exception{

	 private String message;
	    
	    public ThrowException()
	    {
	        message = " ";
	    }
	    
	    public ThrowException(String message)
	    {
	        this.message = message;
	    }
	    
	    public String getMessage()
	    {
	        return message;
	    }
}
