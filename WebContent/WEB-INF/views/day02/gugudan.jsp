<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/jspcls/resources/css/w3.css">
</head>
<body>
<div>

<%
	for(int i=2; i<10; i++){
		int dan = i;
%>
<div> <%= dan %> 단</div>
	<hr>
<%
		for(int j=1; j<10; j++){
			int gop = j;
			int gap = i * j;
%>
	
	<div> <%= dan %> x <%= gop %> = <%=gap%> </div>
	</div>
	<br>
<%
		}
	}
%>
</div> 
</body>
</html>