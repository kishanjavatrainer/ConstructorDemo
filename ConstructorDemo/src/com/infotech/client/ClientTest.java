package com.infotech.client;

import com.infotech.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		System.out.println(student1);
		
		Student student2 = new Student(10001, "Vijay");
		System.out.println(student2);
		Student student3 = new Student(100022, "KK", 99L);
		System.out.println(student3);
		
	}
}
