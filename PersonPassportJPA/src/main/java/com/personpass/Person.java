package com.personpass;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person_info")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(name="Name")
	private String name;
	@Column(name="Address")
	private String address;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="pass_id",unique=true)
	//@MapsId     //IT map the pass_id and id column and make it as one column in database
	private Passport passport;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="drive_id",unique=true)
	private DriveLIC dlicence;
	
	
	
	
	public Person(String name, String address, Passport passport,DriveLIC dlicence) {
		super();
		this.name = name;
		this.address = address;
		this.passport = passport;
		this.dlicence =dlicence;
	}
	
	
	public Person() {
		super();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	public DriveLIC getDlicence() {
		return dlicence;
	}


	public void setDlicence(DriveLIC dlicence) {
		this.dlicence = dlicence;
	}
	
	
	
	
	
	

}
