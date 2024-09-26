package com.studentinfo;

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
@Table(name="stu_info")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Course")
	private String course;
	@Column(name="official_email")
	private String official_email;
	@ElementCollection
	private List<PEmail> pe =new ArrayList<PEmail>();
	public Student() {
		super();
	}
	public Student(String name, int age, String course, String official_email, List<PEmail> pe) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
		//this.official_email = official_email;
		this.pe = pe;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getOfficial_email() {
		return official_email;
	}
	public void setOfficial_email(String official_email) {
		this.official_email = official_email;
	}
	public List<PEmail> getPe() {
		return pe;
	}
	public void setPe(List<PEmail> pe) {
		this.pe = pe;
	}
	
	

}
