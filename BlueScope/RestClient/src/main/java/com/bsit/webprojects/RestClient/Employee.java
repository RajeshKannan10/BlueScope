package com.bsit.webprojects.RestClient;

public class Employee {
	
	private String name;
	private String roll;
	private int id;
	
	public Employee(String name, String roll, int id) {
		super();
		this.name = name;
		this.roll = roll;
		this.id = id;
	}

	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", roll=" + roll + ", id=" + id + "]";
	}

}
