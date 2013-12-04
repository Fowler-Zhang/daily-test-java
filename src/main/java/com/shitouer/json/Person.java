package com.shitouer.json;

/**
 * @author fowler
 * @since Nov 25, 2013
 * 
 */
public class Person {
	String name;
	int age;
	Company company;

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	public Person(String name, int age, Company company) {
		this.name = name;
		this.age = age;
		this.company = company;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}