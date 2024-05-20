package jsp_library_management;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Register extends HttpServlet {
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 User user=new User();
		 user.setId(Integer.parseInt(req.getParameter("id")));
		 user.setName(req.getParameter("name"));
		 user.setPhone(Long.parseLong(req.getParameter("phone")));
		 user.setEmail(req.getParameter("email"));
		 user.setPassword(req.getParameter("password"));
		 UserCRUD crud=new UserCRUD();
		 try {
			int result=crud.registerUser(user);
			if(result!=0)
			{
				req.setAttribute("message", "Signup sucessful,Please login " );
				req.getRequestDispatcher("welcome.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
