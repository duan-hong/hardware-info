<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/27
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/"+request.getContextPath()+"/";
    //查看Cookie
    String loginUserName="";
    String loginUserPwd="";
    Cookie[] cookies=request.getCookies();
    if(cookies!=null){
        for (Cookie cookie:
                cookies) {
            if ("username".equals(cookie.getName())){
                loginUserName=URLDecoder.decode(cookie.getValue(),"utf-8");
                System.out.println(loginUserName);
            }
            if ("userpwd".equals(cookie.getName())){
                loginUserPwd=URLDecoder.decode(cookie.getValue(),"utf-8");

                System.out.println(loginUserName);
            }
        }
    }
%>
<html>
<head>
    <script type="text/javascript" src="jquery-2.1.0.min.js"></script>
    <base href="<%=basepath%>">
    <link href="css/common.css" rel="stylesheet" type="text/css">
    <title>computer-info</title>
</head>
<body>
	<label style="font-size=18px">高家豪</label>
</body>
</html>
