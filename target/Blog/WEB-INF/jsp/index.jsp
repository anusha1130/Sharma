<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<div data-ng-app="myApp" data-ng-controller="formCtrl">
<form name="formData" >

ProductId : <input type="text" data-ng-model="pid">

Product Name : <input type="text" data-ng-model="pname">
			
Product Description : <input type="text" data-ng-model="pdescription"> 
			
Price    : <input type="number" data-ng-model="price">
		
               <button type="submit">Submit</button>   <button type="reset">Reset</button>    
		
	    
</form>
</div>

	
</body>
</html>