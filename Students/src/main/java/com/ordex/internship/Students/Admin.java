package com.ordex.internship.Students;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
//	@Column(name = "Assign_Mentor_to_Student")
//	private String assign_Mentor;
	@Column(name = "To_the_Student")
	private String to_the_student;

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

	public String getAssign_mentor_To_Student() {
		return to_the_student;
	}

	public void setAssign_mentor_To_Student(String to_the_student) {
		this.to_the_student = to_the_student;
	}
}
