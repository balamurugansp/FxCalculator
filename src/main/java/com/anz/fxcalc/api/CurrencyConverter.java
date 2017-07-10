/**
 * 
 */
package com.anz.fxcalc.api;

import java.text.DecimalFormat;
import java.util.logging.Logger;

import com.anz.fxcalc.exception.CurrencyNotSupportedException;
import com.anz.fxcalc.pojo.Currency;
import com.anz.fxcalc.pojo.CurrencyPair;
import com.anz.fxcalc.service.EndPointFactory;
import com.anz.fxcalc.service.ServiceEndPoint;
import com.anz.fxcalc.util.CurrencyUtil;

/**
 * @author balamurugan
 *
 */
public class CurrencyConverter implements Converter{
	


	static Logger log = Logger.getLogger(CurrencyConverter.class.getName());
	private  ServiceEndPoint endPointFactory;
	public CurrencyConverter() {
		 endPointFactory = new EndPointFactory();
	}

	public Double convertCurrency(String moneyAmount, String fromCurrency, String toCurrency)
			throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		log.info("From Currency="+ fromCurrency+". To Currency = "+toCurrency);	
		return this.convertCurrency(Double.parseDouble (moneyAmount),CurrencyUtil.fromString(fromCurrency), CurrencyUtil.fromString(toCurrency));
	
	}
	
	public Double convertCurrency(Double moneyAmount, Currency fromCurrency, Currency toCurrency)
			throws CurrencyNotSupportedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Double amount = new Double(0.0);
		log.info("From Currency="+ fromCurrency+". To Currency = "+toCurrency);		
		 
		if (fromCurrency == null || toCurrency == null) {
			throw new IllegalArgumentException("Convert currency takes 2 arguments!");
		} else if (fromCurrency.equals(toCurrency)) {
			amount = moneyAmount;
		} else if (fromCurrency.equals(ServiceEndPoint.baseCurrency)) {
			String currVal=this.getCurrencyValue(fromCurrency, toCurrency);
			log.info("Currency Value="+currVal );
			amount = endPointFactory.convertFromBaseCurrency(moneyAmount, toCurrency,false,currVal);
		} else if (toCurrency.equals(ServiceEndPoint.baseCurrency)) {
			String currVal=this.getCurrencyValue(fromCurrency, toCurrency);
			log.info("Currency Value="+ currVal);
			amount = endPointFactory.convertToBaseCurrency(moneyAmount, fromCurrency,true,currVal);
		} else {
			String currVal=this.getCurrencyValue(fromCurrency, toCurrency);
			Double intermediateAmount=0.0;
			if(currVal!=null)
			{
				log.info("Currency Value="+ currVal);
				if(currVal.equals("D")){
						intermediateAmount = endPointFactory.convertToBaseCurrency(moneyAmount, fromCurrency,false,currVal);
						log.info("intermediateAmount"+intermediateAmount);
						amount = endPointFactory.convertFromBaseCurrency(intermediateAmount, toCurrency,true,currVal);
				}
				else if(currVal.equals("INV")){
	 				intermediateAmount = endPointFactory.convertToBaseCurrency(moneyAmount, fromCurrency,false,currVal);
	 				log.info("intermediateAmount"+intermediateAmount);
	 				amount = endPointFactory.convertFromBaseCurrency(intermediateAmount, toCurrency,true,currVal);
				}
				else if(currVal.equals("USD")){
					intermediateAmount = endPointFactory.convertToBaseCurrency(moneyAmount, fromCurrency,true,currVal);
					amount =endPointFactory.convertFromBaseCurrency(intermediateAmount, toCurrency,false,"D");
				}
			}
				else{
					 log.severe ("Unable to find rate for"+ fromCurrency +"/"+toCurrency);
					 throw new CurrencyNotSupportedException(" Unable to find rate for"+ fromCurrency +"/"+toCurrency);
				}
		}
		log.info("Result="+amount);
		DecimalFormat df = new DecimalFormat("###.##");
		return Double.valueOf(df.format(amount));
	}
	
	private   String getCurrencyValue(Currency fromCurrency, Currency toCurrency){
		String value= fromCurrency.toString()+"_"+toCurrency.toString();
		CurrencyPair pair = new CurrencyPair();
		String val= pair.getCurrencyTable().get(value);
		return val;
		
	}
 
}
