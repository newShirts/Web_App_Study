<%@page import="dao.ScrDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //수신시 인코딩(POST일 경우 한글이 깨짐. 그러나 GET일 때도 습관처럼 작성하는 것이 좋음.)
    request.setCharacterEncoding("utf-8");
    //scr_del.jsp?no=1
    int no = Integer.parseInt(request.getParameter("no"));
    
    int res = ScrDAO.getInstance().delete(no);
    
    if(res>0){
    	response.sendRedirect("Student.jsp");
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