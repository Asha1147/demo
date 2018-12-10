package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import entity.Student;

public class StudentConnectivity {
	public void studentConn(Student s) throws SQLException {

		//Student s1=new Student();
		
	
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg723","training723");
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
			System.out.println(s.getName()+" is name");
			
			pst.setString(1,s.getName());
			pst.setInt(2, s.getId());
			pst.setString(3,s.getEmail());
			pst.executeUpdate();
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("SELECT * FROM student ");
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getString(3));
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
}

}

