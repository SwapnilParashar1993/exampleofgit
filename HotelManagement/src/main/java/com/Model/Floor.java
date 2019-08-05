package com.Model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Floor")
//@EnableAutoConfiguration
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Floor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="number")
	private Integer number;
	
	@OneToMany(mappedBy = "floor", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Room> rooms = new HashSet<Room>();

	
	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Floor(long id, Integer number, HashSet<Room> rooms) {
		super();
		this.id = id;
		this.number = number;
		this.rooms = rooms;
	}

	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	

}
