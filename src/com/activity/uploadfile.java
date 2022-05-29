package com.activity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.connection.Dbconn;

/**
 * Servlet implementation class uploadfile
 */
@WebServlet("/uploadfile")
public class uploadfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public uploadfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		String email=(String)session.getAttribute("Temail");
		String txt_date = request.getParameter("txt_date");
		String txt_time = request.getParameter("txt_time");
		String txt_Pdescription = request.getParameter("txt_description");
		String txt_10_marks = request.getParameter("txt_10_marks");
		String txt_12_marks = request.getParameter("txt_12_marks");
		String txt_grad_marks = request.getParameter("txt_grad_marks");
		String txt_Post_marks=request.getParameter("txt_Post_marks");
		
		String txt_company_name=request.getParameter("txt_company_name");
		String txt_company_email=request.getParameter("txt_company_email");
		String txt_address=request.getParameter("txt_address");
		String txt_link=request.getParameter("txt_link");
		try {
			PrintWriter pw = response.getWriter();
			Connection con = Dbconn.conn();

			PreparedStatement ps = con
					.prepareStatement("insert into drive(company_name,company_email,company_address,drive_date,drive_time,drive_description,marks_10,marks_12,marks_gd,marks_pgd,user_mail_id,txt_link) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, txt_company_name);
			ps.setString(2, txt_company_email);
			ps.setString(3, txt_address);
			ps.setString(4, txt_date);
			ps.setString(5, txt_time);
			ps.setString(6, txt_Pdescription);
			ps.setString(7, txt_10_marks);
			ps.setString(8, txt_12_marks);
			ps.setString(9, txt_grad_marks);
			ps.setString(10, txt_Post_marks);
			ps.setString(11, email);
			ps.setString(12,txt_link);
			ps.executeUpdate();

			pw.println("<script> alert(' Added Details Successfully');</script>");
			RequestDispatcher rd = request
					.getRequestDispatcher("/TPOHomePage.jsp");
			rd.include(request, response);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
