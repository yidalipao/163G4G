<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户首页</title>
</head>
<body>
	<center>
		<h2>所有用户信息</h2>
		<table border="1">
			<tr>
				<td>用户id</td>
				<td>用户名</td>
				<td>密码</td>
				<td>性别</td>
				<td>生日</td>
				<td>地址</td>
				<td>操作</td>
			</tr>
			<s:iterator value="userlist">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="uname" /></td>
					<td><s:property value="upwd" /></td>
					<td><s:property value="sex" /></td>
					<td><s:property value="address" /></td>
					<td><a href="delete?user.id=<s:property value="id" />">删除</a>
						<a href="getUpdate?user.id=<s:property value="id" />">修改</a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</center>
</body>
</html>