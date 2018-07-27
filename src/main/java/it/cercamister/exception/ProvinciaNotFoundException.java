package it.cercamister.exception;

public class ProvinciaNotFoundException extends IstatException {
	
	private static final long serialVersionUID = -4371234567250509912L;

	protected ProvinciaNotFoundException() {
	}

	public ProvinciaNotFoundException(String message) {
		super(message);
	}

	public ProvinciaNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProvinciaNotFoundException(Throwable cause) {
		super(cause);
	}
}
