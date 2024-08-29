package com.ordex.internship.Students;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id")
	private int sid;
	@Column(name = "Student_name")
	private String sname;
	@Column(name = "Student_email")
	private String semail;
	@Column(name = "Student_mobile")
	private String smobile;
	@Column(name = "Student_field")
	private String field;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Students_mentors", joinColumns = @JoinColumn(name = "Student_id"), inverseJoinColumns = @JoinColumn(name = "Mentor_id"))
	private List<Mentors> mentors = new ArrayList<>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	private Projects project;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String sname, String semail, String smobile, String field) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.smobile = smobile;
		this.field = field;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSmobile() {
		return smobile;
	}

	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	// mentor getters setters

	public List<Mentors> getMentors() {
		return mentors;
	}

	public void setMentors(List<Mentors> mentors) {
		this.mentors = mentors;
	}

	// project getters and setters

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}
}
