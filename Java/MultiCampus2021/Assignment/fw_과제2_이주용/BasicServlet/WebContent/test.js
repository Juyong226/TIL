$(document).ready(function() {
	$('#loginBtn').click(function() {
		var id = $('#id').val();
		var pw = $('#pw').val();
		if(id == "" || pw == "") {
			alert("ID와 PW를 입력하세요");
			return;
		}	
		alert(id + ':' + pw);
		
		$.post("main",
				JSON.stringify({
					sign:"login",
					id:$("#id").val()
				}),
				function(data, status) {
					var obj = JSON.parse(data);
					alert("Data: " + obj.id  + "님 login ok"
						+ "\n Status: " + status );						
				});
	});
});