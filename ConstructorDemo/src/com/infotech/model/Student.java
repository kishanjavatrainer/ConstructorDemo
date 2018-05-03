package com.infotech.model;

public class Student {

	private Integer rollNo;
	private String name;
	private Long marks;
	
	//Default Constructor
	//Constructor doesn't have a return type
	public Student() {
	}
	//Parameterized Constructor
	public Student(Integer rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
    //Parameterized Constructor
	public Student(Integer rollNo, String name, Long marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks="
				+ marks + "]";
	}
}
