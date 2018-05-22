package com.sitdh.thesis.demo.resource;

public class Course {
	
	private String courseNumber;
	
	private String courseRun;
	
	private String courseName;
	
	public Course(String courseNumber, String courseRun, String courseName) {
		this.courseNumber = courseNumber;
		this.courseRun = courseRun;
		this.courseName = courseName;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseRun() {
		return courseRun;
	}

	public void setCourseRun(String courseRun) {
		this.courseRun = courseRun;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
