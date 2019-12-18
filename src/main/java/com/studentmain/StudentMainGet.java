package com.studentmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;

public class StudentMainGet {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("student.xml");
		StudentRepository sr = (StudentRepository) ac.getBean("studentRepository");
		
		System.out.println("select by id = 3");
		StudentEntity se = sr.getById(3l);
		System.out.println(se.toString());
		
		

	}

}
