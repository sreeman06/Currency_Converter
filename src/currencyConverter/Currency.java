package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// Currency Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.86);
				this.exchangeValues.put("GBP", 0.74);
				this.exchangeValues.put("CHF", 0.80);
				this.exchangeValues.put("CNY", 7.17);
				this.exchangeValues.put("JPY", 147.70);
				this.exchangeValues.put("INR", 85.82);
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.17);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.87);
				this.exchangeValues.put("CHF", 0.93);	
				this.exchangeValues.put("CNY", 8.37);
				this.exchangeValues.put("JPY", 172.61);
				this.exchangeValues.put("INR", 100.27);
				break;
			case "Pound Sterling":
				this.exchangeValues.put("USD", 1.34);
				this.exchangeValues.put("EUR", 1.15);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.07);
				this.exchangeValues.put("CNY", 9.64);
				this.exchangeValues.put("JPY", 198.56);
				this.exchangeValues.put("INR", 115.37);
				break;
			case "Swiss Franc":
				this.exchangeValues.put("USD", 1.26);
				this.exchangeValues.put("EUR", 1.08);
				this.exchangeValues.put("GBP", 0.93);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 9.01);
				this.exchangeValues.put("JPY", 185.51);
				this.exchangeValues.put("INR", 107.78);
				break;
			case "Chinese Yuan ":
				this.exchangeValues.put("USD", 0.14);
				this.exchangeValues.put("EUR", 0.12);
				this.exchangeValues.put("GBP", 0.10);
				this.exchangeValues.put("CHF", 0.11);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 20.60);
				this.exchangeValues.put("INR", 11.97);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.0068);
				this.exchangeValues.put("EUR", 0.0058);
				this.exchangeValues.put("GBP", 0.0050);
				this.exchangeValues.put("CHF", 0.0054);
				this.exchangeValues.put("CNY", 0.049);
				this.exchangeValues.put("JPY", 1.000);
				this.exchangeValues.put("INR", 0.58);
				break;
			case "India rupee":
				this.exchangeValues.put("USD", 0.012);
				this.exchangeValues.put("EUR", 0.0100);
				this.exchangeValues.put("GBP", 0.0087);
				this.exchangeValues.put("CHF", 0.0093);
				this.exchangeValues.put("CNY", 0.084);
				this.exchangeValues.put("JPY", 1.72);
				this.exchangeValues.put("INR", 1.00);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("Pound Sterling", "GBP") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("Chinese Yuan ", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
		currencies.add( new Currency("India rupee", "INR") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}