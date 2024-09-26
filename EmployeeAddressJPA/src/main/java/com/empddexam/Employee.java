package com.empddexam;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empdata")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Department")
	private String dept;
	@Column(name="C_Address")
	private String caddress;
	@Column(name="Salary")
	private int salary;
	@Column(name="P_Address")
	@ElementCollection
	private List<Paddress> padd=new ArrayList<Paddress>();
	
	public Employee() {
		super();
	}

	public Employee(String name, String dept, String caddress, int salary, List<Paddress> padd) {
		super();
		this.name = name;
		this.dept = dept;
		this.caddress = caddress;
		this.salary = salary;
		this.padd = padd;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Paddress> getPadd() {
		return padd;
	}

	public void setPadd(List<Paddress> padd) {
		this.padd = padd;
	}
	
	
	
	
	

}
