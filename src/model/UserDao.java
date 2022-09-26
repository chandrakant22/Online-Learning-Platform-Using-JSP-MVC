package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	
	Connection con;

	private Connection getConnect() throws ClassNotFoundException, SQLException {
		String db="jspmvc1";
		String url = "jdbc:mysql://localhost:3306/"+db;
		String uname = "root";
		String upass = "abc123";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, upass);

		return con;
	}
	
	public int insert(User u) throws ClassNotFoundException, SQLException {
		String sql = "insert into user (fname,email,pass) values(?,?,?)";
		con = getConnect();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, u.getFullName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getPassword());

		int a = ps.executeUpdate();
		con.close();
		return a;
	}
	
	
	public boolean checkUser(String email,String pass) throws ClassNotFoundException, SQLException
	{
		String sql = "select * from user where email=? and  pass=?";
		con = getConnect();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, pass);
		

		ResultSet rs = ps.executeQuery();
		boolean a=rs.absolute(1);
		con.close();
	
		return a;
	}
	

	public boolean checkEmail(String email) throws ClassNotFoundException, SQLException
	{
		String sql = "select * from user where email=?";
		con = getConnect();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);		

		ResultSet rs = ps.executeQuery();
		boolean a=rs.absolute(1);
		con.close();
	
		return a;
	}
	
	public int studentCount() throws ClassNotFoundException, SQLException
	{
		String sql = "select count(*) from user";
		con = getConnect();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
	    rs.next();
	    int count = rs.getInt(1);		
	    con.close();
	
		return count;
	}
	
	
}

/* 
 * Student count -done
 * Courses Count (courses table) 
 * Courses Purchase Count (purchase table) 
 * Total Mentors Count (mentor table) 
 */
