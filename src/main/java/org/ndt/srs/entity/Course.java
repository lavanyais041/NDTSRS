package org.ndt.srs.entity;

public class Course 
{
	int courseId;
	String courseName;
	
	public int getCourseId() 
	{
		return courseId;
	}
	public void setCourseId(int courseId) 
	{
		this.courseId = courseId;
	}
	public String getCourseName() 
	{
		return courseName;
	}
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}
	
	public Course()
	{
		
	}
	
	public Course(int courseId, String courseName) 
	{
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	@Override
	public String toString()
	{
		return "Course [courseId=" + courseId + ", courseName=" + courseName+ "]";
	}
	
	
}
