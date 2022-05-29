package com.cordinator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import com.connection.Dbconn;

/**
 * Servlet implementation class delete_drive
 */
@WebServlet("/delete_drive")
public class delete_drive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete_drive() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String email = (String) session.getAttribute("Cemail");
		PrintWriter pw = response.getWriter();
		System.out.println("Servlet");
		String id = request.getParameter("id");

		Connection con;
		try {
			con = Dbconn.conn();
			Statement stRegister = con.createStatement();
			
			stRegister.executeUpdate(" delete  from drive where id='" + id
					+ "' and user_mail_id='"+email+"'");
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
