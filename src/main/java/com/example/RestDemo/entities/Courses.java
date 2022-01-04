package com.example.RestDemo.entities;

public class Courses {
	
	private int id;
	private String name;
	private String aurthor;
	private int price;
	
	public Courses(int id, String name, String aurthor, int price) {
		super();
		this.id = id;
		this.name = name;
		this.aurthor = aurthor;
		this.price = price;
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

	public String getAurthor() {
		return aurthor;
	}

	public void setAurthor(String aurthor) {
		this.aurthor = aurthor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", aurthor=" + aurthor + ", price=" + price + "]";
	}
	
	
	
	

}
