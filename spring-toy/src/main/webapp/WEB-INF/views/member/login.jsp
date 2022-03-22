<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resources/css/member/login.css" rel="stylesheet"/>
<%@ include file="/WEB-INF/views/include/head.jsp" %>
</head>

<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<div class="content">
	<div class="frm_wrap">
		<h1>로그인</h1>
		<c:if test="${not empty param.msg}">
			<span class='valid-msg'>${param.msg}</span>
		</c:if>
		<hr>
		
		<form action="/member/login" method="post">
			<span class='tit'>ID  </span>
			<input type="text" name="userId" id="userId">
			<span class='tit'>Password  </span>
			<input type="password" name="password" id="password">
			<button>로그인</button>
		</form>
	</div>
</div>

<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>