package com.ordex.meet.patel;

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
@Table(name="mentor")
public class Mentor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mid;
	@Column(name="mentor_fname")
	private String fname;
	
	@Column(name="mentor_lname")
	private String lname;
	
	private String role;
	
	@Column(name="mentor_email")
	private String email;
	
	@Column(name="mentor_mobile")
	private String mobile;
	
	@OneToMany(mappedBy="mentor" , cascade=CascadeType.ALL)
	List<Student> student;

	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mentor(String fname, String lname, String role, String email, String mobile) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.role = role;
		this.email = email;
		this.mobile = mobile;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
