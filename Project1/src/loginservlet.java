

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String user,pass;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		request.setAttribute("user",user);
		if(user.equals("sindhu")&& pass.equals("sindhu")) {
			response.sendRedirect("servlet2");
		}
		else
		{
			response.sendRedirect("NewFile.html");
			out.println("invalid response");
		}
			
		
	}

}
