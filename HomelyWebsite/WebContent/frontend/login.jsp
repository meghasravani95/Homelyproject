<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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

	<div class="loginimg">

		<div class="container" style="min-height: 700px;">
			<div class="row">
				<div class="col-12 col-sm-12">

					<!--<img src="images/chef.jpg"> -->

					<form min-height="500px">
						<h5 style="color: rgba(252, 186, 6, 0.788); margin-top: 100px">Login</h5>
						<div class="form-group-row "
							style="margin-bottom: 20px; margin-top: 20px">

							<div class="col-sm-6">
								<input type="email" class="form-control" id="email" name="email"
									placeholder="Email" required />
							</div>
						</div>

						<div class="form-group-row "
							style="margin-bottom: 20px; margin-top: 20px">

							<div class="col-sm-6">
								<input type="password" class="form-control" id="password"
									name="password" placeholder="Password" required />
							</div>
						</div>

						<div class="offset-sm-2">
							<p>
								<a href="./signup.html" style="margin-right: 10px;">Not a
									Member?</a>
							</p>
						</div>

						<div class="form-group row" style="margin-bottom: 20px;">
							<div class=" col-sm-6 offset-sm-2">
								<button type="Signup" class="btn btn-primary">Login</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<jsp:directive.include file = "footer.jsp" />
	<!-- jQuery first, then Popper.js, then Bootstrap JS. -->
	<script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
	<script src="node_modules/popper.js/dist/umd/popper.min.js"></script>
	<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>

</body>
</html>