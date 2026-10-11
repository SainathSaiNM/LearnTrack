package com.airtribe.learntrack.service;

import java.util.ArrayList;

import com.airtribe.learntrack.constants.AppConstants;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.repository.StudentRepository;

public class StudentService {

	  private StudentRepository repository;

	    public StudentService(StudentRepository repository) {
	        this.repository = repository;
	    }

	    public Student registerStudent(
	            String firstName, String lastName,
	            String email, String batch) {

	        if (firstName == null || firstName.trim().isEmpty()) {
	        	throw new InvalidInputException(
	        	        AppConstants.FIRST_NAME_REQUIRED
	        	    );
	        }

	        Student student = new Student(firstName, lastName, email, batch);
	        repository.save(student);
	        return student;
	    }

	    public Student findStudent(int id) {
	        Student student = repository.findById(id);

	        if (student == null) {
	            throw new EntityNotFoundException(
	                AppConstants.STUDENT_NOT_FOUND
	            );
	        }

	        return student;
	    }

	    public ArrayList<Student> getAllStudents() {
	        return repository.findAll();
	    }
}
