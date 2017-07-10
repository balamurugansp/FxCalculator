/**
 * 
 */
package com.anz.fxcalc.exception;

 

/**
 * @author balamurugan
 *
 */
public class CurrencyNotSupportedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3504209370866087933L;

	public CurrencyNotSupportedException() {
		super();
	}

	public CurrencyNotSupportedException(String message) {
		super(message);
	}

	public CurrencyNotSupportedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CurrencyNotSupportedException(Throwable cause) {
		super(cause);
	}
}
