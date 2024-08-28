package com.ordex.internship.Students;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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

	@ManyToOne
	@JoinColumn(name = "mentor_id")
	private Mentors mentors;

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

	public Mentors getMentors() {
		return mentors;
	}

	public void setMentors(Mentors mentors) {
		this.mentors = mentors;
	}

}
