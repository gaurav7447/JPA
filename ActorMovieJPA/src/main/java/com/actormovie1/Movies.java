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
@Table(name="movie_info")
public class Movies {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name",nullable=false)
	private String name;
	@Column(name="IMDB",nullable=false)
	private double imdb;
	@Column(name="YOP",nullable=false)
	private int yop;
	
	@ManyToMany(cascade= {CascadeType.PERSIST})
	@JoinTable( 
			name="movie_actor",
			joinColumns= {@JoinColumn(name="movie_id")},
			inverseJoinColumns = {@JoinColumn(name="actor_id")}
			
		 )	
	private Set<Actors> actors =new HashSet<Actors>();
	
	
	
	public Movies() {
		super();
	}



	public Movies(String name, double imdb, int yop) {
		super();
		this.name = name;
		this.imdb = imdb;
		this.yop = yop;
		
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



	public double getImdb() {
		return imdb;
	}



	public void setImdb(double imdb) {
		this.imdb = imdb;
	}



	public int getYop() {
		return yop;
	}



	public void setYop(int yop) {
		this.yop = yop;
	}



	public Set<Actors> getActors() {
		return actors;
	}



	public void setActors(Set<Actors> actors) {
		this.actors = actors;
	}
	
	
	


}
















