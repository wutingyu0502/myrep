<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/bootstrap-4.0.0-beta.2-dist/css/bootstrap.min.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-1.8.3.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/stu/update" method="post">
<input type="hidden" value="${stu.sid }" name="sid">
姓名：<input type="text" name="sname" value="${stu.sname }"><br>
入学时间：<input type="text" name="studyDate" value="<fmt:formatDate value='${stu.studyDate }'/>" ><br>
爱好：<c:forEach items="${list }" var="h">
			<input type="checkbox" value="${h.hid }" 
			name="hid" <c:if test="${fn:contains(stu.hname,h.hname) }">checked</c:if>>${h.hname }
	</c:forEach>
	<br>
	<input type="submit" value="修改">
</form>
</body>
</html>