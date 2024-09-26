package com.actormovie1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actor_data")
public class Actors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "Age", nullable = false)
	private int age;
	
	@ManyToMany(mappedBy = "actors")
	private Set<Movies> movies = new HashSet<Movies>();

	public Actors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actors(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public Set<Movies> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movies> movies) {
		this.movies = movies;
	}
	
	
	

}