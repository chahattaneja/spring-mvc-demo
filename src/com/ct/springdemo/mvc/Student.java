package com.ct.springdemo.mvc;

public class Student {
	private String firstName;
	private String lastName;
	private Country country;
	private Language favouriteLanguage;
	
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
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Language getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(Language favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " " + country + " " + favouriteLanguage;
	}
	
}
