package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.HAH.demo.service.DemoService;

@SpringJUnitConfig(locations = "classpath:application.xml")
public class DemoTest {

	@Autowired
	DemoService demoService;
	
	@Test
	void demoTest() {
		demoService.demoService("Hi","I'm from Myanmar","One Day I will come US");
		demoService.createStudent();
	}
}
