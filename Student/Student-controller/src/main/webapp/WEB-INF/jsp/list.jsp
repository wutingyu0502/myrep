<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/bootstrap-4.0.0-beta.2-dist/css/bootstrap.min.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-1.8.3.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function selAll_()
	{
		var status = $("[name='all']").prop("checked");
		var che = $("[name='sel']");
		for(var i in che)
			{
				che[i].checked=status;
			}
	}
	
	function add_()
	{
		location.href="<%=request.getContextPath()%>/stu/add"
	}
	function upd_(a)
	{
		location.href="<%=request.getContextPath()%>/stu/upd?sid="+a;
	}
</script>
</head>
<body>
<table>
	<tr>
		<td colspan="5">
			<input type="button" value="添加" onclick="add_()">
		</td>
	</tr>
	<tr>
		<td><input type="checkbox" name="all" onclick="selAll_()">全选</td>
		<td>编号</td>
		<td>姓名</td>
		<td>入学时间</td>
		<td>爱好</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list}" var="s">
		<tr>
			<td><input type="checkbox" value="${s.sid }" name="sel"></td>
			<td>${s.sid }</td>
			<td>${s.sname }</td>
			<td><fmt:formatDate value="${s.studyDate }"/></td>
			<td>${s.hname }</td>
			<td>
				<input type="button" value="修改" onclick="upd_(${s.sid})">
				<input type="button" value="删除" onclick="del_()">
			</td>
		</tr>
	</c:forEach>
</table>
${first }
${prev }
${next }
${last }
</body>
</html>