<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="login-card">
    <h1>Put link</h1><br>
  <form action="GetLinkServlet">
  	<p>Link Video</p> <br>
    <input type="text" name="link" > 
    <p>Name Of Sub File</p> <br>
    <input type="text" name="fileName"> 
    <input type="submit" name="login" class="login login-submit" value="Submit">
  </form>
    

</div>
<link rel="stylesheet" href="style.css" />

</body>
</html>