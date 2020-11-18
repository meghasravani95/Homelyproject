<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>Manage users</title>
</head>


<body>
	<jsp:directive.include file="header.jsp" />
	<div align="center">
		<h2>Users management</h2>
	<h3>
			<a href="user_form.jsp">Create New User</a>
		</h3>
	</div>
	<c:if test="${message != null}">
	<div align="center">
		<h4> <i>${message}</i></h4>
	</div>
	</c:if>

	<div align="center">
		<table border="1" cellpadding="15">
			<tr>
				<th>Index</th>
				<th>ID</th>
				<th>Full Name</th>
				<th>Email</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="user" items="${listusers}" varStatus="status"> 
			<tr>
				<td>${status.index+1}</td>
				<td>${user.userid}</td>
				<td>${user.email}</td>
				<td>${user.fullname}</td>
				<td>
					<a href="">Edit</a> &nbsp;
					<a href="">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	

	<jsp:directive.include file="footer.jsp" />
	
</body>
</html>