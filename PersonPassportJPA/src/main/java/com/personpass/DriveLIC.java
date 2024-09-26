package com.personpass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="drive_info")
public class DriveLIC {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int d_id;
	@Column(name="L_Number")
	private String licenceNumber;
	@Column(name="State")
	private String state;
	@OneToOne(mappedBy="dlicence")
	
	private Person person;

	public DriveLIC(String licenceNumber, String state, Person person) {
		super();
		this.licenceNumber = licenceNumber;
		this.state = state;
		this.person = person;
	}

	public DriveLIC() {
		super();
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
