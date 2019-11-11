package org.example.demo.model;

public class Personne {

	private String name;
	private short age;
	private String city;
	
	public Personne() {
	}
	
	public Personne(String n, short a) {
		this.name=n;
		this.age=a;
	}
	
	public Personne(String n, short a, String c) {
		this.name=n;
		this.age=a;
		this.city=c;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
