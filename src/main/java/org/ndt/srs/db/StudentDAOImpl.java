package org.ndt.srs.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ndt.srs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO
{
    @Autowired
	private DBManager dBManager;
	
	@Override
	public boolean createstudent(Student s) 
	{
		String sql = "insert into  student(firstName,lastName,fatherName,motherName,gender,dateOfBirth,qualification,mailid,mobileNumber) values(?,?,?,?,?,?,?,?,?)";
		String sql1 = "insert into address(studentId,line1,city,state,zipcode) values (?,?,?,?,?)";
		 int row=0;
		 int row1=0;
		 int flag=0;
		 Connection conn=dBManager.getConnection();
		 PreparedStatement ps;
		 PreparedStatement ps1;
		 int studid = 0;
		 int addressId = 0;
		 ResultSet rs;
		 ResultSet rs1;
		 
		 try 
		 {
			 
			ps = conn.prepareStatement(sql);
			ps.setString(1,s.getFirstName());
			ps.setString(2,s.getLastName());
			ps.setString(3,s.getFatherName());
			ps.setString(4,s.getMotherName());
			ps.setString(5,s.getGender());
			ps.setString(6,s.getDateOfBirth());
			ps.setString(7,s.getQualification());
			ps.setString(8,s.getMailId());
			ps.setString(9,s.getMobileNum());
			row=ps.executeUpdate();
			rs=ps.getGeneratedKeys();
			if(row>0)
			{
				if(rs.next())
				{
					studid=rs.getInt(1);
				}
			}
			
			ps1=conn.prepareStatement(sql1);
			ps1.setInt(1,studid);
			ps1.setString(2,s.getAddress().getLine1());
			ps1.setString(3,s.getAddress().getCity());
			ps1.setString(4,s.getAddress().getState());
			ps1.setString(5,s.getAddress().getZipcode());
			
			if(row>0)
			{
			row1=ps1.executeUpdate();
			}
			rs1=ps1.getGeneratedKeys();
			if(row1>0)
			{
				if(rs1.next())
				{
					addressId=rs1.getInt(1);
				}
			}
			
			
		}
		
		 catch (SQLException e)
		 {
			
			e.printStackTrace();
		}
		return addressId>0;
	}

}
