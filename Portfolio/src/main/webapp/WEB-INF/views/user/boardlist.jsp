<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="box-body">
		<table class="table table-bordered table-hover">
			<tr>
				<th width="11%">글번호</th>
				<th width="46%">제목</th>
				<th width="16%">작성자</th>
				<th width="16%">작성일</th>
				<th width="11%">조회수</th>
			</tr>
			<c:forEach var="storememberboard" items="${list}">
				<tr>
					<td align="right">${storememberboard.boardbno}&nbsp;</td>
					<td>&nbsp; ${storememberboard.boardtitle}</td>
					<td>&nbsp;${storememberboard.membernickname}</td>
					<td>&nbsp; ${storememberboard.boarddispdate}</td>
					<td align="right"><span class="badge bg-blue">
							${storememberboard.boardreadcnt}</span>&nbsp;</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="box-footer">
		<div class="text-center">
			<button id='mainBtn' class="btn-primary">메인으로</button>
		</div>
</body>
</html>