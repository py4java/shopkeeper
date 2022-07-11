<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display-stores</title>
</head>
<body>
	<h2>Near By Stores</h2>
	<table border="5" style="border:aqua;font-family: Roboto Mono;">
		<tr style="color: Red">
			<th>Store Code</th>
			<th>Store Name</th>
			<th>Contact Number</th>
			<th>Store Address</th>
		</tr>
		<c:forEach items="${listStores}" var="store">
			<tr style="color: blue">
				<td>${store.storeCode}</td>
				<td>${store.storeName}</td>
				<td>${store.contactNumber}</td>
				<td>${store.storeAddress}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>