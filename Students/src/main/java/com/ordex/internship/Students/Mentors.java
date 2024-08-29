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
@Table(name = "Mentors")
public class Mentors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Mentor_id")
	private int mid;
	@Column(name = "Mentor_name")
	private String mname;

	@ManyToMany(mappedBy = "mentors", cascade = CascadeType.ALL)
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

	// Students getters and setters

	public List<Students> getStd() {
		return std;
	}

	public void setStd(List<Students> std) {
		this.std = std;
	}

	// parameterized constructor

	public void setMname(String mname) {
		this.mname = mname;
	}

	// Assign a project to student

//	public void assignProject(Students student, Projects project) {
//		try {
//			if (std.contains(student)) {
//				student.setProject(project);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	public void assignProject(Students student, Projects project) {
		if (std.contains(student) && student.getProject() == null) {
			student.setProject(project);
		}
	}
}
