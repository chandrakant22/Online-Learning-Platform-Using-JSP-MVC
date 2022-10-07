package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
	Connection con;
	private Connection getConnection() throws ClassNotFoundException,SQLException
	   {
		String db="jspmvc1";
		String url="jdbc:mysql://localhost:3306/"+db;
		String uname="root";
		String upass="abc123";
		
		   Class.forName("com.mysql.jdbc.Driver");
		  con=(Connection) DriverManager.getConnection(url,uname,upass);
		   return con;
		  }
	public int CourseCount() throws ClassNotFoundException, SQLException
	{
		String sql = "select count(*) from courses";
		con=getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count =rs.getInt(1);
		con.close();
	
		return count;
	}
	public  int insert(Course c) throws ClassNotFoundException,SQLException
	   {
		   int status=0;
		   con=getConnection();
		   PreparedStatement ps=con.prepareStatement("INSERT INTO courses(coursetitle, instructor, category, totalenroll, fees, imgurl) VALUES(?,?,?,?,?,?)");
		   ps.setString(1, c.getCoursetitle());
		   ps.setString(2, c.getInstructor());
		   ps.setString(3, c.getCategory());
		   ps.setString(4, c.getTotalenroll());
		   ps.setString(5, c.getFees());
		   ps.setString(6, c.getImgurl());
		   status=ps.executeUpdate();
		   return status;
	   }
 
	
	public Course getCourse(int cid) throws ClassNotFoundException, SQLException
	{
		
		String sql = "select * from courses where cid="+cid;
		con = getConnection();
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		
		Course c=new Course();
		if(rs.absolute(1))
		{
			c.setCoursetitle(rs.getString(2));
			c.setInstructor(rs.getString(3));
			c.setCategory(rs.getString(4));
			c.setTotalenroll(rs.getString(5));
			c.setFees(rs.getString(6));
			c.setImgurl(rs.getString(7));
		}
		
		con.close();
	
		return c;
	}
	
	
}
