package dvp.jsr303.model;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

/**
 * Sample object representing a person's address.
 * See META-INF/validation-address.xml file for JSR-303 constraints. 
 * @author Dipesh Patel
 *
 */
public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public String street ;
	public String city;
	public String state;
	public String zipcode ;
	public String country ;	
	
	/**
	 * Return person's street address.
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}	
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
		
	/**
	 * @return the state acronym
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}	
	
	/**
	 * @return the zip
	 */
	public String getZipcode() {
		return zipcode ;
	}
	
	/**
	 * @param zip the zip to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}	
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}	
}