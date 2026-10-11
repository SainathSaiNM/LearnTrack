package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.util.IdGenerator;

public class Student extends Person {
    private String batch;
    private boolean active;
	
	public Student(String firstName, String lastName, String email, String batch) {
		super(IdGenerator.getStudentIdCounter(), firstName, lastName, email);
		
		this.batch = batch;
		this.active = true;
	}
    
	public Student( String firstName, String lastName, String batch) {
		super(IdGenerator.getStudentIdCounter(),firstName,lastName,null);
		this.batch = batch;
		this.active = true;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
    
	@Override
	public String getDisplayName() {
		return "Student : "+ super.getDisplayName();
	}
	
}
