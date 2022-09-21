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
랭킹
<hr>

오늘의 전체 랭킹 순위!
<table width = "1200">
  <c:forEach items = "${list}" var = "aa">
  <c:set var = "i" value = "${i+1 }"/>
    <tr>
      <a href="detail?pcode=${aa.pcode }">
      <td>${i }<hr></td>
      <td width="400"> ${aa.pthumbnail }<hr></td>
      <td>${aa.pname }<hr></td></a>
      <td>${aa.price }<hr></td>
    </tr>  
  </c:forEach>
</table>
</body>
</html>