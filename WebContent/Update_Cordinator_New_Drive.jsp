<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.connection.Dbconn"%>
<%@page import="com.connection.Dbconn"%>
<%@page import="com.connection.Dbconn.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Mobile Specific Meta -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Favicon-->
<link rel="shortcut icon" href="img/fav.png">
<!-- Author Meta -->
<meta name="author" content="colorlib">
<!-- Meta Description -->
<meta name="description" content="">
<!-- Meta Keyword -->
<meta name="keywords" content="">
<!-- meta character set -->
<meta charset="UTF-8">
<!-- Site Title -->
<title>Campus Selection Project</title>

<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700"
	rel="stylesheet">
<!--
			CSS
			============================================= -->
<link rel="stylesheet" href="css/linearicons.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/animate.min.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body>
	<header id="header" id="home">

	<div class="container main-menu">
		<div class="row align-items-center justify-content-between d-flex">
			<div id="logo">
				<jsp:include page="title.jsp" />
			</div>
			<nav id="nav-menu-container">
			 <ul class="nav-menu">
				          <li class="menu-active"><a href="CordinatorHomePage.jsp">HOME</a></li>
				          <li><a href="Cordinator_Show_Drives.jsp">Show Drives</a></li>
				          <li><a href="Blog_page.jsp">Send Drive Notification</a></li>
				          
				         
				          <li><a href="Login">LOGOUT</a></li>
				        </ul>
			</nav>
			<!-- #nav-menu-container -->
		</div>
	</div>
	</header>
	<!-- #header -->

	<!-- Start testomial Area -->
	<section class="testomial-area section-gap" id="testimonail">
	<div class="container">
		<div class="row d-flex justify-content-center">
			<div class="menu-content pb-60 col-lg-7">
				<div class="title text-center">
					<h1 class="mb-10 text-white">Add Info</h1>
					<br>
				</div>
				
				<form role="form" action="update_drive" 
					method="post">
					<div class="form-group">
					<%
	
	Dbconn db=new Dbconn();
	Connection con=db.conn();
	String id=request.getParameter("id");
	String user_mail_id=(String)session.getAttribute("Cemail");
	String company_name="",company_email="",company_address="",drive_date="",drive_time="",drive_description="",marks_10="",marks_12="",marks_gd="",marks_pgd="";
	Statement st=con.createStatement();
	int amountcount=0;
	ResultSet rs=st.executeQuery("select * from drive where id='"+id+"'");
	while(rs.next())
	{
		id=rs.getString(1);
		company_name=rs.getString(2);
		company_email=rs.getString(3);
		company_address=rs.getString(4);
		drive_date=rs.getString(5);
		drive_time=rs.getString(6);
		drive_description=rs.getString(7);
		marks_10=rs.getString(8);
		marks_12=rs.getString(9);
		marks_gd=rs.getString(10);
		marks_pgd=rs.getString(11);
		
	}
	%>
						<table class="table table-responsive table-bordered">

<tr>
								<td class="col-md-2"><label for="txt_Pname"
									style="color: White; font-size: 18px;">ID:</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_Pid" required id="txt_Pid" readonly="readonly"
									value="<%= id%>"></td>
							</tr>
							<tr>
								<th colspan="2"><label>Company Details</label></th>
						</tr>
						
						<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Company Name</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_company_name" required
									id="txt_Page" value="<%=company_name%>"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Company Email</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_company_email" required
									id="txt_Page" value="<%=company_email%>"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Company Address</label></td>
								<td class="col-md-6"><textarea class="form-control"
										name="txt_address" required id="txt_address"
										><%=company_address%></textarea></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pname"
									style="color: White; font-size: 18px;">Select Date:</label></td>
								<td class="col-md-6"><input type="date"
									class="form-control" name="txt_date" required id="txt_Pname"
									placeholder="Enter Name"></td>
							</tr>

							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Select Time</label></td>
								<td class="col-md-6"><input type="Time"
									class="form-control" name="txt_time" required
									id="txt_Page" placeholder="Enter Time"></td>
							</tr>

							<tr>
								<td class="col-md-2"><label for="txt_Pdescription"
									style="color: White; font-size: 18px;">Job Field </label></td>
								<td class="col-md-6"><textarea class="form-control"
										name="txt_description" required id="txt_description"
										placeholder="Enter Detials"><%=drive_description%></textarea></td>
							</tr>
							<tr>
								<th colspan="2"><label style="color: White; font-size: 18px;">Marks Criteria</label></th>
						</tr>
						<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">10th Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_10_marks" required
									id="txt_Page" value="<%=marks_10%>"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">12th Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_12_marks" required
									id="txt_Page" value="<%=marks_12%>"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Graduation Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_grad_marks" required
									id="txt_Page" value="<%=marks_gd%>"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Post Graduation Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_Post_marks" required
									id="txt_Page" value="<%=marks_pgd%>"></td>
							</tr>
							
							<tr>
								<td class="col-md-6" colspan="2" align="center"><input
									type="submit" class="btn btn-primary" name="btn_Submit"
									id="btn_Submit" Value="Update Details"></td>
							</tr>
						</table>
					</div>
				</form>

			</div>
		</div>
	</div>
	</section>
	<!-- End testomial Area -->



	<!-- start footer Area -->
	<footer class="footer-area" style="height:20px;">
	<p class="col-lg-8 col-sm-12 footer-text m-0">
		Copyright &copy;
		<script>
			document.write(new Date().getFullYear());
		</script>
		All rights reserved | This template is made with <i
			class="fa fa-heart-o" aria-hidden="true"></i> by <a
			href="https://colorlib.com" target="_blank">Colorlib</a>
	</p>

	</footer>
	<!-- End footer Area -->

	<script src="js/vendor/jquery-2.2.4.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>
	<script src="js/easing.min.js"></script>
	<script src="js/hoverIntent.js"></script>
	<script src="js/superfish.min.js"></script>
	<script src="js/mn-accordion.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.circlechart.js"></script>
	<script src="js/mail-script.js"></script>
	<script src="js/main.js"></script>
</body>
</html>