<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>

  </head>
  
  <body>
  	<%--使用通配符，访问动作类和动作方法
    <a href="${pageContext.request.contextPath}/addUser.jsp">添加</a>
    <a href="${pageContext.request.contextPath}/updateUser.jsp">更新</a>
    <a href="${pageContext.request.contextPath}/deleteUser.jsp">删除</a>
    <a href="${pageContext.request.contextPath}/findUser.jsp">查询</a>
     --%>
     
     <%--动态方法调用 
     		动作方法！动作方法名称.action
     		动作名称！动作方法名称
     --%>
	<a href="${pageContext.request.contextPath}/user!addUser.action">添加</a>
	<a href="${pageContext.request.contextPath}/user!updateUser.action">更新</a>
	<a href="${pageContext.request.contextPath}/user!deleteUser.action">删除</a>
	<a href="${pageContext.request.contextPath}/user!findUser.action">查询</a>
  </body>
</html>
