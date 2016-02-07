//<<<<<<< HEAD
//
//public class BrowserException extends RuntimeException {
//
//	public BrowserException() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public BrowserException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
//
//	public BrowserException(Throwable cause) {
//		super(cause);
//		// TODO Auto-generated constructor stub
//	}
//
//	public BrowserException(String message, Throwable cause) {
//		super(message, cause);
//		// TODO Auto-generated constructor stub
//	}
//
//	public BrowserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//		// TODO Auto-generated constructor stub
//	}
//
//=======
/**
 * Represents an exceptional situation specific to this project.
 *
 * @author Robert C. Duvall
 */
public class BrowserException extends RuntimeException {
    // for serialization
    private static final long serialVersionUID = 1L;

    /**
     * Create an exception based on an issue in our code.
     */
    public BrowserException (String message, Object ... values) {
        super(String.format(message, values));
    }
    
    /**
     * Create an exception based on a caught exception with a different message.
     */
    public BrowserException (Throwable cause, String message, Object ... values) {
        super(String.format(message, values), cause);
    }

    /**
     * Create an exception based on a caught exception, with no additional message.
     */
    public BrowserException (Throwable exception) {
        super(exception);
    }
}
