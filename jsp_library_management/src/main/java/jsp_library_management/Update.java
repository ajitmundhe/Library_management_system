package jsp_library_management;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class Update extends HttpServlet{
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 int id=Integer.parseInt(req.getParameter("id"));
		 BookCRUD crud=new BookCRUD();
		 Book book;
		try {
			//using cookie to do session tracking
			
			book = crud.getBook(id);
			req.setAttribute("book", book);
			 req.getRequestDispatcher("edit.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
