<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1st JSP 파일</title>
<link rel="stylesheet" type="text/css" href="/jspcls/css/w3.css">
<link rel="stylesheet" type="text/css" href="/jspcls/css/cls.css">
<script type="text/javascript" src="/jspcls/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/jspcls/js/main.js"></script>
<script type="text/javascript">
	$(function(){
		var sid = '${SID}';
		if(sid){
			$('#lbtn').css('display', 'none');
			$('#btnfr').css('display', 'block');
		}
	});
</script>
</head>
<body>
	<div class="w3-content w3-center mw700">
		<h1 class="w3-teal w3-padding">CLS Project</h1>
		<div class="w3-col w3-padding w3-margin-top">
			<h5 class="w3-col w3-button w3-indigo w3-hover-light-blue" id="lbtn">Login</h5>
			<div class="w3-col" id="btnfr" style="display: none;">
				<h5 class="w3-cell m2 w3-button w3-red w3-hover-light-pink" id="obtn">LogOut</h5>
			</div>
		</div>
	</div>
</body>
</html>