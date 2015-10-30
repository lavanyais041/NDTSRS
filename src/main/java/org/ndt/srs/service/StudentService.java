package org.ndt.srs.service;

import org.ndt.srs.db.StudentDAO;
import org.ndt.srs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{

	@Autowired
	private StudentDAO studentDAO;
	
	public boolean createstudent(Student s)
	{
		
		return studentDAO.createstudent(s);
		
	}
	
	
}
