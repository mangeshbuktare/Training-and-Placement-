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
<link rel="stylesheet" href="css/NewFile.css">

</head>
<body>
	<header id="header" id="home">

	<div class="container main-menu">
		<div class="row align-items-center justify-content-between d-flex">
			<div id="logo">
				<marquee><h4> Jspm Imperial College Of Engineering And Research Wagholi</h4> </marquee>
			</div>
			<nav id="nav-menu-container">
			<ul class="nav-menu">
	
				<li class="menu-active"><a href="Login.jsp">Login</a></li>
				<li class="menu-active"><a href="RegisterPage.jsp">Register</a></li>

			</ul>
			</nav>
			<!-- #nav-menu-container -->
		</div>
	</div>
	</header>
	<!-- #header -->


	<!-- Start discount-section Area -->
	<section class="discount-section-area relative section-gap">
	<div class="overlay overlay-bg"></div>
	<div class="container">
		<div class="row align-items-center justify-content-between no-gutters">
			<div class="col-md-12 col-md-offset-3">
				<h3 required style="color:White" align="center">LOGIN</h3>

				<div class="col-md-6" style="margin-left: 25%;">
					<br>
					<br>
					<form role="form" action="Login" method="post"  autocomplete="off">
						<div class="form-group">
							<table class="table table-responsive table-bordered">
								<tr>
									<td class="lable"><label for="txt_Uname" style="color:White;font-size:18px;">Select Role</label></td>
									<td>
									<input type="radio" name="role" required style="color:White" value="TPO" ><label for="txt_Uname" style="color:White;font-size:18px;">T & P Officer</label></br>
									<input type="radio" name="role" required style="color:White" value="coordinator"><label for="txt_Uname" style="color:White;font-size:18px;">T & P Coordinator</label></br>
									<input type="radio" name="role" required style="color:White" value="hod" ><label for="txt_Uname" style="color:White;font-size:18px;">HOD</label></br>
									<input type="radio" name="role" required style="color:White"  value="student"><label for="txt_Uname" style="color:White;font-size:18px;">Student</label></br></td>
								</tr>
								<tr>
									<td class="col-md-2"><label for="txt_Uname"
										style="color: White; font-size: 18px;">User Mail Id:</label></td>
									<td class="col-md-6"><input type="text"
										class="form-control" name="txt_Uname" required id="txt_Uname"
										placeholder="Enter Mail id"></td>
								</tr>

								<tr>
									<td class="col-md-2">
									<label for="txt_Password" style="color: White; font-size: 18px;">User Password:</label></td>
									<td class="col-md-6">
									<input type="password" id="pass_log_id" class="form-control" name="txt_Password" required id="txt_Password" placeholder="Enter Password">
									</td>
								</tr>
								<tr>
									<td class="col-md-6" colspan="2" align="center"><input
										type="submit" class="btn btn-primary" name="btn_Submit"
										id="btn_Submit" Value="Login"></td>
								</tr>
							</table>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- End discount-section Area -->


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