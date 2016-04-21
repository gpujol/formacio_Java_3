<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Search employee</title>
<link rel="stylesheet" type="text/css" href="css/mystyles.css" media="screen" />
</head>
<body>
	<h1>Search employee</h1>
	<form:form action="search-employee.do" commandName="employeeSearchForm" method="post">
      <table>
          <tr>
              <td>First Name:</td>
              <td><form:input path="name" /></td>
              <td>Last Name:</td>
              <td><form:input path="surname" /></td>
          </tr>
          <tr>
              <td>Birthday from:</td>
              <td><form:input path="birthdayIni" /></td>
              <td>Birthday to:</td>
              <td><form:input path="birthdayEnd" /></td>
          </tr>
          <tr>
              <td colspan="4">
                  <input type="submit" value="Search" />
                  <a href="home.do">Back</a>
              </td>
          </tr>
      </table>
  </form:form>
  <h3>Employees list</h3>
	<table>
	    <thead>
			<tr>
				<th>First name</th>
	    		<th>Surname</th>
	    		<th>Birthday</th>
	    	</tr>
	    </thead>
	    <tbody>
	    	<c:forEach items="${employeeList}" var="emp">
	        	<tr>
	            	<td>${emp.name}</td>
	             	<td>${emp.surname}</td>
	             	<td>${emp.birthday}</td>
	         	</tr>
	     	</c:forEach>
	    </tbody>
    </table>
</body>
</html>