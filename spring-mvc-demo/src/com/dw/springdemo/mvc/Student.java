package com.dw.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private  String firstName;
	private  String lastName;
	private  String country;
	private  String favoriteLanguage;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private  String[] operatingSystems;
	
	public Student() {
		
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("MR", "Morocco");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("EN", "England");
		countryOptions.put("IN", "India");
		countryOptions.put("BL", "Belgium");
		countryOptions.put("NL", "Netherland");
		countryOptions.put("IT", "Italia");
		countryOptions.put("PO", "Portugal");
		countryOptions.put("SP", "Spain");
		countryOptions.put("AR", "Argentina");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("US", "Unites State of America");
		countryOptions.put("RS", "Russia");
		countryOptions.put("IL", "Island");
		countryOptions.put("CN", "Canada");
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) { 
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
    
	
	
}
