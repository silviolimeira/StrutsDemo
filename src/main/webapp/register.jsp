<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="lATIN1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<s:head />
<body>
	<%@ include file="header.jsp"%>

	<h2>Registration Form</h2>
	<s:form action="registerAction" class="RegisterAction">
		<s:textfield key="global.firstName" name="firstName" />
		<s:textfield name="lastName" label="Last Name" />
		<s:radio name="gender" list="{'Male', 'Female'}" label="Gender" />
		<s:textfield name="age" label="Age" />
		<s:textfield name="email" label="Email" />
		<s:textarea name="address" cols="30" rows="7" label="Address" />
		<s:select multiple="true" list="colors" name="selectedColor"
			headerKey="None" headerValue="Select a color" label="Favourite Color" />
		<s:checkbox name="subscription" value="true"
			label="Subscribe to our newsletter" />
		<s:checkboxlist list="hobbies" name="selectedHobbies" label="Hobbies" />
		<s:reset value="Reset" />
		<s:submit value="Register" />
	</s:form>
	<table border="1" width="300">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Category</th>
			<th>Product Price</th>
		</tr>
		<s:iterator value="products" var="product">
			<tr>
				<td><s:property value="#product.id" /></td>
				<td><s:property value="#product.name" /></td>
				<td><s:property value="#product.category" /></td>
				<td><s:property value="#product.price" /></td>
			</tr>
		</s:iterator>
	</table>
	<div align="center">
		<s:url action="changeLocaleAction" var="urlEn">
			<s:param name="request_locale">en_US</s:param>
		</s:url>
		<a href="${urlEn}">English</a>
		<s:url action="changeLocaleAction" var="url_pt_BR">
			<s:param name="request_locale">pt_BR</s:param>
		</s:url>
		<a href="${url_pt_BR}">PortuguÍs Brasil</a>
	</div>

</body>
</html>