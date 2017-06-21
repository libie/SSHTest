<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="s" uri="/struts-tags" %>--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
    This is my JSP page. <br>
    <div>
    <br/><br/><br/>
    <center>
    	<b>测试内容</b>
    	<%--<s:actionerror/>--%>
    	<form action="getPerson.action" method="post">
    		<input type="text" id="personno" name="person.personno"/>
    		<input type="submit" value="提交"/> 
    	</form>
    </center>
    </div>
  </body>
</html>
