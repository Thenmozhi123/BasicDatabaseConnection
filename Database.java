package BasicDbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Database {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username:");
		String username=sc.nextLine();
		System.out.println("enter the password:");
		String password=sc.nextLine();
try {
	
	String query = "select * from sign where name='"+username+"' and password= '"+password+"'";
System.out.println(query);
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","");
	
	Statement stmt=con.createStatement();  
	ResultSet rs =stmt.executeQuery(query);
	if(rs.next()){
		System.out.println("login success");
	}
	else{
		System.out.println("login failure");
	}
	
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	e.printStackTrace();
}
		
		
	}

}
