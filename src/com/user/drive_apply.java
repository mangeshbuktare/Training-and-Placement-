package com.user;

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
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class drive_apply
 */
@WebServlet("/drive_apply")
public class drive_apply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public drive_apply() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String email = (String) session.getAttribute("Semail");
		String txt_Pid = request.getParameter("id");
		System.out.println(txt_Pid+"email"+email);
		PrintWriter pw = response.getWriter();
		Connection con;
		try {
			con = Dbconn.conn();
			Statement stRegister = con.createStatement();
			
			stRegister.executeUpdate("update drive_info_apply set Status='Apply' where D_ID='"
					+ txt_Pid + "' and email_id='" + email + "'");
			{
				pw.println("<script> alert('Apply Drive Successfully');</script>");
				RequestDispatcher rd = request
						.getRequestDispatcher("/Student_SearchPage.jsp");
				rd.include(request, response);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
