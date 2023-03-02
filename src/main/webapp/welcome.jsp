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
		<s:url action="changeLocaleAction" var="urlEn">
			<s:param name="request_locale">en</s:param>
		</s:url>
		<a href="${urlEn}">English</a>
		<s:url action="changeLocaleAction" var="url_pt_BR">
			<s:param name="request_locale">br</s:param>
		</s:url>
		<a href="${url_pt_BR}">Português Brasil</a>		
	</div>

	<table width="750" class="productTable" align="center">
		<thead>
			<tr>
				<th><s:text name="global.productId" /></th>
				<th><s:text name="global.productName" /></th>
				<th><s:text name="global.productCategory" /></th>
				<th><s:text name="global.productPrice" /></th>
				<th colspan="2"><s:text name="global.actions" /></th>
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