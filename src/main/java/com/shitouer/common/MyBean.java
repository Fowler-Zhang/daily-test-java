package com.shitouer.common;

/**
 * @author fowler
 * @since Nov 14, 2013
 * 
 */
public class MyBean {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("Hello " + name + ".");
		return this.name;
	}
}
