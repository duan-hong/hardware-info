<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=utf-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
	#info-list li{ 
		list-style:none;
		font-size:26px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
<h2>username</h2>
<ul id="info-list">
<li>${userName}</li>
<li>${computerName}</li>
<li>${userDomain}</li>
<li>${computerName}</li>
<li>${totalMemory}</li>
<li>${freeMemory}</li>
</ul>

</body>
</html>