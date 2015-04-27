package midterm2;

import java.util.ArrayList;

public class Customer {
	
	//Declare all the variables
	private String MiddleInit;
	private String LastName;
	private boolean Gender;
	private String Address;
	private String City;
	private String State;
	private String Zip;
	
	public Customer() {
	}
	
	public Customer(String firstName, String middleInit, String lastName,
			boolean gender, String address, String city, String state, String zip) {
		super();
		FirstName = firstName;
		MiddleInit = middleInit;
		LastName = lastName;
		Gender = gender;
		Address = address;
		City = city;
		State = state;
		Zip = zip;
	}
	//java generates getters and setters for us
	String FirstName;
	
	public String getMiddleInit() {
		return MiddleInit;
	}

	public void setMiddleInit(String middleInit) {
		MiddleInit = middleInit;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}

	public boolean isGender() {
		return Gender;
	}

}
