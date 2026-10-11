package com.airtribe.learntrack;


import java.time.LocalDate;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.enums.CourseStatus;
import com.airtribe.learntrack.enums.EnrollmentStatus;
import com.airtribe.learntrack.repository.CourseRepository;
import com.airtribe.learntrack.repository.EnrollmentRepository;
import com.airtribe.learntrack.repository.StudentRepository;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.util.IdGenerator;

public class Main {


		 public static void main(String[] args) {

		        StudentRepository studentRepository =
		                new StudentRepository();

		        CourseRepository courseRepository =
		                new CourseRepository();

		        EnrollmentRepository enrollmentRepository =
		                new EnrollmentRepository();

		        StudentService studentService =
		                new StudentService(studentRepository);

		        CourseService courseService =
		                new CourseService(courseRepository);

		        EnrollmentService enrollmentService =
		                new EnrollmentService(
		                    enrollmentRepository,
		                    studentRepository,
		                    courseRepository
		                );

		        Student student = studentService.registerStudent(
		                "Sainath", "NM",
		                "sainath@example.com", "Java-2026"
		        );

		        Course course = courseService.createCourse(
		                "Core Java",
		                "Java fundamentals and OOP",
		                12
		        );

		        Enrollment enrollment = enrollmentService.enrollStudent(
		                student.getId(), course.getId()
		        );

		        System.out.println("===== LEARNTRACK =====");

		        System.out.println("\nSTUDENT");
		        System.out.println(student.getId() + " - "
		                + student.getDisplayName());

		        System.out.println("\nCOURSE");
		        System.out.println(course.getId() + " - "
		                + course.getCourseSummary());

		        System.out.println("\nENROLLMENT");
		        System.out.println(enrollment.getEnrollmentSummary());

		        enrollmentService.completeEnrollment(enrollment.getId());

		        System.out.println("\nAfter completing enrollment:");
		        System.out.println(enrollment.getEnrollmentSummary());
		 
	}

}
