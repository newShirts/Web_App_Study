<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script>
			function send(f){
				var name = f.name.value.trim();
				var id = f.id.value.trim();
				var pw = f.pw.value.trim();
				var email = f.email.value.trim();
				
				alert(pw);
		
				if(name == ''){
					alert("이름을 입력하세요.");
					return;
				}
				
				if(id == ''){
					alert("아이디를 입력하세요.");
					return;
				}
				
				if(pw == ''){
					alert("비밀번호를 입력하세요.");
					return;
				}
				
				if(email == ''){
					alert("이메일을 입력하세요.");
					return;
				}
		
		
				f.action = "register.jsp";
				f.method = "GET";
				f.submit();
				
			}
		</script>
	</head>
	<body>
	
		<form>
			<table border="1">
				<caption>회원 정보를 입력하세요.</caption>
				<tr>
					<th>이름</th>
					<td><input name="name"></td>
				</tr>
				
				<tr>
					<th>아이디</th>
					<td><input name="id"></td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td><input name="pw"></td>
				</tr>
				
				<tr>
					<th>이메일</th>
					<td><input name="email"></td>
				</tr>
			
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="등록" onclick="send(this.form);"> <!-- 자바스크립트 메서드 -->
						<input type="button" value="취소" onclick="location.href='member.jsp'"> <!-- 메인페이지로 이동 -->
					</td>
				</tr>
		</table>
		</form>
	</body>
</html>