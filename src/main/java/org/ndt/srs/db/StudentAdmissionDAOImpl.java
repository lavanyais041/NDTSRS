package org.ndt.srs.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ndt.srs.entity.Admission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentAdmissionDAOImpl implements StudentAdmissionDAO
{
    @Autowired
	private DBManager dBManager;
	@Override
	public boolean studentAdmission(Admission a) 
	{
		
		
		String sql ="insert into admission(studId,courseId,dateOfJoining) values(?,?,?)";
		int row=0;
		Connection conn=dBManager.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		int courseId = 0;
		
		try 
		{
			ps = conn.prepareStatement(sql);
			ps.setInt(1,a.getStudent().getStudentId());
			ps.setInt(2,a.getCourse().getCourseId());
			ps.setString(3,a.getDateOfJoining());
			row=ps.executeUpdate();
			rs=ps.getGeneratedKeys();
			if(row>0)
			{
				if(rs.next())
				{
					courseId=rs.getInt(1);
				}
			}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return courseId>0;
	}

}
