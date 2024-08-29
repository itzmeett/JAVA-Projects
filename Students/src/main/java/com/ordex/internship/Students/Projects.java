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
@Table(name = "Projects")
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Project_id")
	private int pid;
	@Column(name = "Project_name")
	private String pname;

	@OneToMany(mappedBy = "project", cascade=CascadeType.ALL)
	private List<Students> student = new ArrayList<>();

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(String pname) {
		super();
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
}
