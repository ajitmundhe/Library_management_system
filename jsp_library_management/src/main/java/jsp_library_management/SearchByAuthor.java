package jsp_library_management;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/author")
public class SearchByAuthor extends HttpServlet{
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String search=req.getParameter("search");
		  System.out.println(search);
		 if(search!=null)
		 {
			 BookCRUD crud=new BookCRUD();
			  try {
				  List<Book>newList=new ArrayList();
				List<Book> li=crud.collectionBook();
				for (Book book : li) {
					if(book.getAuthor().toLowerCase().contains(search.toLowerCase()))
					{
						newList.add(book);
						
					}
				}
				
				req.setAttribute("books", newList);
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 else {
			 req.getRequestDispatcher("home.jsp").forward(req, resp);
		 }
	}
}
