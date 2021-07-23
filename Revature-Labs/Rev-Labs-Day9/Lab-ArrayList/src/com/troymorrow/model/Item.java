package com.troymorrow.model;

public class Item {
	private int id;
	private String description;
	
	public Item() {}
	public Item(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public String description() {
		return description;
	}
	
	public void setDescription() {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + "]";
	}
	
	
}
