package com.airtribe.learntrack.repository;

import java.util.ArrayList;

import com.airtribe.learntrack.entity.Course;

public class CourseRepository {
     private ArrayList<Course> courses = new ArrayList<>();
     
     public void save(Course course) {
    	 courses.add(course);
     }
     public Course FindById(int id) {
    	 for(Course course : courses) {
    		 if(course.getId() == id) {
    			 return course;
    		 }    		 
    	 } 	 
    	 return null;
     }
     
     public ArrayList<Course> findAll(){
    	 return courses;
     }
}
