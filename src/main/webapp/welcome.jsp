<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="lATIN1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div align="center">
		<h2>Welcome</h2>
		<a href="addProduct.jsp">
			<button class="actionBtn">Add New Product</button>
		</a>
	</div>

	<table width="750" class="productTable" align="center">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>
		<s:iterator value="products" var="product">
			<tr>
				<td><s:property value="#product.id" /></td>
				<td><s:property value="#product.name" /></td>
				<td><s:property value="#product.category" /></td>
				<td><s:property value="#product.price" /></td>
				<td><a
					href="updateDataAction?id=<s:property value="#product.id"/>">
						<button class="actionBtn">Update</button>
				</a></td>
				<td><a
					href="deleteAction?id=<s:property value="#product.id"/>">
						<button class="actionBtn">Delete</button>
				</a></td>

			</tr>
		</s:iterator>
	</table>

</body>
</html>