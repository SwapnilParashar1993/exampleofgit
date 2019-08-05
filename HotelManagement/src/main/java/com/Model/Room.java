 package com.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Room")
//@EnableAutoConfiguration
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Room {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="number")
	private long number;
	
	@Column(name="type")
	private String type;
	
	
	
	
	@ManyToOne     /*(fetch=FetchType.LAZY,optional=false)*/
    @JoinColumn(name="floor_id", referencedColumnName="id")
	@JsonBackReference
    private Floor floor;
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	


	public Floor getFloor() {
		return floor;
	}




	public void setFloor(Floor floor) {
		this.floor = floor;
	}




	public Room(long id, long number, String type, Floor floor) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.floor = floor;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	

}
