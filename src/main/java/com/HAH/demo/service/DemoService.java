package com.HAH.demo.service;

import org.springframework.stereotype.Service;

import com.HAH.demo.dto.Student;

@Service
public class DemoService {
	
	public void demoService(String ... names) {
		System.out.println("This message from Demo Service");
		//throw new RuntimeException();
	}
	
	public Student createStudent() {
		return new Student(1, "Htun Aung Hlaing", "09763651040", "htunaunghlaign177@gmail.com");
	}
	
	public int divided(int a, int b) {
		return a/b;
	}
}
