

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet
{
	String name,password,email,country;
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		name=request.getParameter("username");
		password=request.getParameter("userpass");
		email=request.getParameter("useremail");
		country=request.getParameter("country");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			out.println(" hello1");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sindhu_db","root","");
			out.println(" hello2");

			Statement st=c.createStatement();
			
			int count=st.executeUpdate("insert into sindhu_db.student values('"+name+"', '"+password+"','"+email+"', '"+country+"')");
			out.println(count+"rows updated");
		}
		catch(Exception e)
		{
			
		}
	}

}
