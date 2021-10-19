//Author: Brittany Winters
//Date: 09-23-2021
//Course ID: CS-320-T1021
//Description: Unit Tests For Contact Test Class 


package test;

import org.junit.jupiter.api.Test;

import module3.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

@Test
@DisplayName("Contact ID cannot have more than 10 characters")
void testContactIDWithMoreThanTenCharacters() {
Contact contact = new Contact("FirstName","LastName","Phone","Address");
if(contact.getContactID().length() > 10) {
fail("Contact ID has more than 10 characters.");
}
}

@Test
@DisplayName("Contact First Name cannot have more than 10 characters")
void testContactFirstNameWithMoreThanTenCharacters() {
Contact contact = new Contact("MoreThan10Characters","LastName","Phone","Address");
if(contact.getFirstName().length() > 10) {
fail("First Name has more than 10 characters.");
}
}

@Test
@DisplayName("Contact Last Name cannot have more than 10 characters")
void testContactLastNameWithMoreThanTenCharacters() {
Contact contact = new Contact("FirstName","MoreThan10Characters","Phone","Address");
if(contact.getLastName().length() > 10) {
fail("Last Name has more than 10 characters.");
}
}

@Test
@DisplayName("Contact phone number is exactly 10 characters")
void testContactNumberWithMoreThanTenCharacters() {
Contact contact = new Contact("FirstName", "LastName", "55555555555","Address");
if(contact.getPhone().length() != 10) {
fail("Phone number length does not equal 10.");
}
}

@Test
@DisplayName("Contact address cannot have more than 30 characters")
void testContactAddressWithMoreThanThirtyCharacters() {
Contact contact = new Contact("FirstName","LastName","Phone","123456789 More Than 10 Characters"
+ "123456789 More Than 10 Characters More Than 10 Characters");
if(contact.getAddress().length() > 30) {
fail("Address has more than 30 characters.");
}
}

@Test
@DisplayName("Contact First Name shall not be null")
void testContactFirstNameNotNull() {
Contact contact = new Contact(null, "LastName","Phone","Address");
assertNotNull(contact.getFirstName(), "First name was null.");
}

@Test
@DisplayName("Contact Last Name shall not be null")
void testContactLastNameNotNull() {
Contact contact = new Contact("FirstName", null,"Phone","Address");
assertNotNull(contact.getLastName(), "Last name was null.");
}

@Test
@DisplayName("Contact Phone Number shall not be null")
void testContactPhoneNotNull() {
Contact contact = new Contact("FirstName", "LastName", null,"Address");
assertNotNull(contact.getPhone(), "Phone was null.");
}

@Test
@DisplayName("Contact Address shall not be null")
void testContactAddressNotNull() {
Contact contact = new Contact("FirstName", "LastName","Phone",null);
assertNotNull(contact.getAddress(), "Address was null.");
}
}