package com.HAH.demo.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HAH.demo.dto.Classes;
import com.HAH.demo.dto.Registration;
import com.HAH.demo.dto.Student;
import com.HAH.demo.repo.RegistrationRepo;
import com.HAH.demo.repo.StudentRepo;

@Service
public class RegistrationService {
	
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private RegistrationRepo registrationRepo;
	
	public Registration register(Classes classes,Student student,LocalDate date) {
		var registerStudent = studentRepo.create(student);
		
		return registrationRepo.create(new Registration(0, classes, registerStudent, date));
	}

}
