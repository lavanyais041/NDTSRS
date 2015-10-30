package org.ndt.srs.entity;

public class Admission 
{

	int admissionId;
	Course course;
	Student student;
	String dateOfJoining;
	
	public int getAdmissionId()
	{
		return admissionId;
	}
	public void setAdmissionId(int admissionId) 
	{
		this.admissionId = admissionId;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse(Course course)
	{
		this.course = course;
	}
	public Student getStudent()
	{
		return student;
	}
	public void setStudent(Student student) 
	{
		this.student = student;
	}
	public String getDateOfJoining()
	{
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) 
	{
		this.dateOfJoining = dateOfJoining;
	}
	
	public Admission()
	{
		
	}
	public Admission(int admissionId, Course course, Student student,String dateOfJoining) 
	{
		super();
		this.admissionId = admissionId;
		this.course = course;
		this.student = student;
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() 
	{
		return "Admission [admissionId=" + admissionId + ", course=" + course
				+ ", student=" + student + ", dateOfJoining=" + dateOfJoining
				+ "]";
	}
	
	
}
