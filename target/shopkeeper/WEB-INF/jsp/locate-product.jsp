<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>locate-product</title>
</head>
<body>
	<h1>Find Product</h1>

	<form
		action="${pageContext.request.contextPath}/get-product-stores.htm"
		method="post" style="color: red; font-family: Monaco; font-size: 20px">
		product code: <input type="text" name="productCode" /><br /> <input
			type="submit" value="nearByStores" />
	</form>
</body>
</html>