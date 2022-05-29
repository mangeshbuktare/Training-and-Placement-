package com.cordinator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import com.connection.Dbconn;

/**
 * Servlet implementation class update_drive
 */
@WebServlet("/update_drive")
public class update_drive extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public update_drive() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		//String email = (String) session.getAttribute("Cemail");
		PrintWriter pw = response.getWriter();
		System.out.println("Servlet");
		String id = request.getParameter("id");

		Connection con;
		try {
			con = Dbconn.conn();
			Statement stRegister = con.createStatement();
			
			stRegister.executeUpdate(" delete  from drive where id='" + id
					+ "'");
			{
				pw.println("<script> alert('Delete Drive Successfully');</script>");
				RequestDispatcher rd = request
						.getRequestDispatcher("/Cordinator_Show_Drives.jsp");
				rd.include(request, response);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		//String email = (String) session.getAttribute("Cemail");
		String txt_Pid = request.getParameter("txt_Pid");
		String txt_date = request.getParameter("txt_date");
		String txt_time = request.getParameter("txt_time");
		String txt_Pdescription = request.getParameter("txt_description");
		String txt_10_marks = request.getParameter("txt_10_marks");
		String txt_12_marks = request.getParameter("txt_12_marks");
		String txt_grad_marks = request.getParameter("txt_grad_marks");
		String txt_Post_marks = request.getParameter("txt_Post_marks");

		String txt_company_name = request.getParameter("txt_company_name");
		String txt_company_email = request.getParameter("txt_company_email");
		String txt_address = request.getParameter("txt_address");
		PrintWriter pw = response.getWriter();
		Connection con;
		try {
			con = Dbconn.conn();
			Statement stRegister = con.createStatement();
			
			stRegister.executeUpdate("update drive set company_name='"
					+ txt_company_name + "',company_email='"
					+ txt_company_email + "',company_address='" + txt_address
					+ "',drive_date='" + txt_date + "',drive_time='" + txt_time
					+ "',drive_description='" + txt_Pdescription
					+ "',marks_10='" + txt_10_marks + "',marks_12='"
					+ txt_12_marks + "',marks_gd='" + txt_grad_marks
					+ "',marks_pgd='" + txt_Post_marks + "' where id='"
					+ txt_Pid + "'");
			{
				pw.println("<script> alert('Update Drive Successfully');</script>");
				RequestDispatcher rd = request
						.getRequestDispatcher("/CordinatorHomePage.jsp");
				rd.include(request, response);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
