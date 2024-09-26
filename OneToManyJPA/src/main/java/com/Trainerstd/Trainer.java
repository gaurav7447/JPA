package com.Trainerstd;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Trainer_info")
public class Trainer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int t_id;
	@Column(name="T_Name")
	private String name;
	@Column(name="T_Salary")
	private int salary ;
	@Column(name="T_Subject")
	private String subject;
	@OneToMany(mappedBy="trainer",cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	Set<Student> student = new HashSet<Student>();
	
	
	
	
	
	
	public Trainer() {
		super();
	}



	public Trainer(String name, int salary, String subject, Set <Student> student) {
		super();
		this.name = name;
		this.salary = salary;
		this.subject = subject;
		this.student = student;
	}







	public int getT_id() {
		return t_id;
	}



	public void setT_id(int t_id) {
		this.t_id = t_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public Set<Student> getStudent() {
		return student;
	}



	public void setStudent(Set<Student> student) {
		this.student = student;
	}




	
	
	
	
	

}
