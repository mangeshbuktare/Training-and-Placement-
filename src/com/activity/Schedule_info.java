package com.activity;

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

import com.connection.Dbconn;

/**
 * Servlet implementation class Schedule_info
 */
@WebServlet("/Schedule_info")
public class Schedule_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Schedule_info() {
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
		String name=request.getParameter("txt_Pname");
		String txt_PEmail_id=request.getParameter("txt_PEmail_id");
		String txt_Pdate=request.getParameter("txt_Pdate");
		String txt_PStime=request.getParameter("txt_PStime");
		String Umobno=request.getParameter("Umobno");
		try {
			PrintWriter pw=response.getWriter();
			Connection con = Dbconn.conn();
			PreparedStatement ps=con.prepareStatement("insert into tblschedule_info(Name,Email_id,Mobile_No,Current_date_info,Schedul_time) values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, txt_PEmail_id);
			ps.setString(3, Umobno);
			ps.setString(4, txt_Pdate);
			ps.setString(5, txt_PStime);
			ps.executeUpdate();
			pw.println("<script> alert('Schedule Details Successfully');</script>");
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		RequestDispatcher rd = request.getRequestDispatcher("/ScheduleData.jsp");
		rd.include(request, response);
	}

}
