//Author: Brittany Winters
//Date: 09-23-2021
//Course ID: CS-320-T1021
//Description: Contact Class creates and stores contact information

package module3;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	//contact variables
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private final String contactID; 
	private static AtomicLong idGenerator = new AtomicLong();
	
	//constructor
	public Contact(String firstName, String lastName, String address, String phone) {
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
		
	//first name cannot be longer than 10 characters and cannot be null
		
	if(firstName == null || firstName.isBlank()) {
		this.firstName = "NULL";
	} else if(firstName.length() > 10) {
		this.firstName = firstName.substring(0, 10);
	} else {
		this.firstName = firstName;
	}
		
	//last name cannot be longer than 10 characters and cannot be null
	if(lastName == null || lastName.isBlank()) {
		this.lastName = "NULL";
	} else if(lastName.length() > 10) {
		this.lastName = lastName.substring(0, 10);
	} else {
		this.lastName = lastName;
	}
	//phone must be exactly 10 digits and cannot be null
	if (phone == null ||phone.isBlank() || phone.length() != 10) {
		this.phone = "5555555555";
		} else {
		this.phone = phone;
		}
	
	//address cannot be longer than 30 characters and cannot be null
	if (address == null || address.isBlank()) {
		this.address = "NULL";
		} else if(address.length() > 30) {
		this.address = address.substring(0,30);
		} else {
		this.address = address;
		}
		
	}

	//Getters
	public String getContactID() {
		return ContactID();
		}

		private String ContactID() {
		// TODO Auto-generated method stub
		return null;
	}

		public String getFirstName() {
		return firstName;
		}

		public String getLastName() {
		return lastName;
		}

		public String getPhone() {
		return phone;
		}

		public String getAddress() {
		return address;
		}

		//SETTERS

		public void setFirstName(String firstName) {
	if (firstName == null || firstName.isBlank()) {
		this.firstName = "NULL";

		//first name cannot be longer than 10 characters 
	} else if(firstName.length() > 10) {
		this.firstName = firstName.substring(0, 10);
	} else {
		this.firstName = firstName;
		}
	}
			
		//last name cannot be longer than 10 characters 
		public void setLastName(String lastName) {
		if (lastName == null || lastName.isBlank()) {
		this.lastName = "NULL";
	} else if(lastName.length() > 10) {
		this.lastName = lastName.substring(0,10);
	} else {
		this.lastName = lastName;
		}
	}

		public void setNumber(String number) {
		if (number == null || number.isBlank() || number.length() != 10) {
		this.phone = "5555555555";
	} else {
		this.phone = number;
		}
	}

		public void setAddress(String address) {
		if (address == null || address.isBlank()) {
		this.address = "NULL";
	} else if(address.length() > 30) {
		this.address = address.substring(0,30);
	} else {
		this.address = address;
		
		}
	}

		public void setPhone(String updatedString) {
			
		}	
	
	
	
}