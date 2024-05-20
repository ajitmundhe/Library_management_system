package jsp_library_management;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/lgn")
public class login extends HttpServlet {
   
	  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  String email=req.getParameter("email");
		  String password=req.getParameter("password");
		  UserCRUD crud=new UserCRUD();
		  BookCRUD crud2=new BookCRUD(); 
		  try {
			String dbPasword=crud.login(email);
			if(dbPasword!=null)
			{
				if(dbPasword.equals(password))
				{
					
					
					
					req.setAttribute("login", "Login Sucessful");
					req.setAttribute("books", crud2.collectionBook());
					req.getRequestDispatcher("home.jsp").forward(req, resp);
				}
				else {
					req.setAttribute("password", "Wrong password try again!!!");
					req.getRequestDispatcher("login.jsp").forward(req, resp);
				}
			}
			else
			{
				req.setAttribute("reg", "Invalid Email..Register please");
				req.getRequestDispatcher("register.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	}
}
