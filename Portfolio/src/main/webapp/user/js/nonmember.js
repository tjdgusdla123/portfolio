window.addEventListener("load", function(event){


	var joinbtn = document.getElementById("joinbtn");
	var mainbtn = document.getElementById("mainbtn");
	var loginbtn = document.getElementById("loginbtn");
	var allmenubtn = document.getElementById("allmenubtn");
	
	//버튼을 눌렀을 때 페이지 이동
	mainbtn.addEventListener("click", function(event){
		location.href="../";
	});
	loginbtn.addEventListener("click", function(event){
		location.href="login";
	});
	//버튼을 눌렀을 때 페이지 이동
	mainbtn.addEventListener("click", function(event){
		location.href="../";
	});
	loginbtn.addEventListener("click", function(event){
		location.href="login";
		});
	
		joinbtn.addEventListener("click", function(event){
		location.href="join";
		});
		
		 allmenubtn.addEventListener("click", function(event){
		location.href="allmenu";
		});
		 
 	});