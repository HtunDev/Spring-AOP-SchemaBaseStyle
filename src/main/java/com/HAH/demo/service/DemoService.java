package com.HAH.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	public void demoService(String ... names) {
		System.out.println("This message from Demo Service");
		//throw new RuntimeException();
	}
}
