package com.activity;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import javax.servlet.http.Part;

import com.connection.Dbconn;
import com.connection.SendMail;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Registrtion
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  response.setContentType("text/html;charset=UTF-8");
			PrintWriter pw=response.getWriter();
			String Uname,Address,Email,Number,Password;
		
			Uname=request.getParameter("txtName");
			System.out.println("UserName"+Uname);
			Address=request.getParameter("txtAddress");
			System.out.println("Address"+Address);
			String gender=request.getParameter("rdoGender");
			System.out.println("gender"+gender);
			Email=request.getParameter("txtEmail");
			System.out.println("EmailId"+Email);
			Number=request.getParameter("txtContact");
			System.out.println("MobNo"+Number);
			Password=request.getParameter("passPassword");
			System.out.println("Password"+Password);
			String role=request.getParameter("role");
			  try
			  {
				Connection con;
				con = Dbconn.conn();
				int i=0;
				if(role.equals("hod"))
				{
					String sql="insert into hod(Uname,Uaddress,UGender,Uemail,Umobno,Upassword) values(?,?,?,?,?,?)";
					PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
					
					p.setString(1,Uname );
					p.setString(2,Address);
					p.setString(3,gender);
					p.setString(5,Number);
					p.setString(4,Email);
					p.setString(6, Password);
					i=p.executeUpdate();
				}
				else if(role.equals("coordinator"))
				{
					String sql="insert into coordinator(Uname,Uaddress,UGender,Uemail,Umobno,Upassword) values(?,?,?,?,?,?)";
					PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
					
					p.setString(1,Uname );
					p.setString(2,Address);
					p.setString(3,gender);
					p.setString(5,Number);
					p.setString(4,Email);
					p.setString(6, Password);
					i=p.executeUpdate();
				}
				else if(role.equals("TPO"))
				{
					String sql="insert into tbl_tpo(Uname,Uaddress,UGender,Uemail,Umobno,Upassword) values(?,?,?,?,?,?)";
					PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
					
					p.setString(1,Uname );
					p.setString(2,Address);
					p.setString(3,gender);
					p.setString(5,Number);
					p.setString(4,Email);
					p.setString(6, Password);
					i=p.executeUpdate();
				}
				else{
				String sql="insert into student(Uname,Uaddress,UGender,Uemail,Umobno,Upassword) values(?,?,?,?,?,?)";
				PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
				
				p.setString(1,Uname );
				p.setString(2,Address);
				p.setString(3,gender);
				p.setString(5,Number);
				p.setString(4,Email);
				p.setString(6, Password);
				i=p.executeUpdate();
				}
				if(i!=0)
				{
					System.out.println("OK ");
					pw.println("<script> alert(' Register Successfuly');</script>");
					RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
					rd.include(request, response); 
				}
				else
				{
					
					RequestDispatcher rd = request.getRequestDispatcher("/RegisterPage.jsp");
							rd.include(request, response);
					//System.out.print(" Wrong ID and Password");
					
				}
				
			}
			catch(Exception exc)
			{
				RequestDispatcher rd = request.getRequestDispatcher("/RegisterPage.jsp");
				rd.include(request, response);
				exc.printStackTrace();
			}
			
	}

}
