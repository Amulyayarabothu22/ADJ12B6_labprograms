package labprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class qno4 {
	public static void main(String[] args)
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adj","root","");
			System.out.println("Database Connected Successfully");
			String query="SELECT * from student";
			PreparedStatement psmt=con.prepareStatement(query);
			ResultSet rs=psmt.executeQuery();
			System.out.println("Student Id\tStudent Name\tDepartment\tSection");
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
