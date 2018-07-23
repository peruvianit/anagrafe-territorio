package it.peruvianit.exception;

public class ComuneNotFoundException2 extends IstatException {
	
	private static final long serialVersionUID = -4371234567250509912L;

	protected ComuneNotFoundException2() {
	}

	public ComuneNotFoundException2(String message) {
		super(message);
	}

	public ComuneNotFoundException2(String message, Throwable cause) {
		super(message, cause);
	}

	public ComuneNotFoundException2(Throwable cause) {
		super(cause);
	}
}
