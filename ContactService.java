//Author: Brittany Winters
//Date: 09-23-2021
//Course ID: CS-320-T1021
//Description: Contact Service Class maintains list of contacts

package module3;

import java.util.ArrayList;

public class ContactService {
	
	//Array to hold list of contacts
	public ArrayList<Contact> contactList = new ArrayList<Contact>();

	public void displayContactList() {
		for(int counter = 0; counter < contactList.size(); counter++) {
		System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
		System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
		System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
		System.out.println("\t Phone Number: " + contactList.get(counter).getPhone());
		System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
	}
	
	public void addContact(String firstName, String lastName, String phone, String address) {
		// Create the new contact
		Contact contact = new Contact(firstName, lastName, phone, address);
		contactList.add(contact);
	
	}
	
	//Using Contact ID, return a contact object
	//If a matching Contact ID is not found, return a contact object with default values
	public Contact getContact(String contactID) {
	Contact contact = new Contact(null,null,null,null);
	for(int counter = 0; counter < contactList.size(); counter++) {
	if(contactList.get(counter).getContactID().contentEquals(contactID)) {
	contact = contactList.get(counter);
	}
	}
	return contact;
	}

	//Delete contact.
	//Use the contactID to find the right contact to delete from the list
	
	public void deleteContact(String contactID) {
	for(int counter = 0; counter < contactList.size(); counter++) {
	if(contactList.get(counter).getContactID().equals(contactID)) {
	contactList.remove(counter);
	break;
	}
	if(counter == contactList.size()-1) {
	System.out.println("Contact ID: " + contactID + " not found.");
	}
	}
	}

	//Update the first name.
	public void updateFirstName(String updatedString, String contactID) {
	for(int counter = 0; counter < contactList.size(); counter++) {
	if(contactList.get(counter).getContactID().equals(contactID)) {
	contactList.get(counter).setFirstName(updatedString);
	break;
	}
	if(counter == contactList.size()-1) {
	System.out.println("Contact ID: " + contactID + " not found.");
	}
	}
	}

	//Update the last name.
	public void updateLastName(String updatedString, String contactID) {
	for(int counter = 0; counter < contactList.size(); counter++) {
	if(contactList.get(counter).getContactID().equals(contactID)) {
	contactList.get(counter).setLastName(updatedString);
	break;
	}
	if(counter == contactList.size()-1) {
	System.out.println("Contact ID: " + contactID + " not found.");
	}
	}
	}

	//Update the phone number.
	public void updatePhone(String updatedString, String contactID) {
	for(int counter = 0; counter < contactList.size(); counter++) {
	if(contactList.get(counter).getContactID().equals(contactID)) {
	contactList.get(counter).setPhone(updatedString);
	break;
	}
	if(counter == contactList.size()-1) {
	System.out.println("Contact ID: " + contactID + " not found.");
	}
	}
	}

	//Update the address.
	public void updateAddress(String updatedString, String contactID) {
	
	for(int counter = 0; counter < contactList.size(); counter++) {	
	if(contactList.get(counter).getContactID().equals(contactID)) {
	contactList.get(counter).setAddress(updatedString);
	break;
	}
	if(counter == contactList.size()-1) {
	System.out.println("Contact ID: " + contactID + " not found.");
	}}
	
	}
	
	
}
