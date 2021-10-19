//Author: Brittany Winters
//Date: 09-23-2021
//Course ID: CS-320-T1021
//Description: Unit Tests For Contact Service Test Class 


package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import module3.Contact;
import module3.ContactService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

@Test
@DisplayName("Test to Update First Name.")
@Order(1)
void testUpdateFirstName() {
ContactService service = new ContactService();
service.addContact("Mary", "Morey", "5555551111", "555 west ave dr");
service.updateFirstName("Mark", "0");

service.displayContactList();
assertEquals("Mark",service.getContact("0").getFirstName(), "First name was not updated.");
}

@Test
@DisplayName("Test to Update Last Name.")
@Order(2)
void testUpdateLastName() {
ContactService service = new ContactService();
service.addContact("Mary.", "Morey", "5555551111", "555 west ave dr");
service.updateLastName("Larry", "2");
service.displayContactList();
assertEquals("Larry",service.getContact("2").getLastName(), "Last name was not updated.");
}

@Test
@DisplayName("Test to update phone number.")
@Order(3)
void testUpdatePhoneNumber() {
ContactService service = new ContactService();
service.addContact("Mary", "Morey", "5555551111", "555 west ave dr");
service.updatePhone("5555552222", "2");

service.displayContactList();
assertEquals("5555552222",service.getContact("4").getPhone(), "Phone number was not updated.");
}

@Test
@DisplayName("Test to update address.")
@Order(4)
void testUpdateAddress() {
ContactService service = new ContactService();
service.addContact("Mary", "Morey", "5555551111", "555 west ave");
service.updateAddress("555 east ave", "3");

service.displayContactList();
assertEquals("555 east ave",service.getContact("6").getAddress(), "Address was not updated.");
}

@Test
@DisplayName("Test to ensure that service correctly deletes contacts.")
@Order(5)
void testDeleteContact() {
ContactService service = new ContactService();
service.addContact("Mary.", "Morey", "5555551111", "555 west ave dr");
service.deleteContact("8");

//Ensure that the contactList is now empty by creating a new empty contactList to compare it with
ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();

service.displayContactList();
assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
}

@Test
@DisplayName("Test to ensure that service can add a contact.")
@Order(6)
void testAddContact() {
ContactService service = new ContactService();
service.addContact("Mary", "Morey", "5555551111", "555 west ave dr");

service.displayContactList();
assertNotNull(service.getContact("9"), "Contact was not added correctly.");
}

}