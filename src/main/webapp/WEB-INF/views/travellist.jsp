<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="sf" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Travellers</title>
</head>
<body>
<h1>Data sheet of people travelling to USA</h1>
<table border = "1">
		<tr>
			<%-- <th>Id</th>--%>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Number Of Travellers</th>
			<th>Origin City in India</th>
			<th>Destination in USA</th>
			<th>Travel Date</th>
			<th>Languages Spoken</th>
			<th>Tickets booked</th>
			<th>Form Submitted</th>
			<th> Delete Entry </th>
		</tr>
		<c:forEach var="list" items="${travellerslist}" >
			<tr>
			
				<td>${list.getId()}</td>
				<td>${list.getName()}</td>
				<td>${list.getEmail()}</td>
				<td>${list.getPhone()}</td>
				<td>${list.getNumber_Of_Travelers()}</td>
				<td>${list.getOrigin_City()}</td>
				<td>${list.getDestination_City()}</td>
				<td>${list.getTravel_Date()}</td>
				<td>${list.getLanguages_Spoken()}</td>
				<td>${list.getTickets_booked()}</td>
				<td>${list.getBookingTime_Date()}</td>
				<td><a href="http:localhost:8080/delete">Delete</a></td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>