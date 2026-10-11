package com.airtribe.learntrack.service;

import java.util.ArrayList;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.enums.EnrollmentStatus;
import com.airtribe.learntrack.repository.CourseRepository;
import com.airtribe.learntrack.repository.EnrollmentRepository;
import com.airtribe.learntrack.repository.StudentRepository;

public class EnrollmentService {
	 private EnrollmentRepository enrollmentRepository;
	    private StudentRepository studentRepository;
	    private CourseRepository courseRepository;

	    public EnrollmentService(
	            EnrollmentRepository enrollmentRepository,
	            StudentRepository studentRepository,
	            CourseRepository courseRepository) {

	        this.enrollmentRepository = enrollmentRepository;
	        this.studentRepository = studentRepository;
	        this.courseRepository = courseRepository;
	    }

	    public Enrollment enrollStudent(int studentId, int courseId) {

	        Student student = studentRepository.findById(studentId);
	        Course course = courseRepository.FindById(courseId);

	        if (student == null) {
	            throw new IllegalArgumentException("Student not found");
	        }

	        if (course == null) {
	            throw new IllegalArgumentException("Course not found");
	        }

	        Enrollment enrollment = new Enrollment(studentId, courseId);
	        enrollmentRepository.save(enrollment);
	        return enrollment;
	    }

	    public ArrayList<Enrollment> getAllEnrollments() {
	        return enrollmentRepository.findAll();
	    }

	    public void completeEnrollment(int enrollmentId) {
	        Enrollment enrollment =
	                enrollmentRepository.findById(enrollmentId);

	        if (enrollment == null) {
	            throw new IllegalArgumentException("Enrollment not found");
	        }

	        enrollment.setStatus(EnrollmentStatus.COMPLETED);
	    }
}
