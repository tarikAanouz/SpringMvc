<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	
</head>
	<title>Customer Registration form</title>
	<style>.error{color:#c0392b}</style>
<body>

    <i>Fill out the form. Asterisk (*) means required.</i>
    
    <br><br>
	
	<form:form action="processForm" modelAttribute="customer">
		First name : <form:input path="firstName"/>
		
		<br><br>
		
		Last name (*) : <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		
	    <br><br>
	    
	    <input type="submit" value="Submit" />
	    
	    
		
	</form:form>

</body>


</html>