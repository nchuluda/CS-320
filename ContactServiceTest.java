// Nathan Chuluda
// CS-320-T2646 Software Test Automation& QA 21EW2
// Project One
// November 27, 2021

package contact;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAdd() {
		ContactService cs = new ContactService();
		cs.add("12345678", "John", "Smith", "3132561234", "2627 Edwin St");
	}
	
	@Test
	void testAddIdAlreadyExists() {
		ContactService cs = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		cs.add("12345678", "John", "Smith", "3132561234", "2627 Edwin St");
		//Duplicate ContactId Throws IllegalArgumentExeption
		cs.add("12345678", "Wayne", "Newton", "8181234567", "45 Church St");
		});
	}
	
	@Test
	void testRemove() {
		ContactService cs = new ContactService();
		cs.add("000444", "John", "Smith", "3132561234", "2627 Edwin St");
		cs.remove("000444");
	}
	
	@Test
	void testRemoveIdNotFound() {
		ContactService cs = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		//ContactId 111222 Doesn't Exist and Throws IllegalArgumentExeption
		cs.remove("111222");
		});
	}
	
	@Test
	void testEditFirstName() {
		ContactService cs = new ContactService();
		cs.add("12121212", "John", "Smith", "3132561234", "2627 Edwin St");
		cs.editFirstName("12121212", "Jonathan");
	}
	
	@Test
	void testEditFirstNameIdNotFound() {
		ContactService cs = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		//ContactId 0123 Doesn't Exist and Throws IllegalArgumentExeption
		cs.editFirstName("0123", "Jonathan");
		});
	}
	
	@Test
	void testEditLastName() {
		ContactService cs = new ContactService();
		cs.add("123123", "John", "Smith", "3132561234", "2627 Edwin St");
		cs.editLastName("123123", "Jones");
	}
	
	@Test
	void testEditLastNameIdNotFound() {
		ContactService cs = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		//ContactId 0124 Doesn't Exist and Throws IllegalArgumentExeption
		cs.editLastName("0124", "Jonathan");
		});
	}
	
	@Test
	void testEditPhone() {
		ContactService cs = new ContactService();
		cs.add("234234", "John", "Smith", "3132561234", "2627 Edwin St");
		cs.editPhone("234234", "3106862222");
	}
	
	@Test
	void testEditPhoneIdNotFound() {
		ContactService cs = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		//ContactId 0125 Doesn't Exist and Throws IllegalArgumentExeption
		cs.editPhone("0125", "3106862222");
		});
	}
	
	@Test
	void testEditAddress() {
		ContactService cs = new ContactService();
		cs.add("345345", "John", "Smith", "3132561234", "2627 Edwin St");
		cs.editAddress("345345", "33 Ivy Court");
	}
	
	@Test
	void testEditAddressIdNotFound() {
		ContactService cs = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		//ContactId 0126 Doesn't Exist and Throws IllegalArgumentExeption
		cs.editAddress("0126", "33 Ivy Court");
		});
	}
}