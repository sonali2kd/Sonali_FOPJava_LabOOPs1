package com.greatlearning.email;
import java.util.Scanner;

public class Employee{
	
	Scanner sc = new Scanner(System.in);
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
