

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet
{
	String name;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		name=request.getParameter("username");
		HttpSession session=request.getSession();
		session.setAttribute("User",name);
		out.println("<a href='Servlet3'>Click</a>");
	}

}
