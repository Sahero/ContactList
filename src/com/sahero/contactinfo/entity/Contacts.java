package com.sahero.contactinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_info")
public class Contacts {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="middle_name")
		private String middleName;

		@Column(name="last_name")
		private String lastName;

		@Column(name="email")
		private String email;
		
		@Column(name="phone_number")
		private String phoneNumber;

		@Column(name="address")
		private String address;
		
		@Column(name="date_of_birth")
		private String dateOfBirth;
		
		@Column(name="remarks")
		private String remarks;
		
		public Contacts(){}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getRemarks() {
			return remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		@Override
		public String toString() {
			return "Contacts [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
					+ lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address
					+ ", dateOfBirth=" + dateOfBirth + ", remarks=" + remarks + "]";
		}
		
		
		
		
}

