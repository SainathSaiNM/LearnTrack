package com.airtribe.learntrack.service;

import java.util.ArrayList;

import com.airtribe.learntrack.constants.AppConstants;
import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.repository.CourseRepository;

public class CourseService {
	private CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public Course createCourse(
            String name, String description, int duration) {

        if (name == null || name.trim().isEmpty()) {
        	throw new InvalidInputException(
        	        AppConstants.COURSE_NAME_REQUIRED        	        
        	    );
        }

        if (duration <= 0) {
        	throw new InvalidInputException(
        	        AppConstants.INVALID_DURATION
            );
        }

        Course course = new Course(name, description, duration);
        repository.save(course);
        return course;
    }

    public Course findCourse(int id) {
        return repository.FindById(id);
    }

    public ArrayList<Course> getAllCourses() {
        return repository.findAll();
    }
}
