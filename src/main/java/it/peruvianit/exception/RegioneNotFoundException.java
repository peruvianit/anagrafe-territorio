package it.peruvianit.exception;

public class RegioneNotFoundException extends IstatException {
	
	private static final long serialVersionUID = -4371234567250509912L;

	protected RegioneNotFoundException() {
	}

	public RegioneNotFoundException(String message) {
		super(message);
	}

	public RegioneNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public RegioneNotFoundException(Throwable cause) {
		super(cause);
	}
}
