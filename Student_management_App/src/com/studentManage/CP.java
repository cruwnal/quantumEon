package com.studentManage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	public static Connection createC() {
		
		
	try {
		//1. load the driver 
		Class.forName("com.mysql.jdbc.Driver");
		
		//create the connection 
		String user = "root";
		String password = "Agtl@1234";
		String url = "jdbc:mysql://localhost:3306/student_manage";//url is same for every mySql
		
		con=DriverManager.getConnection(url,user,password);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return con;
		
	}

}
