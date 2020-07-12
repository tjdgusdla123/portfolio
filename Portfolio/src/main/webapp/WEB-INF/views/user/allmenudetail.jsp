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
		<h2>메뉴 상세보기</h2>
		<table border="1">
			<tr class="header">			
				<td>
					<table>
						<tr height="50">
							<td width="80">메뉴코드</td>
							<td width="160">${storemenu.menucode}</td>
						</tr>
						<tr height="50">
							<td width="80">메뉴명</td>
							<td width="160">${storemenu.menuname}</td>
						</tr>
						<tr height="50">
							<td width="80">메뉴설명</td>
							<td width="160">${storemenu.menuinfo}</td>
						</tr>
							<tr height="50">
							<td width="80">가격</td>
							<td width="160">${storemenu.menuprice}</td>
						</tr>
							<tr height="50">
							<td width="80">메뉴사진</td>
							<td width="160">${storemenu.menuphoto}</td>
						</tr>
							<tr height="50">
							<td width="80">메뉴구분</td>
							<td width="160">${storemenu.menusection}</td>						
						<tr>
							<td colspan="2" align="center" width="240"><a
								href="${pageContext.request.contextPath}/" class="menu"> ■목록으로 돌아가기 </a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
