package Databaseconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Database {
	static void registration(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username:");
		String name=sc.nextLine();
		System.out.println("enter the password:");
		String password=sc.nextLine();
try {
	
	String query = "insert into login(UserName,Password) values( '"+name+"' ,'"+password+"' )";
  System.out.println(query);
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
	
	Statement stmt=con.createStatement();  
	stmt.execute(query);
}
	catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	e.printStackTrace();
}
		
	}

	public static void main(String[] args) {
		registration();
	}
}
		
		
	
