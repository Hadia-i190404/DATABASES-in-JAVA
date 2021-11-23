
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Oracle extends StoreinDataBase {

	public void insertion(String str) {
		try 
    	{

			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","hadianoor101");  
			  
			System.out.println("Connection Established!!\n");
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			//String cust = "insert into Bank_Customer values('"+acc.account_no+"','"+acc.customer.name+"','"+acc.customer.address+"',"+acc.customer.phone+','+acc.customer.ID+")";
			String exe = "insert into bank_account values("+str+")";
			System.out.println(exe);
			stmt.executeQuery(exe);
			//step4 execute query  
    		con.close();
    	}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("Driver not loaded");
    	}
    	catch(SQLException e)
    	{
    		System.out.println("Connection not established");
    	}
		
	

	}
}
