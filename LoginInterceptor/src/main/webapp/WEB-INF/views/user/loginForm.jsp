<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<title>in</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- CSS -->
<link rel="stylesheet" href="/resources/css/reset.css">
<link rel="stylesheet" href="/resources/css/sewerage.css">
</head>
<body>
	<div class="frame" style="overflow: hidden;">
		<div class="login_box xyCenter_for_loginbox">
			<div class="logo">
				<img src="/resources/img/logo.png" alt="logo">
			</div>
			<form id="form">
				<div class="login_boxline">
					<div class="title_box">
						<div class="login_title xyCenter">
							<div class="yCenter">
								<img src="/resources/img/titleicon.png">
							</div>
							<div class="padding"></div>
							<div class="login_title_text">
								<div class="yCenter">in</div>
							</div>
						</div>
					</div>
					
					<div class="textbox">
						<input type="text" placeholder="아이디" name="userid"
							class=" xCenter" required>
					</div>
					<div class="pswbox">
						<input type="password" placeholder="비밀번호" name="userpw"
							class=" xCenter" required>
					</div>
					<div class="loginbutton_box ">
						<button type="submit" id="loginBtn" class="loginbutton xyCenter">로그인</button>
					</div>
					<div class="login_linebox">
						<div class="login_line xyCenter"></div>
					</div>

					<div class="others_button">
						<button type="button" id="idInsertBtn" class="left">회원가입</button>
						<button type="button" class="">도움말</button>
					</div>
				</div>
			</form>


		</div>
	</div>
	<!-- JS -->
	<script src="/resources/js/sewerage.js"></script>
	<script src="/resources/js/jquery-ver1_12_4.js"></script>
	<script src="/resources/js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			Set_Event();
			
			var form = $("#form");
			
			$("#loginBtn").on("click",function(){
				form.attr("action","loginProcess").attr("method","POST").submit();
			});
			
			
			$("#idInsertBtn").on("click",function(){
				form.attr("action","idInsertForm").attr("method","GET").submit();
			});
			
		});
		
		
		
		
		
	</script>
</body>
</html>
