package com.activity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.Dbconn;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        HttpSession session=request.getSession();  
        session.invalidate();  
        
        out.println("<script type=\"text/javascript\">");  
		out.println("alert('You are successfully logged out!');");  
		out.println("</script>");
        request.getRequestDispatcher("Login.jsp").include(request, response);         
        out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(true);
		PrintWriter pw=response.getWriter();
		System.out.println("Login Servlet");
		String username=request.getParameter("txt_Uname");
		String Password=request.getParameter("txt_Password");
		System.out.println("Name"+request.getParameter("txt_Uname"));
		System.out.println("Password"+request.getParameter("txt_Password"));
		String role=request.getParameter("role");
		if(role.equals("hod"))
		{
			Connection con;
			try
			{
				con = Dbconn.conn();
				Statement stRegister=con.createStatement();
				ResultSet rsLogin;
				rsLogin=stRegister.executeQuery("select * from hod where Uemail='" +username+ "' and Upassword='"+Password+"'");
				if(rsLogin.next())
				{
					
					session.setAttribute("hname", rsLogin.getString(2));
					session.setAttribute("hemail", username);
					session.setAttribute("hmobno", rsLogin.getString("Umobno"));
					pw.println("<script> alert('Login Succesfully');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/HODHomePage.jsp");
					rd.include(request, response); 
									
				}
				else
				{
					pw.println("<script> alert(' Wrong UserName and Password');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
							rd.include(request, response);
					
				}
			}
			catch(Exception e)
			{
			System.out.println(e);	
			}
		}
		else if(role.equals("coordinator")){
			Connection con;
			try
			{
				con = Dbconn.conn();
				Statement stRegister=con.createStatement();
				ResultSet rsLogin;
				rsLogin=stRegister.executeQuery("select * from coordinator where Uemail='" +username+ "' and Upassword='"+Password+"'");
				if(rsLogin.next())
				{
					
					session.setAttribute("Cname", rsLogin.getString(2));
					session.setAttribute("Cemail", username);
					session.setAttribute("Cmobno", rsLogin.getString("Umobno"));
					pw.println("<script> alert('Login Successfully');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/CordinatorHomePage.jsp");
					rd.include(request, response); 
									
				}
				else
				{
					pw.println("<script> alert(' Wrong UserName and Password');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
							rd.include(request, response);
					
				}
			}
			catch(Exception e)
			{
			System.out.println(e);	
			}
		}
		else if(role.equals("TPO"))
		{
			Connection con;
			try
			{
				con = Dbconn.conn();
				Statement stRegister=con.createStatement();
				ResultSet rsLogin;
				rsLogin=stRegister.executeQuery("select * from tbl_tpo where Uemail='" +username+ "' and Upassword='"+Password+"'");
				if(rsLogin.next())
				{
					
					session.setAttribute("Tname", rsLogin.getString(2));
					session.setAttribute("Temail", username);
					session.setAttribute("Tmobno", rsLogin.getString("Umobno"));
					pw.println("<script> alert('Login Succesfully');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/TPOHomePage.jsp");
					rd.include(request, response); 
									
				}
				else
				{
					pw.println("<script> alert(' Wrong UserName and Password');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
							rd.include(request, response);
					
				}
			}
			catch(Exception e)
			{
			System.out.println(e);	
			}
		}
		else
		{
			Connection con;
			try
			{
				con = Dbconn.conn();
				Statement stRegister=con.createStatement();
				ResultSet rsLogin;
				rsLogin=stRegister.executeQuery("select * from student where Uemail='" +username+ "' and Upassword='"+Password+"'");
				if(rsLogin.next())
				{
					
					session.setAttribute("Sname", rsLogin.getString(2));
					session.setAttribute("Semail", username);
					session.setAttribute("Smobno", rsLogin.getString("Umobno"));
					RequestDispatcher rd = request.getRequestDispatcher("/StudentHomePage.jsp");
					rd.include(request, response); 
									
				}
				else
				{
					pw.println("<script> alert(' Wrong UserName and Password');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
							rd.include(request, response);
					
				}
			}
			catch(Exception e)
			{
			System.out.println(e);	
			}
		}
	}
}
