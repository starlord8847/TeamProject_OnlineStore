<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table{
  margin-left:auto; 
  margin-right:auto;
}
#td{
  text-align: right;
}

#img{
  text-align: left;
}
tr{
  text-align: right;
}
a {
  color: inherit;
  text-decoration: none;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list }" var="aa">
<input type = "hidden" name = "pcode" value = "${aa.pcode }">
<table width = "800" height = "1000">
  
    <tr>
      <td rowspan="5" width = "500" id="img"><img src="${pageContext.request.contextPath }/image/${aa.pthumbnail }" width="500" height="700"/>
      </td><td>${aa.pname }</td>
    </tr>
    
    <tr>
      <td>${aa.price }원</td>
    </tr>
    
    <tr>
      <td>배송기간 약${aa.pshipday }일</td>
    </tr>
    
    <tr>
      <td>배송비 ${aa.pshipcost }원  도서산간지역 ${aa.pspshipcost }원</td>
    </tr>  
    
    <tr>
      <td>
        <select id="testSelect">
           <option value="10">10팩 ${aa.price*10 }원</option>
           <option value="30">30팩 ${aa.price*30 }원</option>
           <option value="50">50팩 ${aa.price*50 }원</option>
           <option value="100">100팩 ${aa.price*100 }원</option>
        </select>
      </td>
    </tr> 
     
    <tr>
      <td colspan="2" id="td"><a href="#"><h2>장바구니</h2></a><a href="#"><h2>바로구매</h2></a></td>
    </tr>    

</table>
</c:forEach>  
</body>
</html>