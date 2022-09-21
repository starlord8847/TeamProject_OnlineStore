<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
margin: 0;
}
div{
text-align: center;
}
.mainbox{
display: grid;
grid-template-columns: 200px 1000px 200px;
grid-template-rows: 430px 1000px;
}
.main1{
grid-column: 1 / 4;
}
.side1{
background-color: green;
}
.side2{
background-color: pink;
}
</style>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
  <div class = "container">

  <div class = "col">
    <div class = "mainbox" class = "text-center">
     <div class = "main1"><img src="${pageContext.request.contextPath }/image/rank.PNG" width="1500" height="400"></div>
      <div class = "side1">side1</div> 
       <div class = "main2">
         <div class="container">
          <c:forEach items="${list }" var="aa">
           <div class="col">
            <div class="col-md-4">
             <div class="thumbnail">
              <a href="detail?pcode=${aa.pcode }">
              <p>${aa.pthumbnail }</p>
             <div class="caption">
              <p>${aa.pname }</p>
             </div>
              </a>
             </div>
            </div>
           </div>
          </c:forEach>
        </div>
      </div>
      <div class = "side2">side2</div>
    </div>  
  </div>
  </div>  

</body>
</html>
