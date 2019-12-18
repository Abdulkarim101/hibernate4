package com.studentmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;



public class StudentMain {

	
	
	public static void main(String[] args) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("student.xml");
		StudentRepository vr = (StudentRepository) act.getBean("studentRepository");
		
		StudentEntity se = new StudentEntity();
		se.setName("Tim");
		se.setCellPhone(703055575);
		se.setEmail("tim@gmail.com");
		
		
		vr.save(se);

	}

}
