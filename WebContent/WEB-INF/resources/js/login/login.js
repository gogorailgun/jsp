$(document).ready(function(){
	$('#btn1').click(function(){
		$(location).attr('href','http://localhost/jspcls/main.cls');
	});
	$('#btn2').click(function(){
		// 할일
		// 1. 입력한 데이터 읽고
		var sid = $('#id').val();
		var spw = $('#pw').val();
		
		if(!(sid && spw)){
			return; // sid나 spw가 하나라도 입력이 안되면 다시 돌려보낸다.
		}
		
		$('#frm').submit(); // submit 함수로 form 태그에 전송해준다.
	});
});