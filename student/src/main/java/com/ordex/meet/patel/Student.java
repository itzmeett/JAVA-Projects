package com.ordex.meet.patel;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private Date date;
	private int sem;
	private float spi;
	@Lob
	private byte[] image;
	
	@ManyToOne	
	private Mentor mentor;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Date date, int sem, float spi, byte[] image, Mentor mentor) {
		super();
		this.date = date;
		this.sem = sem;
		this.spi = spi;
		this.image = image;
		this.mentor = mentor;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public float getSpi() {
		return spi;
	}

	public void setSpi(float spi) {
		this.spi = spi;
	}
	
}
