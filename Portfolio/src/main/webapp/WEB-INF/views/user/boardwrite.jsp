<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 작성 </title>
<script src= "${pageContext.request.contextPath}/user/js/board.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/user/css/boardwrite.css">
</head>
<body>
	<form name="boardform" enctype="multipart/form-data">
        <h1 align="center">게시글 작성</h1> 
        	<div align="center" id="msg"></div>  
       <ul>	
     
      <li> 
     <label for="boardtitle">제목</label>
      <input name='boardtitle' id="boardtitle"> <br/>
     </li>
      
      <li>
     <label for="boardcontents">내용</label>
     <textarea id="boardcontents" neme="boardcontents" rows="5"></textarea><br/>
     </li>
     
      <li>
     <label for="membernickname">작성자</label> 
     <input id="membernickname" name='membernickname' value="${storememberboard.membernickname}" readonly="readonly"><br/>
     </li>
          <li>   
        <p></p><img id="img" width="100" height="100" border="1"/><br/>
       </li>
      
        <li>
        <input type="file" id="boardfile" name="boardfile" accept=".jpg,.jpeg,.gif,.png"/><br/>
          </li>
          <div id="boardfilemsg" >  </div> 
          
           <input type="button" id="writebtn">작성완료</button>
           <button type="reset" id="resetbtn">다시작성</button>
           <input type="button" value="메인으로"  id="mainbtn"/>
           </ul> 
	</form>
</body>
</html>