package com.top;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.Dbconn;

/**
 * Servlet implementation class add_training_program
 */
@WebServlet("/add_training_program")
public class add_training_program extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_training_program() {
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
		HttpSession session=request.getSession(true);
		String email=(String)session.getAttribute("Temail");
		String txt_date = request.getParameter("txt_date");
		String txt_time = request.getParameter("txt_time");
		String txt_Pdescription = request.getParameter("txt_description");
		String txt_company_name=request.getParameter("txt_company_name");
		String txt_company_email=request.getParameter("txt_company_email");
		String txt_address=request.getParameter("txt_address");
		try {
			PrintWriter pw = response.getWriter();
			Connection con = Dbconn.conn();

			PreparedStatement ps = con
					.prepareStatement("insert into tbl_trainingprogram(company_name,company_email,company_address,drive_date,drive_time,drive_description,user_mail_id) values(?,?,?,?,?,?,?)");
			ps.setString(1, txt_company_name);
			ps.setString(2, txt_company_email);
			ps.setString(3, txt_address);
			ps.setString(4, txt_date);
			ps.setString(5, txt_time);
			ps.setString(6, txt_Pdescription);
			ps.setString(7, email);
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
