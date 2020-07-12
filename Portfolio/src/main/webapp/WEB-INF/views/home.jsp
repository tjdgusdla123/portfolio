<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp를 이용해서 데이터를 출력할 때는 이 코드는 거의 필수 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">
</head>
<body>
         <h1 style="text-align: center">안녕하세요</h1>
	<h1 style="text-align: center">스마트 오더입니다.</h1>
	 <ul>
		<li><a href="user/join">회원가입</a></li>

		<li><a href="user/login">로그인</a></li>
		<li><a href="user/nonmember">비회원입장</a></li>
	</ul>
      
</body>
</html>