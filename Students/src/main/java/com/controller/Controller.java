package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ordex.internship.Students.Admin;
import com.ordex.internship.Students.Mentors;
import com.ordex.internship.Students.Projects;
import com.ordex.internship.Students.Students;

public class Controller {
	public static void main(String[] args) {
		System.out.println("Welcome to Ordex Internship Portal");

		// Create Mentor
		Mentors harshsir = new Mentors();
		harshsir.setMname("Harsh Shah");

		Mentors shailimam = new Mentors();
		shailimam.setMname("Shaili Shah");

		// Create Students
		Students meet = new Students();
		meet.setSname("Meet Patel");
		meet.setSemail("imeet2002@gmail.com");
		meet.setSmobile("9687084888");
		meet.setField("Java Developer");

		Students rohan = new Students();
		rohan.setSname("Rohan Patel");
		rohan.setSemail("rohanpatel34@gmail.com");
		rohan.setSmobile("8200567890");
		rohan.setField("ReactJs Developer");

		Students dhrumil = new Students();
		dhrumil.setSname("Dhrumil Shah");
		dhrumil.setSemail("dhrumilshah@gmail.com");
		dhrumil.setSmobile("8238238423");
		dhrumil.setField("Full Stack Developer");

		// Add Students to Mentor
		shailimam.addStudents(rohan);
		harshsir.addStudents(meet);
		harshsir.addStudents(dhrumil);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;

		try {
			session = factory.openSession();
			tx = session.beginTransaction();

			session.persist(harshsir);
			session.persist(shailimam);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}
