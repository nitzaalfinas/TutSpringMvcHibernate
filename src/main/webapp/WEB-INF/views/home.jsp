<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
	        <h1>Student List</h1>
        	<table border="1">
	        	<th>No</th>
	        	<th>Full Name</th>
	        	<th>Address</th>
	        	<th>Phone</th>
	        	
				<c:forEach var="stu" items="${students}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${stu.full_name}</td>
					<td>${stu.address}</td>
					<td>${stu.phone}</td>
					<td><a href="<c:url value="/edit/${stu.id}"/>">Edit</a></td>
							
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>
