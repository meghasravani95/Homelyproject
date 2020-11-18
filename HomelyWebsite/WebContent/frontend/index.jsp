<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homely - Order Home made food</title>
<!-- Required meta tags always come first -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">

<link href="css/stylesheet.css" rel="stylesheet">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="node_modules/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="node_modules/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="node_modules/bootstrap-social/bootstrap-social.css">
</head>


<body>

	<jsp:directive.include file = "header.jsp" />

	<div class="container mw-100">
		<div class="row">
			<div id="indexcarousel" class="carousel slide bodywidth"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#indexcarousel" data-slide-to="0" class="active"></li>
					<li data-target="#indexcarousel" data-slide-to="1"></li>
					<li data-target="#indexcarousel" data-slide-to="2"></li>
					<li data-target="#indexcarousel" data-slide-to="3"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="images/index1.png" class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Choose your chef</h5>
							<p>By entering your zipcode after login, you can choose the
								chef within your area.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="images/index2.png" class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Select the Dish</h5>
							<p>After selecting the chef, select one of the dish prepared
								by the chef.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="images/index3.gif" class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Get your delivery</h5>
							<p>We will pickup from the chef and deliver the food to your
								doorstep.</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="images/index4.png" class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Provide your Feedback</h5>
							<p>You can provide your feedback to the chef.</p>
						</div>
					</div>
				</div>

				<a class="carousel-control-prev" href="#indexcarousel" role="button"
					data-slide="prev"> <span class="carousel-control-prev-icon"
					aria-hidden="true"></span> <span class="sr-only">Next</span>
				</a> <a class="carousel-control-next" href="#indexcarousel"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>

	</div>

	<jsp:directive.include file="footer.jsp" />

	<!-- jQuery first, then Popper.js, then Bootstrap JS. -->
	<script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
	<script src="node_modules/popper.js/dist/umd/popper.min.js"></script>
	<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>