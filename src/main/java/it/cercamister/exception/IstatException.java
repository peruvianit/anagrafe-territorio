package it.cercamister.exception;

public class IstatException extends RuntimeException {
	
	private static final long serialVersionUID = -4371234567250509912L;

	protected IstatException() {
	}

	public IstatException(String message) {
		super(message);
	}

	public IstatException(String message, Throwable cause) {
		super(message, cause);
	}

	public IstatException(Throwable cause) {
		super(cause);
	}
}
