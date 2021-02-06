package labprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner; 
public class qno5 {
	public static void main(String[] args)
	{
		Connection con=null;
		try {
			// load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			// DriverManager.getConnection(connectionURL, username,password)
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adj","root","");
			System.out.println("Database Connected Successfully");
			Scanner ob = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter Student Id : ");
		    String sid = ob.nextLine(); 
		    System.out.println("Enter Branch : ");// Read user input
		    String dept = ob.nextLine();
			String query="update student set dept = ? where  sid= ?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, dept);
			psmt.setString(2, sid);
			int rows=psmt.executeUpdate();
			if(rows > 0) {
				System.out.println("Data updated successfully");
				System.out.println(rows + " rows updated successfully");
			}
			else {
				System.out.println("Data not updated");
			}
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
