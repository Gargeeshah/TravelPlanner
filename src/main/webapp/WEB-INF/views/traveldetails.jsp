<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="sf" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>India-Mexico-USA Travel Planner</title>

<link rel="stylesheet" href="/Go/css/travelplanner.css" />

</head>
<body>

<div class = "Travel-form" ><h1>Travel Planner for India-Mexico-USA </h1></div>
<div class = "main">
<sf:form  action = "http://localhost:8080/travelregistration"  modelAttribute="travelform" method="POST">
	
	<h3 class = "name"> Name </h3>
	<sf:input class = "fullname" type = "text" path="Name" name = "full_name"/> <sf:errors class = "errorname" path="Name"/>   
	<label class="fullnamelabel"> FullName </label>
	 
	
	<h3 class = "name"> Email</h3>
	<sf:input class = "email" type = "text" path="Email"/> <sf:errors class = "errormail" path="Email"/>   
	
	<h3 class = "name"> Phone no.</h3>
	<sf:input class = "phone" type = "text" path="Phone"/> <sf:errors class = "errorphone" path="Phone"/>  
	
	<h3 class = "name"> No of travelers</h3>
	<sf:input class = "nooftravellers" path="Number_Of_Travelers"/> 
	
	<h3 class = "name"> Origin City</h3>
	<sf:input class = "origincity" path="Origin_City"/><sf:errors class = "errors" path="Origin_City"/>   
	
	<h3 class = "name">Destination</h3>
	<sf:input class = "destinationcity" path="Destination_City"/>  <sf:errors class = "errors" path="Destination_City"/>   
	
	<h3 class = "name">Travel Date</h3>
	<sf:input class = "traveldate" path="Travel_Date" type = "date"/> <sf:errors class = "errors" path="Travel_Date"/>    
	
	<h3 class = "name">Language prefer</h3>
	<%-- <sf:input class = "language" path="Languages_Spoken"/> --%>
	<sf:select class = "option" path="Languages_Spoken">
	<option disabled="disabled" selected = "selected">--Choose Language--</option>  
	<option>English </option>
	<option>Hindi </option>
	</sf:select>
	<sf:errors class = "errors" path="Languages_Spoken"/>
	
	
	<h3 id = "traveller">Tickets booked</h3>
	<label class = "radio">
	<sf:radiobutton class = "radio-one" path="Tickets_booked" value = "Yes"/>Yes&nbsp; 
	</label>
	<label class = "radio">
	<sf:radiobutton class = "radio-two" path="Tickets_booked" value = "No"/>No&nbsp; 
	</label>
	<sf:errors class = "check" path="Tickets_booked"/>
	
	
	<div>
  	<input type="checkbox" name="terms_conditions" id="terms_conditions" required/>
  	<label class = "tnclabel" for="terms_conditions"><b>I agree to the Terms and Conditions</b></label>
   	</div>
	
	 <sf:button name="Submit" value="Submit">Submit</sf:button>
	 
	
</sf:form>
</div>

</body>
</html>