window.addEventListener("load", function(event){
var mainbtn = document.getElementById("mainbtn");
var joinbtn = document.getElementById("joinbtn");


//mainbtn 과 loginbtn을 눌렀을 때 페이지 이동
	mainbtn.addEventListener("click", function(event){
		location.href="../";
	});
	joinbtn.addEventListener("click", function(event){
		location.href="join";
	});
	});