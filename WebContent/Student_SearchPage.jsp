<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.Date"%>
<%@page import="com.connection.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
		<title>Online Orphange Project</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
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
				           <li class="menu-active"><a href="StudentHomePage.jsp">HOME</a></li>
				          <li><a href="Student_SearchPage.jsp">Student_Search</a></li>
				           <li><a href="Student_trainingprogram_ShowData.jsp">Show Training Program</a></li>
				            <li><a href="Student_webinar_ShowData.jsp">Show Webinar</a></li>
				          <li><a href="Student_external_ShowData.jsp">Show External</a></li>
				           <li><a href="Login">LOGOUT</a></li>
				        </ul>
				      </nav><!-- #nav-menu-container -->		    		
			    	</div>
			    </div>
			  </header><!-- #header -->
			  	
			<!-- Start testomial Area -->
			<section class="testomial-area section-gap" id="testimonail">
				<div class="container">
					<div >
						<div >
							<div class="title text-center">
								<h1 class="mb-10 text-white">Show Data</h1>
								<br>
							</div>
			<div class="form-group">
			<form method="post" action="search_info">
			<table class="table table-responsive table-bordered">

							<tr>
								<td class="col-md-2"><label for="txt_Pdescription"
									style="color: White; font-size: 18px;">Job Field </label></td>
								<td class="col-md-6"><textarea class="form-control"
										name="txt_description" required id="txt_description"
										placeholder="Enter Detials"></textarea></td>
							</tr>
							<tr>
								<th colspan="2"><label style="color: White; font-size: 18px;">Marks Criteria</label></th>
						</tr>
						<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">10th Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_10_marks" required
									id="txt_Page" placeholder="Enter 10th Marks"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">12th Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_12_marks" required
									id="txt_Page" placeholder="Enter 12th Marks"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Graduation Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_grad_marks" required
									id="txt_Page" placeholder="Enter Graduation Marks"></td>
							</tr>
							<tr>
								<td class="col-md-2"><label for="txt_Pquantity"
									style="color: White; font-size: 18px;">Post Graduation Marks</label></td>
								<td class="col-md-6"><input type="text"
									class="form-control" name="txt_Post_marks" required
									id="txt_Page" placeholder="Enter Post Graduation Marks"></td>
							</tr>
							
							<tr>
								<td class="col-md-6" colspan="2" align="center"><input
									type="submit" class="btn btn-primary" name="btn_Submit"
									id="btn_Submit" Value="Search"></td>
							</tr>
						</table>
					</form>
				</div>

				

			
			
				</div>
		

						</div>
					</div>						
					</div>	
			</section>
			<!-- End testomial Area -->				
			
	

			<!-- start footer Area -->		
		<footer class="footer-area" style="height:20px;">
			<p class="col-lg-8 col-sm-12 footer-text m-0">Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a></p>

			</footer>
			<!-- End footer Area -->	

			<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
			<script src="js/vendor/bootstrap.min.js"></script>			
			<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>
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