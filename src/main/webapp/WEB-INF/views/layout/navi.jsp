<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
/* 전체영역에서 여백을 없애줌 */
	* {
		margin: 0;
		padding: 0;
	}
/* ul li태그에 리스트 스타일을 없앰 */
	ul li{
		list-style: none;
	}
/* a태그에 텍스트 밑줄을 없애고 색상을 #333 */
	a {
		color: inherit;
        text-decoration: none;
	}
/* 글자크기를 16px 맑은 고딕 굵게하고 width넓이 700, 높이 50만큼 배경색은 #ccc, 글자색은 검정색, 라인높이50px
menu박스 가운데정렬, 글자가운데 정렬 */
	#menu {
		font:bold 16px "malgun gothic";
		height:50px;
		background: #fff;
		color:black;
		line-height: 50px; 
		text-align: center;
		position:-webkit-sticky;
		position:sticky; top:-5px; z-index:100;
	}
	#menu> ul > li:hover{
	    background: black;
	    color: #fff;
	}
	#menu> ul > li:hover > ul{
	    color: black;
	}
/* menu태그 자식의 ul의 자식 li를 왼쪽정렬과 넓이 140설정 */
	#menu > ul > li {
		float:left;
		width:140px;
		position:sticky;
		
	}
	#ma{
	    margin-left: 275px;
	}
	#menu > ul > li > ul {
		width:140px;
		display:none;
		position:sticky;
		font-size:13px;
		background: #fff;
		border-style: solid;
        border-width: 1px;
	}
	#menu > ul > li:hover > ul {
		display:block;
	}
	#menu > ul > li > ul > li:hover {
		background: #DCDCDC;
		color: black;
		}
	</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="menu">
  <ul>
    <li id="ma"><a href="#">카테고리</a>
      <ul>
        <li><a href="chicken">닭고기</a></li>
        <li><a href="pork">돼지고기</a></li>
        <li><a href="beef">소고기</a></li>
        <li><a href="drink">드링크</a></li>
        <li><a href="rice">도시락, 볶음밥</a></li>
        <li><a href="salad">샐러드</a></li>
      </ul>
    </li>
      <li><a href="ranking">랭킹</a></li>
      <li><a href="month">이달의 특가</a></li>
  </ul>



</div>
</body>
</html>