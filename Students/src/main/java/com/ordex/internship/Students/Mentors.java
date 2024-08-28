package com.ordex.internship.Students;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mentors")
public class Mentors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Mentor_id")
	private int mid;
	@Column(name = "Mentor_name")
	private String mname;
	
	@OneToMany(mappedBy="mentors", cascade=CascadeType.ALL)
	private List<Students> std = new ArrayList<>();

	public Mentors() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mentors(String mname) {
		super();
		this.mname = mname;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}
	
	//Students getters and setters
	
	public void addStudents(Students student) { // student is a reference of Students class
		std.add(student); //'std' is students list reference
		student.setMentors(this);
	}
	
	public void setStudents(List<Students> std) {
		this.std = std;
	}
	
	//parameterized constructor

	public void setMname(String mname) {
		this.mname = mname;
	}
	
	


}
