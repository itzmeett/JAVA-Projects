package com.ordex.internship.Students;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Admin_id")
	private int aid;
	@Column(name = "Admin_name")
	private String aname;

//	@OneToMany(mappedBy = "mentor", cascade = CascadeType.ALL)
//	private List<Students> student = new ArrayList<>();

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String aname) {
		super();
		this.aname = aname;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	// method for assign a mentors to the students

//	public void assignStudents(Students s, Mentors m) {
//		if (!student.contains(s)) {
//			System.out.println("Admin need to firstly assign a student");
//		}
//		student.getMentor().add(m);
//		m.getStudent().add(s);
//	}
	
	public void assignStudents(List<Students> students, List<Mentors> mentors) {
		for (Students student : students) {
			for (Mentors mentor : mentors) {
//				if (student.getMentors() == null) {
//					student.setMentors(new ArrayList<>());
//				}
//				if (mentor.getStd() == null) {
//					mentor.setStd(new ArrayList<>());
//				}
				student.getMentors().add(mentor);
				mentor.getStd().add(student);
			}
		}
	}
}
