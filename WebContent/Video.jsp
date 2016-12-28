<%@page import="model.Data"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Data l = (Data)session.getAttribute("data"); %>

<div class="login-card">

 <video src="<%=l.getPathLink() %>"  width="500" height="300" controls>
<track src="<%=request.getContextPath() %>/<%=l.getSubName()%>.vtt" label="English"  kind="subtitles" srclang="en" default/>
Your browser does not support the <video> element.  
</video>
   
</div>
<link rel="stylesheet" href="styleVideo.css" />
</body>
</html>