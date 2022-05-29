package com.cordinator;

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
import com.connection.SendMail;

/**
 * Servlet implementation class drive_notification
 */
@WebServlet("/drive_notification")
public class drive_notification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public drive_notification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String[] data= request.getParameter("id").split(",");
		String email =data[0];
		String companyid=data[1];
		PrintWriter pw = response.getWriter();
		System.out.println("Servlet");
		String txt_link="";
		try {
			Connection con = Dbconn.conn();
			Statement stRegister=con.createStatement();
			ResultSet rsLogin;
			rsLogin=stRegister.executeQuery("select * from drive where company_email='" +companyid+ "'");
			if(rsLogin.next())
			{
				txt_link=rsLogin.getString(13);
			}
			
			System.out.println("Servlet"+txt_link);
			
		String notification_msg="Your Select First Process"+txt_link;
			SendMail.SendNotification(email, notification_msg);
			pw.println("<script> alert('Notification Drive Successfully');</script>");
				RequestDispatcher rd = request
						.getRequestDispatcher("/Cordinator_Show_Drives_Notification.jsp");
				rd.include(request, response);

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
