<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home</title>
</head>
<body>
	<div style="text-align:center">
		<h2>
			<fmt:message key="web.title" />
		</h2>
		<ul>
			<li><a href="new-employee-creation.do"><fmt:message key="employee.create" /></a></li>
			<li><a href="search-employee-view.do"><fmt:message key="employee.search"/></a></li>
			<li><a href="employees-view.do"><fmt:message key="employee.view.all" /></a></li>
			<li><a href="new-customer-creation.do"><fmt:message key="customer.create" /></a></li>
			<li><a href="new-valid-customer-creation.do"><fmt:message key="customer.create.validation" /></a></li>
			<li><a href="new-customer-creation-with-back-bean.do"><fmt:message key="customer.create.bean" /></a></li>
		</ul>
	</div>
</body>
</html>