package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;

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
 * Servlet implementation class search_info
 */
@WebServlet("/search_info")
public class search_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search_info() {
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
		PrintWriter pw=response.getWriter();
		String txt_description=request.getParameter("txt_description");
		String txt_10_marks=request.getParameter("txt_10_marks");
		String txt_12_marks=request.getParameter("txt_12_marks");
		String txt_grad_marks=request.getParameter("txt_grad_marks");
		String txt_Post_marks=request.getParameter("txt_Post_marks");
		String Email=(String)session.getAttribute("Semail");
		
		Connection con;
		try
		{
			DecimalFormat df = new DecimalFormat("0.00");
			con = Dbconn.conn();
			Statement sts=con.createStatement();
			sts.executeUpdate("TRUNCATE table drive_info_search");
			Statement stRegister=con.createStatement();
			ResultSet rs;
			int tp1=0,tp2=0,tp3=0,tp4=0,tp5=0;
			rs=stRegister.executeQuery("select * from drive");
			while(rs.next())
			{
				String D_ID=rs.getString("id");
				String drive_description=rs.getString("drive_description");
				int marks_10=rs.getInt("marks_10");
				int marks_12=rs.getInt("marks_12");
				int marks_gd=rs.getInt("marks_gd");
				int marks_pgd=rs.getInt("marks_pgd");
				 CosineSimilarity cs=new CosineSimilarity();
				double score=cs.GetSimilarity(txt_description.toLowerCase(), drive_description.toLowerCase());
				String weight=df.format(score);
				double total=Double.valueOf(weight);
				System.out.println(total);
				if(total>0.50 && total>0.60)
				{
					tp1=1;
					
				}
				else
				{}
				int m10=Integer.valueOf(txt_10_marks);
				if(m10>=marks_10)
				{
					tp2=1;
				}
				else{}
				int m12=Integer.valueOf(txt_12_marks);
				if(m12>=marks_12)
				{
					tp3=1;
				}
				else
				{}
				int mgrad=Integer.valueOf(txt_grad_marks);
				if(mgrad>=marks_gd)
				{
					tp4=1;
				}
				else
				{}
				int mpost=Integer.valueOf(txt_Post_marks);
				if(mpost>=marks_pgd)
				{
					tp5=1;
				}
				else
				{}
				System.out.println(total+"&"+tp1+"&"+tp2+"&"+tp3+"&"+tp4+"&"+tp5);
				if(tp1==1&& tp2==1&&tp3==1&&tp4==1)
				{
				String sql1="insert into drive_info_search(D_ID,Company_Name,Company_Email_id,Company_Address,Drive_Date,Drive_Time,email_id) values(?,?,?,?,?,?,?)";
				PreparedStatement p1=(PreparedStatement) con.prepareStatement(sql1);
				
				p1.setString(1,rs.getString("id") );
				p1.setString(2,rs.getString("company_name") );
				p1.setString(3,rs.getString("company_email"));
				p1.setString(4,rs.getString("company_address"));
				p1.setString(5,rs.getString("drive_date"));
				p1.setString(6,rs.getString("drive_time"));
				p1.setString(7,Email);
				p1.executeUpdate();
				
				String sql="insert into drive_info_apply(D_ID,Company_Name,Company_Email_id,Company_Address,Drive_Date,Drive_Time,email_id,job_skill,marks_10,marks_12,marks_gd,marks_pgd,Status) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
				String status="Send";
				PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
				p.setString(1,rs.getString("id") );
				p.setString(2,rs.getString("company_name") );
				p.setString(3,rs.getString("company_email"));
				p.setString(4,rs.getString("company_address"));
				p.setString(5,rs.getString("drive_date"));
				p.setString(6,rs.getString("drive_time"));
				p.setString(7,Email);
				p.setString(8,txt_description);
				p.setString(9,txt_10_marks);
				p.setString(10,txt_12_marks);
				p.setString(11,txt_grad_marks);
				p.setString(12,txt_Post_marks);
				p.setString(13,status);
				p.executeUpdate();
				
				}
				else if(tp1==1&& tp2==1&&tp3==1&&tp4==1&&tp5==1)
				{
				String sql1="insert into drive_info_search(D_ID,Company_Name,Company_Email_id,Company_Address,Drive_Date,Drive_Time,email_id) values(?,?,?,?,?,?,?)";
				PreparedStatement p1=(PreparedStatement) con.prepareStatement(sql1);
				
				p1.setString(1,rs.getString("id") );
				p1.setString(2,rs.getString("company_name") );
				p1.setString(3,rs.getString("company_email"));
				p1.setString(4,rs.getString("company_address"));
				p1.setString(5,rs.getString("drive_date"));
				p1.setString(6,rs.getString("drive_time"));
				p1.setString(7,Email);
				p1.executeUpdate();
				
				String sql="insert into drive_info_apply(D_ID,Company_Name,Company_Email_id,Company_Address,Drive_Date,Drive_Time,email_id,job_skill,marks_10,marks_12,marks_gd,marks_pgd,Status) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
				String status="Send";
				PreparedStatement p=(PreparedStatement) con.prepareStatement(sql);
				p.setString(1,rs.getString("id") );
				p.setString(2,rs.getString("company_name") );
				p.setString(3,rs.getString("company_email"));
				p.setString(4,rs.getString("company_address"));
				p.setString(5,rs.getString("drive_date"));
				p.setString(6,rs.getString("drive_time"));
				p.setString(7,Email);
				p.setString(8,txt_description);
				p.setString(9,txt_10_marks);
				p.setString(10,txt_12_marks);
				p.setString(11,txt_grad_marks);
				p.setString(12,txt_Post_marks);
				p.setString(13,status);
				p.executeUpdate();
				
				}
								
			}
			RequestDispatcher rd = request.getRequestDispatcher("/Student_Show_Drives.jsp");
			rd.include(request, response);
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
	}

}
