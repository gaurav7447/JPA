package com.taskelectricity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
@Entity
@Table(name="Bill_info")
public class Bills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Customer_name")
	private String Customer_Name;
	@Column(name="Customer_address")
	private String Customer_address;
	@Column(name="Amount")
	private int amount;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="elect_id")
	private Electricity electricity;
	
	
	public Bills(String customer_Name, String customer_address, int amount, Electricity electricity) {
		super();
		Customer_Name = customer_Name;
		Customer_address = customer_address;
		this.amount = amount;
		this.electricity =  electricity;
	}
	public Bills() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getCustomer_address() {
		return Customer_address;
	}
	public void setCustomer_address(String customer_address) {
		Customer_address = customer_address;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Electricity getElectricity() {
		return electricity;
	}
	public void setElectricity(Electricity electricity) {
		this.electricity = electricity;
	}
	
	

}
