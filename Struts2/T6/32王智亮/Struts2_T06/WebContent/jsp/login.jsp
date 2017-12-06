<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="login.title"></s:text>登录界面</title>
</head>
<body>
	<h2>
		<s:text name="user.login"></s:text>
	</h2>
	<s:fielderror></s:fielderror>
	<s:form action="LoginUser" namespace="/" method="post"></s:form>
	<s:textfield key="lable.uname" name="user.uname" required="true"/>
	<br/>
	<s:password key="lable.upwd" name="user.upwd" required="true"/>
	<br/>
	<s:submit key="lable.login" style="text-align:left;"/>
	<br/>
	<s:url id="localeEn" namespace="/" action="local">
		<s:param name="requset_locale">en_US</s:param>
	</s:url>
	<s:url id="localezhCN" namespace="/" action="local">
		<s:param name="requset_locale">zh_CN</s:param>
	</s:url>
	<s:a href="%{localeEn}">English</s:a>
	<s:a href="%{localezhCN}">中文</s:a>
</body>
</html>