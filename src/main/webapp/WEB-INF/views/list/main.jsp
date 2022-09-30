<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
a {
  color: inherit;
  text-decoration: none;
}
</style>
<meta charset="utf-8">

<title>Insert title here</title>
</head>
<body>
    <div class = "col">   
          <c:forEach items="${list }" var="aa">
           <div class="col">
            <div class="col-md-4">
             <div class="thumbnail">
              <a href="detail?pcode=${aa.pcode }">
              <p><img src="${pageContext.request.contextPath }/image/${aa.pthumbnail }" width="250" height="250"/></p>
             <div class="caption">
              <p>${aa.pname }</p>
              <p>${aa.price }</p>
             </div>
              </a>
             </div>
            </div>
           </div>
          </c:forEach>
        </div>    
</body>
</html>
