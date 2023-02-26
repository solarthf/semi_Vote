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
<h3>후보조회</h3>
<table class="table table-sm table-bordered text-center">
	<thead>
	    <tr class="table-secondary">
	      <th scope="col">후보번호</th>
	      <th scope="col">성명</th>
	      <th scope="col">소속정당</th>
	      <th scope="col">학력</th>
	      <th scope="col">주민번호</th>
	      <th scope="col">지역구</th>
	      <th scope="col">대표전화</th>
	    </tr>
	</thead>
	<c:forEach items="${memberlist }" var="vo">
    <tbody>
    	<tr>
      	<td>${vo.memberNo }</td>
        <td>${vo.memberName }</td>
      	<td>${vo.pName }</td>
      	<td>${vo.school }</td>
      	<td>${vo.memberJumin }</td>
      	<td>${vo.memberCity }</td>
      	<td>${vo.pTel1 }-${vo.pTel2 }-${vo.pTel3 }</td>
    	</tr>
  	</tbody>
	</c:forEach>
</table>
 
</section>	 
	
</body>
</html>