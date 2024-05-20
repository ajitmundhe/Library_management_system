package jsp_library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookCRUD {
    public Connection getConnection() throws Exception{
    	Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","root");
    }
    
    public int addBook(Book book) throws Exception
    {
    	String query="insert into book values(?,?,?,?)";
    	Connection connection=getConnection();
    	PreparedStatement preparedStatement=connection.prepareStatement(query);
    	preparedStatement.setInt(1, book.getId());
    	preparedStatement.setString(2, book.getName());
    	preparedStatement.setString(3, book.getAuthor());
    	preparedStatement.setString(4, book.getGener());
    	 int result=preparedStatement.executeUpdate();
    	 connection.close();
    	 return result;
    }
    public List<Book> collectionBook() throws Exception
    {
    	String query="Select * from book";
    	Connection connection=getConnection();
    	PreparedStatement preparedStatement=connection.prepareStatement(query);
    	ResultSet set=preparedStatement.executeQuery();
    	List<Book> bk=new ArrayList<Book>();
    	while(set.next())
    	{
    		Book book=new Book();
    		book.setId(set.getInt("id"));
    		book.setName(set.getString("name"));
    		book.setAuthor(set.getString("author"));
    		book.setGener(set.getString("genre"));
    		bk.add(book);
    	}
    	
    	connection.close();
    	return bk;
    }
    public int deleteBook(int id) throws Exception
    {
    	String query="delete from book where id=?";
    	Connection connection=getConnection();
    	PreparedStatement preparedStatement=connection.prepareStatement(query);
    	preparedStatement.setInt(1, id);
    	int result=preparedStatement.executeUpdate();
    	
    	connection.close();
    	return result;
    }
    public Book getBook(int id) throws Exception
    {  
    	String query="Select * from book where id=?";
    	Connection connection=getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		ResultSet set = preparedStatement.executeQuery();

          Book book=new Book();
		while (set.next()) {
			
			book.setId(set.getInt("id"));
			book.setName(set.getString("name"));
			book.setAuthor(set.getString("author"));
			book.setGener(set.getString("genre"));
			
			
		}
		connection.close();
		return book;
    }
    
    public int editBook(Book book) throws Exception {

		String query = "update book set name=?,author=?,genre=? where id=?";
		Connection connection = getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, book.getName());
		preparedStatement.setString(2, book.getAuthor());
		preparedStatement.setString(3, book.getGener());
		preparedStatement.setInt(4, book.getId());

		int result = preparedStatement.executeUpdate();
		connection.close();
		return result;
	}
}

