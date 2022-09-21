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
		text-decoration: none;
		color:#333;
	}
/* 글자크기를 16px 맑은 고딕 굵게하고 width넓이 700, 높이 50만큼 배경색은 #ccc, 글자색은 검정색, 라인높이50px
menu박스 가운데정렬, 글자가운데 정렬 */
	#menu {
		font:bold 16px "malgun gothic";
		height:50px;
		background: #ccc;
		color:black;
		line-height: 50px; 
		margin:0 auto;
		text-align: center;
	}
/* menu태그 자식의 ul의 자식 li를 왼쪽정렬과 넓이 140설정 */
	#menu > ul > li {
		float:left;
		width:140px;
		position:relative;
	}
	#menu > ul > li > ul {
		width:130px;
		display:none;
		position: absolute;
		font-size:13px;
		background: #E5E4E2;
	}
	#menu > ul > li:hover > ul {
		display:block;
	}
	#menu > ul > li > ul > li:hover {
		background: #DCDCDC;
		}
	</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="menu">
  <ul>
    <li><a href="#">카테고리</a>
      <ul>
        <li><a href="#">신상품</a></li>
        <li><a href="#">선물하기</a></li>
        <li><a href="#">1팩담기</a></li>
        <li><a href="#">닭가슴살</a></li>
        <li><a href="#">즉석 간편식</a></li>
        <li><a href="#">도시락, 볶음밥</a></li>
        <li><a href="#">소고기</a></li>
        <li><a href="#">돼지,오리고기</a></li>
        <li><a href="#">닭안심살</a></li>
        <li><a href="#">샐러드, 과일</a></li>
        <li><a href="#">베이커리, 치즈</a></li>
        <li><a href="#">과자, 간식, 떡</a></li>
        <li><a href="#">음료, 차, 프로틴</a></li>
        <li><a href="#">비건식품</a></li>
        <li><a href="#">계란, 난백, 콩</a></li>
        <li><a href="#">견과, 고구마, 감자</a></li>
        <li><a href="#">반찬, 밀키트, 안주</a></li>
        <li><a href="#">건강식품</a></li>
        <li><a href="#">수산, 해산</a></li>
        <li><a href="#">소스, 오일</a></li>
        <li><a href="#">식단, 패키지</a></li>
        <li><a href="#">운동, 생활용품</a></li>
        <li><a href="#">베이비, 키즈</a></li>
      </ul>
    </li>
      <li><a href="ranking">랭킹</a></li>
      <li><a href="month">이달의 특가</a></li>
  </ul>



</div>
</body>
</html>