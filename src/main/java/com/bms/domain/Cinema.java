package com.bms.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Cinema {
	
	private int id;
	private String name;
	private int numscreens;
	private String location;
	private String city;
	public Cinema(int id, String name, int numscreens, String location, String city) {
		super();
		this.id = id;
		this.name = name;
		this.numscreens = numscreens;
		this.location = location;
		this.city = city;
	}
	public Cinema(ResultSet rs) throws SQLException {
		super();
		this.id = rs.getInt("id");
		this.name = rs.getString("name");
		this.numscreens = rs.getInt("numscreens");
		this.location = rs.getString("location");
		this.city = rs.getString("city");
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
	public int getNumscreens() {
		return numscreens;
	}
	public void setNumscreens(int numscreens) {
		this.numscreens = numscreens;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
