package com.controller;

import java.util.ArrayList;
import java.util.List;

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
		//Create Project
		Projects p1= new Projects();
		p1.setPname("Ecommerse Website");
		
		Projects p2 = new Projects();
		p2.setPname("Hotel Management Software");
		
		Projects p3 = new Projects();
		p3.setPname("Chat-box App");
		
		// Create Admin
		
		Admin admin1 = new Admin();
		admin1.setAname("Admin1");
		
		// Create Mentor
		Mentors harshsir = new Mentors();
		harshsir.setMname("Harsh Shah");

		Mentors shailimam = new Mentors();
		shailimam.setMname("Shaili Shah");
		
		Mentors vrajsir = new Mentors();
		vrajsir.setMname("Vraj sir");

		// Create Students
		Students meet = new Students();
		meet.setSname("Meet Patel");
		meet.setSemail("imeet2002@gmail.com");
		meet.setSmobile("9687084888");
		meet.setField("Java Developer");
		
		Students rahul = new Students();
		rahul.setSname("Rahul Parmar");
		rahul.setSemail("rahulparmar@gmail.com");
		rahul.setSmobile("7016083880");
		rahul.setField("MERN Stack Developer");

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

		List<Students> studentList1 = new ArrayList<>();
		studentList1.add(meet);
		studentList1.add(dhrumil);
		
		List<Mentors> mentorList1 = new ArrayList<>();
		mentorList1.add(harshsir);
		
		// Add Students to Mentor
		
		admin1.assignStudents(studentList1, mentorList1);
		admin1.assignStudents(List.of(rohan, rahul), List.of(shailimam));

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;

		try {
			session = factory.openSession();
			tx = session.beginTransaction();

			session.persist(p1);
			session.persist(p2);
			session.persist(p3);
			
			harshsir.assignProject(meet, p3);
			harshsir.assignProject(dhrumil, p1);
			shailimam.assignProject(rohan, p2);
			
			session.persist(shailimam);
			session.persist(harshsir);
			session.persist(vrajsir);
			session.persist(rohan);
			session.persist(admin1);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}
