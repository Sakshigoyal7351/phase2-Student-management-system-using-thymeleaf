package com.Day3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class demo {

	@Id
	private int id;
	private String name; 
	private String city;
	public demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public demo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "demo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
