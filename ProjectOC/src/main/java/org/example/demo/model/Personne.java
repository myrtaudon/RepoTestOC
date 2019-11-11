package org.example.demo.model;

public class Personne {

	private String name;
	private short age;
	
	public Personne() {
	}
	
	public Personne(String n, short a) {
		this.name=n;
		this.age=a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}
	
	
}
