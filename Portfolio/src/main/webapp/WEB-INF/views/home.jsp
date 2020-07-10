<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp를 이용해서 데이터를 출력할 때는 이 코드는 거의 필수 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/user/css/home.css">
</head>
<body>
       <div align="center" class="body">
       <h2>회원 정보</h2>
       <table border="1">
       <tr class="header">
       <th width="80">닉네임</th>
       <th width="300">이메일</th>
      
        <th width="100">전화번호</th>
        
        
          
        </tr>
        <c:forEach var="storemember" items="${list}">
        <tr class="record">
        <td width="80"><a href="detail/${storemember.membernickname}">${storemember.membernickname}</a></td>
       <td width="300">${storemember.memberemail}</td>
        <td width="100">${storemember.memberphonenumber}</td>
        
     
       
        
        </tr>
        </c:forEach>
       </table>
       <ul>
		   <li>
	        	<a href=user/join class="list">회원가입</a>
	        	<a href=login class="list">로그인</a>
	        	<a href=Nonmembers class="list">비회원</a>
	        
		   </li>
		</ul>
       </div>
</body>
</html>