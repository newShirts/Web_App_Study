
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //수신시 인코딩(POST일 경우 한글이 깨짐. 그러나 GET일 때도 습관처럼 작성하는 것이 좋음.)
    request.setCharacterEncoding("utf-8");
    //scr_del.jsp?no=1
    int idx = Integer.parseInt(request.getParameter("idx"));
    
    int res = MemberDAO.getInstance().delete(idx);
    
    if(res>0){
    	response.sendRedirect("member.jsp");
    }
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>