package com.airtribe.learntrack.util;

public class IdGenerator {
   private static int studentIdCounter = 100;
   private static int courseIdCounter = 200;
   private static int enrollmentIdCounter = 300;
   
public static int getStudentIdCounter() {
	return ++studentIdCounter;
}
public static int getCourseIdCounter() {
	return ++courseIdCounter;
}
public static int getEnrollmentIdCounter() {
	return ++enrollmentIdCounter;
}
   
   
}
