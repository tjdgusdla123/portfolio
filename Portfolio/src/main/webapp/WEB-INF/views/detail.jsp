<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/user/css/style.css">
</head>
<body>
	<div align="center" class=body>
		<h2>회원정보 상세 화면</h2>
		<table border="1">
			<tr class="header">			
				<td>
					<table>
						<tr height="50">
							<td width="80">닉네임</td>
							<td width="160">${storemember.membernickname}</td>
						</tr>
						<tr height="50">
							<td width="80">이메일</td>
							<td width="160">${storemember.memberemail}</td>
						</tr>
						<tr height="50">
							<td width="80">전화번호</td>
							<td width="160">${storemember.memberphonenumber}</td>
						</tr>
							<tr height="50">
							<td width="80">비밀번호</td>
							<td width="160">${storemember.memberpassword}</td>
						</tr>
							<tr height="50">
							<td width="80">회원로그인 여부</td>
							<td width="160">${storemember.memberislogin}</td>
						</tr>
							<tr height="50">
							<td width="80">회원 마지막 로그인</td>
							<td width="160">${storemember.memberlastlogindate}</td>
						</tr>
							<tr height="50">
							<td width="80">회원탈퇴 여부</td>
							<td width="160">${storemember.memberisremove}</td>
						</tr> 
						<tr>
							<td colspan="2" align="center" width="240"><a
								href="${pageContext.request.contextPath}/"> ■목록으로 돌아가기 </a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
