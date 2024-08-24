package com.ordex.meet.patel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentController {
	public static void main(String[] args) {

		byte[] img = null;
		Mentor harshsir = new Mentor("Harsh", "Shah", "Java Developer", "harshshah.ordex@gmail.com", "9976532456");

		List<Student> ls = new ArrayList<>();
//		ls.add(s1);
//		ls.add(s2);
//		ls.add(s3);
//		ls.add(s4);

//		s1.setMentor(harshsir);
//		s2.setMentor(harshsir);
//		s3.setMentor(harshsir);
//		s4.setMentor(harshsir);
		harshsir.setStudent(ls);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			session.persist(harshsir);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
			session.close();
		}
	}
}
