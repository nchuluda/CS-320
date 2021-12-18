// Nathan Chuluda
// CS-320-T2646 Software Test Automation& QA 21EW2
// Project One
// November 27, 2021

package contact;

import java.util.ArrayList;

public class ContactService {

	private static ArrayList<Contact> contactList = new ArrayList<>();
	
	//Add Function
	public void add(String tContactId,
						   String tFirstName,
						   String tLastName,
						   String tPhone,
						   String tAddress) {
		for (Contact eachContact: contactList) {
			if (eachContact.getContactId().equalsIgnoreCase(tContactId)) {
				throw new IllegalArgumentException("Contact ID already exists.");
			}
		}
		Contact newContact = new Contact(tContactId, tFirstName, tLastName, tPhone, tAddress);
		contactList.add(newContact);
	}
	
	//Remove Function
	public void remove(String tContactId) {
		int foundIndex = -1;
		for (Contact eachContact: contactList) {
			if (eachContact.getContactId().equalsIgnoreCase(tContactId)) {
				foundIndex = contactList.indexOf(eachContact);
			}
		}
		if (foundIndex >= 0) {
			contactList.remove(foundIndex);
		} else {
			throw new IllegalArgumentException("ContactId not found.");
		}
	}
	
	
	//Edit Functions
	public void editFirstName(String tContactId, String tFirstName) {
		boolean contactFound = false;
		for (Contact eachContact: contactList) {
			if (eachContact.getContactId().equalsIgnoreCase(tContactId)) {
				contactFound = true;
				eachContact.setFirstName(tFirstName);
			}
		}
		if (!contactFound) {
			throw new IllegalArgumentException("ContactId not found.");
		}
	}
	
	public void editLastName(String tContactId, String tLastName) {
		boolean contactFound = false;
		for (Contact eachContact: contactList) {
			if (eachContact.getContactId().equalsIgnoreCase(tContactId)) {
				contactFound = true;
				eachContact.setLastName(tLastName);
			}
		}
		if (!contactFound) {
			throw new IllegalArgumentException("ContactId not found.");
		}
	}
	
	public void editPhone(String tContactId, String tPhone) {
		boolean contactFound = false;
		for (Contact eachContact: contactList) {
			if (eachContact.getContactId().equalsIgnoreCase(tContactId)) {
				contactFound = true;
				eachContact.setPhone(tPhone);
			}
		}
		if (!contactFound) {
			throw new IllegalArgumentException("ContactId not found.");
		}
	}
	
	public void editAddress(String tContactId, String tAddress) {
		boolean contactFound = false;
		for (Contact eachContact: contactList) {
			if (eachContact.getContactId().equalsIgnoreCase(tContactId)) {
				contactFound = true;
				eachContact.setAddress(tAddress);
			}
		}
		if (!contactFound) {
			throw new IllegalArgumentException("ContactId not found.");
		}
	}
} 
