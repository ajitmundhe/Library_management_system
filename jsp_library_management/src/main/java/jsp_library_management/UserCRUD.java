package jsp_library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserCRUD {
   
	public Connection getConnection() throws  Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","root");
	}
	
	public int registerUser(User user) throws Exception
	{   
		String query="insert into user values(?,?,?,?,?)";
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1, user.getId());
		preparedStatement.setString(2, user.getName());
		preparedStatement.setLong(3, user.getPhone());
		preparedStatement.setString(4, user.getEmail());
		preparedStatement.setString(5, user.getPassword());
		
		int result=preparedStatement.executeUpdate();
		connection.close();
		return result;
	}
	public String login(String email) throws Exception
	{
		String query="select password from user where email=?";
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, email);
		ResultSet set=preparedStatement.executeQuery();
		String password=null;
		while(set.next())
		{
			password=set.getString("password");
		}
		connection.close();
		return password;
		
	}
}
