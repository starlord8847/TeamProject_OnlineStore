<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${svalue } 검색결과
<hr>
<table width = "1200">
  <c:forEach items = "${list}" var = "aa">
    <tr>
      <td width="400">${aa.pthumbnail }</td>
      <td>${aa.pname }</td>
      <td>${aa.price }</td>
    </tr>  
  </c:forEach>

</table>
</body>
</html>