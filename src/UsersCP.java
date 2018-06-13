import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.eclipse.jface.viewers.IStructuredContentProvider;

/**
 * Content provider "Users"
 */
public class UsersCP implements IStructuredContentProvider {

//	String test[] = {"1","2","3","4","проверка"};
	ArrayList<String> list = new ArrayList <String>();
	
	public Object[]	getElements(Object inputElement) {
		
		// ѕревратить в обычный массив
		String test[] = new String[list.size()];
		test = list.toArray(test);
		
		return test;		
	}
	
	public UsersCP() {
		Connection con = new dbConnection().getConnection();		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT Name FROM Users WHERE isActive=1 ORDER BY Name");
			 while (rs.next()) {
//                 System.out.println(rs.getString(1));
                 String s = rs.getString(1);
                 list.add(s);
             }
             rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
