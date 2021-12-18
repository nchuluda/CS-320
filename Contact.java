// Nathan Chuluda
// CS-320-T2646 Software Test Automation& QA 21EW2
// Project One
// November 27, 2021

package contact;

public class Contact {
	
	//Instance Variables
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Constructor  (Setter functions handle input validation)
	public Contact(String contactId, 
				   String firstName,
				   String lastName,
				   String phone,
				   String address) {
		
		setContactId(contactId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}
	
	//Accessors
	public String getContactId() {
		return contactId;
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
	
	//Mutators (ContactId is not updatable. Setter is for input validation.) 
	public void setContactId(String tContactId) {
		if (tContactId == null) {
			throw new NullPointerException();
		} else if (tContactId.length() > 10) {
			throw new IllegalArgumentException("Invalid Task ID");
		} else {
			contactId = tContactId;
		}
	}
	public void setFirstName(String tFirstName) {
		if (tFirstName == null) {
			throw new NullPointerException();
		} else if (tFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		} else {
			firstName = tFirstName;
		}
	}
	
	public void setLastName(String tLastName) {
		if (tLastName == null) {
			throw new NullPointerException();
		} else if (tLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		} else {
			lastName = tLastName;
		}
	}
	
	public void setPhone(String tPhone) {
		if (tPhone == null) {
			throw new NullPointerException();
		} else if (tPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		} else {
			phone = tPhone;
		}
	}
	
	public void setAddress(String tAddress) {
		if (tAddress == null) {
			throw new NullPointerException();
		} else if (tAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		} else {
			address = tAddress;
		}
	}
}
