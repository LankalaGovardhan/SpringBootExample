package com.example.demo;

public class Employe {

	private String name;
	private String age;
	private String dob;
	private String email;

	public Employe(String string, String string2, String string3, String string4) {
		
		this.name=string;
		this.age=string2;
		this.dob=string3;
		this.email=string4;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", dob=" + dob + ", email=" + email + "]";
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
