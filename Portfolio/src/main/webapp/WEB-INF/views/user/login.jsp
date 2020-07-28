user 디렉토리에 login.jsp 파일을 생성하고 작성
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/user/css/login.css">

</head>

<body>
	<h1>스마트오</h1>
	<div class="inner_login">
		<div class="login_myweb">
			<div id="msg" class="msg"></div>
			<form method="post" id="loginform">
				<fieldset>
					<legend class="screen_out">로그인</legend>
					<div class="box_login">
						<div class="inp_text">
							<label for="membernickname" class="screen_out">이메일</label>
							 <input type="text" id="membernickname" name="membernickname" placeholder="닉네임을 입력하새요">
						</div>
						<div class="inp_text">
							<label for="memberpassword" class="screen_out">비밀번호</label> 
							<input type="password" id="memberpassword" name="memberpassword" placeholder="비밀번호를 입력하세요!">
						</div>
					</div>
				</fieldset>
			</form>

			<div class="login_append" align="center">
				<a href="" class="link_find">아이디 찾기</a>
				 <a href="" class="link_find">비밀번호 찾기</a> 
					<a href="join" class="link_find">회원가입</a>
				<a href="" class="link_find">메인으로</a>
			</div>
		</div>
	</div>

	<button class="btn_login" id="loginbtn">로그인</button>
	<div class="login_append">
		<div class="inp_chk">
			<input type="checkbox" id="keepLogin" class="inp_radio" name="keepLogin">
			 <label for="keepLogin" class="lab_g">
				<span class="img_top ico_check"></span> <span class="txt_lab">로그인상태 유지</span>
			</label>
		</div>
	</div>

</body>
<script src="${pageContext.request.contextPath}/user/js/login.js"></script>
</html>


