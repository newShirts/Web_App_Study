<%@page import="vo.ScrVO"%>
<%@page import="service.DBService"%>
<%@page import="dao.ScrDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //register.jsp?name=%EC%9D%B4%EC%9D%B4%EC%9D%B4&kor=68&eng=95&mat=86
    String name = request.getParameter("name");
    int kor = Integer.parseInt(request.getParameter("kor"));
    int eng = Integer.parseInt(request.getParameter("eng"));
    int mat = Integer.parseInt(request.getParameter("mat"));
    
    ScrVO vo = new ScrVO();
    vo.setName(name);
    vo.setKor(kor);
    vo.setEng(eng);
    vo.setMat(mat);
    
    
    
    int res = ScrDAO.getInstance().insert(vo); //1행 추가
    
    if(res>0){
    	//location.href = 'student.jsp'; 라고 작성할 수 없으므로 응답 객체를 사용해야 함.
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