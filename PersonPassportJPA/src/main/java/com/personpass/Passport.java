package com.personpass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport_info")
public class Passport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int p_id;
	@Column(name="Passport_Identity")
	private String p_iden;
	@OneToOne(mappedBy="passport")
	
	private Person person;
	
	
	public Passport() {
		super();
	}
	
	public Passport(String p_iden, Person person) {
		super();
		this.p_iden = p_iden;
		this.person = person;
	}
	
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_iden() {
		return p_iden;
	}
	public void setP_iden(String p_iden) {
		this.p_iden = p_iden;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
