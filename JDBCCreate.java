//JDBCCreate.java
import java.sql.*;
public class JDBCCreate{
   public static void main(String[] args){
		String jdbcdriver = "com.mysql.cj.idbc.drive";
		String dbURL = "jdbc:mysql://localhost:3306/aits";
		String user = "system";
		String pass = "jkclab";
		  Connection conn = null;
		  Statement stmt = null;
		  try{
		      Class.forName("oracle.jdbc.driver.OracleDriver");
			  System.out.println("connecting to database....");
			  conn = DriverManager.getConnection(dbURL,user,pass);
			  System.out.println("Creating database....");
			  stmt = conn.createStatement();
			  if(stmt!=null){
			       System.out.println("connection established");
				   String sqlq = "create table annamacharya99(rnum varchar(20),name varchar(20),branch varchar(20)";
				   stmt.executeUpdate(sqlq);
				   System.out.println("Table created successfully...");
			 }
	 }
	 catch(ClassNotFoundException|SQLException e){
	      e.printStackTrace();
	 }
   }
}
		       