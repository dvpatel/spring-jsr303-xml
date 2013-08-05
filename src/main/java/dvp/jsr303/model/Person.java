package dvp.jsr303.model;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import dvp.jsr303.constraints.Phone;

/**
 * 
 * Sample model class representing a "Person"
 * See META-INF/validation-person.xml file for JSR-303 constraints.
 * @author Dipesh Patel
 *
 */
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String firstname ;
	private String lastname ;	
	private String email ;
	private int age ;
	private String phone ;
	private Address address;
			
	/*
	 * Setter for Person's first name.
	 * @param inp first name.
	 */
	public void setFirstname(String firstname) {		
				
		this.firstname = firstname ;		
	}
	
	/*
	 * Getter for Person's first name.
	 * @return person's first name
	 */	
	public String getFirstname() {

		return this.firstname ;		
		
	}
		
	/*
	 * Setter for Person's last name.
	 * @param inp last name.
	 */
	public void setLastname(String lastname) {		
		this.lastname = lastname ;		
	}
	
	/*
	 * Getter for Person's last name.
	 * @return person's last name
	 */	
	public String getLastname() {
		return this.lastname ;		
	}
	
	/*
	 * Setter for Person's email address.
	 * @param inp email address. 
	 */
	public void setEmail(String email) {		
		this.email = email ;		
	}
	
	/*
	 * Getter for Person's email address.
	 * @return person's email address
	 */		
	public String getEmail() {
		return this.email ;		
	}

	/*
	 * Setter for Person's age.
	 * @param inp age. 
	 */
	public void setAge(Integer age) {		
		this.age = age ;		
	}

	/*
	 * Getter for Person's age.
	 * @return person's age 
	 */	
	public Integer getAge() {
		return this.age ;		
	}

	/*
	 * Setter for Person's phone number, US only.
	 * @param inp phone number (US only). 
	 */
	public void setPhone(String phone) {		
		this.phone = phone ;		
	}
	
	/*
	 * Getter for Person's phone number, US format.
	 * @return person's phone number
	 */		
	public String getPhone() {
		return this.phone ;		
	}

	/*
	 * Setter for Person's Address.
	 * @param inp Address object. 
	 */
	public void setAddress(Address address) {		
		this.address = address ;		
	}
	
	/*
	 * Getter for Person's Address.
	 * @return person's Address
	 */		
	public Address getAddress() {
		return this.address ;		
	}
		
}