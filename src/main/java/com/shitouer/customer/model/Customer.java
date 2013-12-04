package com.shitouer.customer.model;

/**
 * @author fowler
 * @since Nov 14, 2013
 * 
 */
public class Customer {
	private int age;
	private int customerId;
	private String name;

	public int getAge() {
		return age;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

}
