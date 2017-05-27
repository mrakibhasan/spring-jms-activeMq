package com.jms.producer.model;

import org.springframework.stereotype.Component;

@Component
public class Vendor {
	private String vendorName;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String email;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		if (null == vendorName || vendorName.isEmpty()) {
			vendorName = "vendorName";
		}
		this.vendorName = vendorName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (null == firstName || firstName.isEmpty()) {
			firstName = "firstName";
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (null == lastName || lastName.isEmpty()) {
			lastName = "lastName";
		}
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (null == address || address.isEmpty()) {
			address = "address";
		}
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if (null == city || city.isEmpty()) {
			city = "city";
		}
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		if (null == state || state.isEmpty()) {
			state = "state";
		}
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		if (null == zipCode || zipCode.isEmpty()) {
			zipCode = "zipCode";
		}
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (null == phoneNumber || phoneNumber.isEmpty()) {
			phoneNumber = "phoneNumber";
		}
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (null == email || email.isEmpty()) {
			email = "email";
		}
		this.email = email;
	}

	@Override
	public String toString() {
		return "Vendor [vendorName=" + getVendorName() + ", firstName="
				+ getFirstName() + ", lastName=" + getLastName() + ", address="
				+ getAddress() + ", city=" + getCity() + ", state="
				+ getState() + ", zipCode=" + getZipCode() + ", phoneNumber="
				+ getPhoneNumber() + ", email=" + getEmail() + "]";
	}

}
