package com.spring.cloud.security;

public class Employee {

	private int empId;
	private String name;
	private int age;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	
	public int getEmpId() {
		return empId;
	}
	public Employee(int empId, String name, int age, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}

