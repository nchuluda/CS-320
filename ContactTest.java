// Nathan Chuluda
// CS-320-T2646 Software Test Automation& QA 21EW2
// Project One
// November 27, 2021

package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345678", "John", "Smith", "3132561234", "2627 Edwin St");
		assertTrue(contact.getContactId().equals("12345678"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhone().equals("3132561234"));
		assertTrue(contact.getAddress().equals("2627 Edwin St"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123412341234", "John", "Smith", "3132561234", "2627 Edwin St");
		});
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact(null, "John", "Smith", "3132561234", "2627 Edwin St");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678", "Cassanndrah", "Smith", "3132561234", "2627 Edwin St");
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("12345678", null, "Smith", "3132561234", "2627 Edwin St");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678", "Johh", "Smithsonian", "3132561234", "2627 Edwin St");
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("12345678", "John", null, "3132561234", "2627 Edwin St");
		});
	}
	
	@Test
	void testPhoneWrongLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678", "Johh", "Smith", "313256123", "2627 Edwin St");
		});
	}
	
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("12345678", "John", "Smith", null, "2627 Edwin St");
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678", "Johh", "Smith", "3132561234", "2627 Edwin St, New York City, New York, 10001, United States");
		});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("12345678", "John", "Smith", "3132561234", null);
		});
	}

}