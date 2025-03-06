package com.springCRUD.student_management_system.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RollNo;
	private String Name;
	@Column(name="%")
	private float percentage;
	@Column
	private String Branch;
	@Column
	private String Grade;
	
	
	
	
	public Student() {
		
	}
	
	public Student(String name, float percentage, String branch, String grade) {
		super();
		Name = name;
		this.percentage = percentage;
		Branch = branch;
		Grade = grade;
	}

	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", percentage=" + percentage + ", Branch=" + Branch
				+ ", Grade=" + Grade + "]";
	}
	
	
	

}
