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
<h3>후보자등수</h3>
<table class="table table-bordered text-center">
	<thead>
	    <tr class="table-secondary">
	      <th scope="col">후보번호</th>
	      <th scope="col">성명</th>
	      <th scope="col">총투표건수</th>
	    </tr>
	</thead>
	<c:forEach items="${ranklist }" var="vo">
    <tbody>
    	<tr>
      	<td>${vo.memberNo }</td>
        <td>${vo.memberName }</td>
      	<td>${vo.memCnt }</td>
    	</tr>
  	</tbody>
	</c:forEach>
</table>
	
</section>
	
</body>
</html>