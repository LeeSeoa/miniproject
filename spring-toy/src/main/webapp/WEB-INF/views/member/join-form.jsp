<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resources/css/member/join.css" rel="stylesheet">
<%@ include file="/WEB-INF/views/include/head.jsp" %>
</head>

<body>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<div class="content">
	<div class="frm_wrap">
		<h1>회원 가입 양식</h1>
		<hr/>
	    <form:form modelAttribute="joinForm"
	   				   action="/member/join" method="post" id="frm_join" >
	     <table border="1">
	        <tr>
	           <th>ID  </th>
	           <td >
	              <input type="text" name="userId" id="userId" size="10" required/>
	           	  <form:errors path="userId" cssClass="valid-msg" id="idCheck"/>
	           </td>
	        </tr>
	        <tr>
	           <th>PASSWORD  </th>
	           <td>
	           	  <input type="password" name="password" id="password"
	           	  		placeholder="영어,숫자,특수문자 조합의 8글자 이상의 문자열입니다." 
	           	   required/>
	           	 <form:errors path="password" cssClass="valid-msg"/>
	           </td>
	        </tr>
	        <tr>
	           <th>Tell  </th>
	           <td>
	           	  <input id="tell" type="tel" name="tell" placeholder="숫자만 입력하세요"  
	           	  required/>
	           	  <form:errors path="tell" cssClass="valid-msg"/>
	           </td>
	        </tr>
	        <tr>
	           <th>EMAIL  </th>
	           <td>
	           	  <input type="email" name="email"  
	           	  required/>
	           </td>
	        </tr>
	        <tr>
	           <td colspan="2">
	              <input type="submit" value="가입" />
	           </td>
	       </tr>
	   </table>
	   </form:form>
	
	</div>
</div>

<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>