package jsp_library_management;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/edit")
public class Edit extends HttpServlet{
    
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 
		 Book book=new Book();
			book.setId(Integer.parseInt(req.getParameter("id")));
			book.setName(req.getParameter("name"));
			book.setAuthor(req.getParameter("author"));
			book.setGener(req.getParameter("genre"));
			BookCRUD crud=new BookCRUD();
		    try {
				int result=crud.editBook(book);
				if(result!=0)
				{
					req.setAttribute("books", crud.collectionBook());
					req.getRequestDispatcher("home.jsp").forward(req, resp);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
