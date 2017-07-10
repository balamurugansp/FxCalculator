/**
 * 
 */
package com.anz.fxcalc.main;


import java.util.Arrays;

import com.anz.fxcalc.api.Converter;
import com.anz.fxcalc.api.CurrencyConverter;
import com.anz.fxcalc.exception.CurrencyNotSupportedException;

/**
 * @author balamurugan
 *
 */
public class FxCalculatorMain {

	/**
	 * @param args
	 * @throws CurrencyNotSupportedException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if (args.length ==4){
			System.out.println("1"+ args[0] + "2 "+args[1] + "3=" + args[2] + "4=" + args[3] );
		}
		else if (args.length <4){
			System.err.println(" Less no.of arguments" +Arrays.toString(args));
		}
		else if (args.length >4){
			System.err.println("Too much of arguments " + Arrays.toString(args) );
		}
		
		 
		Converter convert = new CurrencyConverter();
		Double a=convert.convertCurrency (args[1],args[0],args[3]);
		System.out.println(args[0] +" " + args[1] + "=" + args[3]+" " +a );
	}

}
