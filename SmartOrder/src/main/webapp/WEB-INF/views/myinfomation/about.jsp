<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>안녕하세요 임성현입니다.</title>
<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/bootstrapfile/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom fonts for this template -->
<link
	href="${pageContext.request.contextPath}/bootstrapfile/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link
	href="${pageContext.request.contextPath}/bootstrapfile/css/clean-blog.min.css"
	rel="stylesheet">
</head>
<body>

  <!-- header -->
	<header class="masthead" style="background-image: url('${pageContext.request.contextPath}/bootstrapfile/img/bg-masthead.jpg')">
    <div class="overlay"></div>
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="page-heading">
            <h1>Smart Order</h1>
            <span class="subheading">
            	스마트 오더를 소개합니다.</span>
          </div>
        </div>
      </div>
    </div>
  	</header>

	<!-- navi -->
	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="index.html">스마트오더</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="/">홈</a></li>
					<li class="nav-item"><a class="nav-link"
						href="kihooninfomation">스마트오더</a></li>
					<li class="nav-item"><a class="nav-link" href="/board/list">게시판</a>
					</li>
					<c:if test="${storememberinfo.result == null}">
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath}/user/login">로그인</a></li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath}/user/register">회원가입</a></li>

					</c:if>
					<c:if test="${storememberinfo.result == true}">

						<!-- member.verify  이부분은 아직 미완성 -->
						<c:if test="${member.verify == 9}">
							<li><a href="/admin/index">관리자 화면</a></li>
						</c:if>
						<li class="nav-item"><a class="nav-link"
							href="/shop/cartList">카트</a></li>
						<li class="nav-item"><a class="nav-link"
							href="/shop/orderList">주문내역</a></li>

						<li class="nav-item"><a class="nav-link" href="/user/update">회원정보수정</a>
						</li>
						<li class="nav-item"><a class="nav-link"
							href="/user/secession">회원탈퇴</a></li>
						<li class="nav-item"><a class="nav-link" href="/user/signout">로그아웃</a>
						</li>
					</c:if>

				</ul>
			</div>
		</div>
	</nav>

  <!-- Main Content -->
  <div class="container">
    <div class="row">
      <div class="col-lg-8 col-md-10 mx-auto"> 
        <p>프로젝트명 : Smart Order</p>
        <p>수행 : 임성현,배기훈 </p>
        <p>프로젝트 소개 : </p>
        <p>메뉴의 변화가 자주 있을 수 있는 식당에서 메뉴판을 가져다 주지 않아도  
            고객이 메뉴를 간편하게 볼 수 있으며 주문할 수 있는 시스템을 만들고 싶었습니다.  
            ajax를 이용하여 페이지 이동없이 원하는 메뉴 섹터의 메뉴를 가져올 수 있고, 그것에 대해 ajax를 이용하여  
            모달창에 메뉴의 상세정보를 출력합니다.  
            로그인을 하면 회원정보 수정 및 탈퇴, 로그아웃을 구현했습니다.  
            Kakao API 를 이용하여 위치정보를 받아올 수 있게 구현했습니다.</p>
        <p>개발환경 :</p>
        <p>Operating System: Windows 10, Mac OS X</p>
        <p>Database: MySQL </p>
        <p>Web Application Server: Apache Tomcat 9.0</p>
        <p>IDE: STS 3</p>
      	<p>Framework: Spring, MyBatis</p>
      	<p>SCM: Git Hub</p>
      	<p>Test: JUnit</p>
      	<p>Build Tool: Maven</p>
      </div>
    </div>
  </div>

  <hr>

  <!-- footer -->
	<%@ include file="../include/footer.jsp"%>

</body>
	<!-- Bootstrap core JavaScript -->
	<script
		src="${pageContext.request.contextPath}/bootstrapfile/vendor/jquery/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrapfile/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Custom scripts for this template -->
	<script
		src="${pageContext.request.contextPath}/bootstrapfile/js/clean-blog.min.js"></script>
</html>