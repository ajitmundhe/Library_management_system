package jsp_library_management;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class DeleteBook extends HttpServlet {
     
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		BookCRUD crud=new BookCRUD();
		try {
			int result=crud.deleteBook(id);
			if(result!=0)
			{
				req.setAttribute("books", crud.collectionBook());
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			}
			else
			{
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
