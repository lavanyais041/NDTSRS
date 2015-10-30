package org.ndt.srs.entity;

import java.sql.Blob;



public class Student 
{

	private int studentId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private String gender;
	private String dateOfBirth;
	private String qualification;
	private String mailId;
	private String mobileNum;
	private Blob photo;
	private Address address;
	
	
	public int getStudentId() 
	{
		return studentId;
	}
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getFatherName() 
	{
		return fatherName;
	}
	public void setFatherName(String fatherName) 
	{
		this.fatherName = fatherName;
	}
	public String getMotherName() 
	{
		return motherName;
	}
	public void setMotherName(String motherName)
	{
		this.motherName = motherName;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getDateOfBirth() 
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}
	public String getQualification() 
	{
		return qualification;
	}
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	public String getMailId() 
	{
		return mailId;
	}
	public void setMailId(String mailId)
	{
		this.mailId = mailId;
	}
	public String getMobileNum() 
	{
		return mobileNum;
	}
	public void setMobileNum(String mobileNum)
	{
		this.mobileNum = mobileNum;
	}
	public Blob getPhoto()
	{
		return photo;
	}
	public void setPhoto(Blob photo)
	{
		this.photo = photo;
	}
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public Student(int studentId, String firstName, String lastName,String fatherName, String motherName, String gender,String dateOfBirth, String qualification, String mailId,String mobileNum)
	{
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.mailId = mailId;
		this.mobileNum = mobileNum;
	}
	
	public Student(int studentId, String firstName, String lastName,String fatherName, String motherName, String gender,String dateOfBirth, String qualification, String mailId,String mobileNum, Address address) 
	{
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.mailId = mailId;
		this.mobileNum = mobileNum;
		this.address = address;
	}
	
	public Student()
	{
		
	}
	@Override
	public String toString()
	{
		return "Student [studentId=" + studentId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", qualification="
				+ qualification + ", mailId=" + mailId + ", mobileNum="
				+ mobileNum + ", photo=" + photo + ", address=" + address + "]";
	}
	
}
