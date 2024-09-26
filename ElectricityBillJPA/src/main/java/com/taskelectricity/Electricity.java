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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="elect_info")
public class Electricity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Location")
	private String location;
	@Column(name="Owner")
	private String owner;
    @OneToMany(mappedBy="electricity",cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	
	private Set<Electricity> electricity = new HashSet<Electricity>();
	
	
	
	public Electricity(String name, String location, String owner,Set<Electricity> electricity) {
		super();
		this.name = name;
		this.location = location;
		this.owner = owner;
		this.electricity = electricity;
		
	}
	public Electricity() {
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Set<Electricity> getElectricity() {
		return electricity;
	}
	public void setElectricity(Set<Electricity> electricity) {
		this.electricity = electricity;
	}
	
	
	
	

}
