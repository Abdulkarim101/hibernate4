package com.student.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.student.entity.StudentEntity;

public class StudentRepository {

	private SessionFactory sessionFactory;

	public void save(StudentEntity student) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

	public StudentEntity getById(long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		StudentEntity se = new StudentEntity();
		session.getTransaction().commit();
		session.close();

		return se;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
