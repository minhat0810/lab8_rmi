package rmi_server;

import java.sql.*;

public class ConnectDB {
	
	public static Connection ConnectionDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/chatroomsocket"; // Thay thế localhost và mydatabase
	        String username = "root"; // Thay bằng tên người dùng của bạn
	        String password = "";
			Connection connect = DriverManager.getConnection(url,username,password);
			return connect;
			
//			Connection conn = null;
//			try {
//			//	conn = (Connection) DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VQ8FO7NU\\SQLEXPRESS:1433;" + "user=sa;password=123;databaseName=chatroomsocket;encrypt=false");
//				if(conn != null) System.out.println("Ket noi thanh cong");
//			} catch (Exception e) {
//				// TODO: handle exception
//				 System.err.println(e.toString());
//			}
//			
//			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
    }
	
}

