<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css">
<script src= "${pageContext.request.contextPath}/user/js/login.js"></script>

</head>
<body>
	<h1>스마트 오더</h1>
	<div class="inner_login">
		<div class="login_myweb">
			<div id="msg" class="msg"></div>
			<form method="post" id="loginform" action="login">
				<fieldset>
					<legend class="screen_out">로그인 정보 입력폼</legend>
					<div class="box_login">
						<div class="inp_text">
							<label for="memberemail" class="screen_out">닉네임</label> <input type="email" id="memberemail" name="memberemail" placeholder="닉네임 을력하세요!">
						</div>
						<div class="inp_text">
							<label for="memberpassword" class="screen_out">비밀번호</label> <input
								type="password" id="memberpassword" name="userpw"
								placeholder="비밀번호를 입력하세요!">
						</div>
					</div>
					<button type="button" class="btn_login">로그인</button>
					<div class="login_append">
						<div class="inp_chk">
						<input type="checkbox" id="keepLogin" class="inp_radio" name="keepLogin"> <label for="keepLogin" class="lab_g">
								<span class="img_top ico_check"></span> <span class="txt_lab">로그인상태 유지</span>
							</label>
						</div>
					</div>
					<div class="login_append" align="center">
					     
						<a href="" class="link_find">아이디 찾기</a> 
						<a href="" class="link_find">비밀번호 찾기</a> 
						<input type="button" value="회원가입"  id="joinbtn"/> 
				        <input type="button" value="메인" id="mainbtn" /> >
			
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>