package org.ndt.srs.service;

import org.ndt.srs.db.StudentAdmissionDAO;
import org.ndt.srs.entity.Admission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentAdmissionService 
{
    @Autowired
	private StudentAdmissionDAO studentAdmissionDao;
	
    public boolean studentAdmission(Admission a)
    {
		return studentAdmissionDao.studentAdmission(a);
    
    }
	
}
