<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지역구의원투표 프로그램</title>
</head>
<body>
<jsp:include page="/WEB-INF/header.jsp"/>
<section class="text-center container-sm">
<h3>투표검수조회</h3>
<table class="table table-sm table-bordered text-center">
	<thead>
	    <tr class="table-secondary">
	      <th scope="col">성명</th>
	      <th scope="col">생년월일</th>
	      <th scope="col">나이</th>
	      <th scope="col">성별</th>
	      <th scope="col">후보번호</th>
	      <th scope="col">투표시간</th>
	      <th scope="col">유권자확인</th>
	    </tr>
	</thead>
	<c:forEach items="${votelist }" var="vo">
    <tbody>
    	<tr>
      	<td>${vo.vName }</td>
        <td>${vo.birth }</td>
      	<td>${vo.age }</td>
      	<td>${vo.gender }</td>
      	<td>${vo.memberNo }</td>
      	<td>${vo.vTime }</td>
      	<td>${vo.vConfirm }</td>
    	</tr>
  	</tbody>
	</c:forEach>
</table>
</section>
</body>
</html>