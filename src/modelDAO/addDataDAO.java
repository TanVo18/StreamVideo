package modelDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class addDataDAO {
	Database db = new Database();
	
	public boolean addData(String link,String fileName) {
		  int check=0;
		  String query = "insert into data(link,filename) value (?,?)";
		  PreparedStatement pstm;
		  try {
		   pstm = (PreparedStatement) Database.connectDB().prepareStatement(query);
		   pstm.setString(1, link);
		   pstm.setString(2, fileName);
		   check = pstm.executeUpdate();
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  if(check>0){
		   return true;
		  }
		  else{
		   return false;
		  } 
		 }
}
