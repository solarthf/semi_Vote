<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link type="text/css" rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<header class="text-center m-3">
<div class=" ">
	<h2 class=" ">지역구의원투표 프로그램 ver 2020-05</h2>
</div>
<br>
<nav class="nav justify-content-center">
  <a class="nav-link" href="<%=request.getContextPath()%>/member">후보조회</a>
  <a class="nav-link" href="<%=request.getContextPath()%>/vote">투표하기</a>
  <a class="nav-link" href="<%=request.getContextPath()%>/votetest">투표검수조회</a>
  <a class="nav-link" href="<%=request.getContextPath()%>/rank">후보자등수</a>
  <a class="nav-link" href="<%=request.getContextPath()%>/">홈으로</a>
</nav>
</header>

<footer>
	<div class="text-center fixed-bottom">HRDKOREA Copyrightⓒ2015 All rights reserved. Human Resources Development Service of Korea</div>
</footer>