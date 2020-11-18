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
<title>Homely Admin</title>
</head>


<body>
	<jsp:directive.include file="header.jsp" />
	<div align="center">
		<h2>Administrative Dashboard</h2>
	</div>

	<div align="center">
		<hr width="30%"/>	
		<h2>Quick Actions:</h2>
		<a href="create_dish">New Dish</a> &nbsp;
		<a href="create_user">New User</a> &nbsp;
		<a href="create_category">New Category</a> &nbsp;
		<a href="create_customer">New Customer</a>
		<hr width="40%" />	
	</div>

	<div align ="center">
		<h2>Recent Sales:</h2>
	</div>

	<div align ="center">
		<h2>Recent Reviews:</h2>
	</div>
	
	<div align ="center">
		<h2>Statistics:</h2>
	</div>
	

	<jsp:directive.include file="footer.jsp" />
</body>
</html>