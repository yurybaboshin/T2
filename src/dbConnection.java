import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ������� ����
 * ������������� � ���� ������ MSSQL ����� JDBC
 */
public class dbConnection {

	static Connection con = null; // JDBC Connection  � ����
	
	public dbConnection() {
//		System.out.println("����������...");
		
//		// Establish the connection.
//		SQLServerDataSource ds = new SQLServerDataSource();
//		ds.setIntegratedSecurity(true);
////		ds.setServerName("192.168.11.11");
////		ds.setPortNumber(1433);
//		ds.setServerName("VITA");
//		ds.setPortNumber(14333);
//		ds.setDatabaseName("Roll");
//		ds.setUser("buser");
//		ds.setPassword("32767");
//		con = ds.getConnection(); // con - ��� connection � ����
		

//		String connectionString = "jdbc:sqlserver://VITA:14333;" + //���
		String connectionString = "jdbc:sqlserver://VITA:1433;" + 
		        "database=Roll;" + 
				"user=buser;" +
				"password=32767;" + 
				"trustServerCertificate=false;" + 
				"loginTimeout=10;";

		con = null;
		try {
			con = DriverManager.getConnection(connectionString);
//			System.out.println("�������� ���������� � ����...");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("����������� �� �������...");
			e.printStackTrace();
		}

	}
	
	public Connection getConnection() {
		return con;
	}
	
}
