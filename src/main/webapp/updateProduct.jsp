<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="lATIN1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product</title>
<link rel="stylesheet" href="style.css">
<!--  Essa lina sx:head é muito importante para os componentes sx: funcionarem -->
<sx:head />

</head>

<body>
	<%@ include file="header.jsp"%>


	<div align="center">
		<h2>Update Product</h2>
		<s:form action="updateAction" class="formTable">

			<s:textfield name="id" label="Product Id" class="formTextField"
				readonly="true" />
			<s:textfield name="name" label="Product Name" class="formTextField" />
			<s:textfield name="category" label="Product Category"
				class="formTextField" />
			<s:textfield name="price" label="Product Price" class="formTextField" />

			<sx:datetimepicker name="createdDate" label="Create Date"
				displayFormat="dd/MM/yyyy"/>

			<s:submit value="Update Product" class="actionBtn" />


		</s:form>
	</div>

</body>
</html>