<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.model.vo.MemberVo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지역구의원투표 프로그램</title>
</head>
<body>
<jsp:include page="/WEB-INF/header.jsp"/>
<section class="container-sm">
	<h3 class="text-center">투표하기</h3>
	    <form action="vote" method="post" class="container mt-3" onsubmit="return validCheck(this);">
        <div class="container-md m-3 p-3 border">
            <div class="row m-1">
                <div class="col text-center fw-semibold border-end">주민번호</div>
                <div class="col-5">
                    <input type="text" name="vJumin" class="form-control">
                </div>
                <div class="col"><span name="alert">예 : 8906153154726</span></div>
            </div>
            <div class="row m-1">
                <div class="col text-center fw-semibold border-end">성명</div>
                <div class="col-5">
                    <input type="text" name="vName" class="form-control">
                </div>
                <div class="col"></div>
            </div>
            <div class="row m-1">
                <div class="col text-center fw-semibold border-end">후보번호</div>
                <div class="col-5">
                    <select name="memberNo" class="form-select">
                	<c:forEach items="${memberlist }" var="vo">
                        <option selected></option>	
                        <option value="${vo.memberNo }" ${requestScope.vo.memberNo eq vo.memberNo ? "selected" : "" }>[${vo.memberNo }] ${vo.memberName }</option>
                    </c:forEach>
                    </select>
                </div>
                <div class="col"></div>
            </div>
            <div class="row m-1">
                <div class="col text-center fw-semibold border-end">투표시간</div>
                <div class="col-5">
                    <input type="text" name="vTime" class="form-control">
                </div>
                <div class="col"></div>
            </div>
            <div class="row m-1">
                <div class="col text-center fw-semibold border-end">투표장소</div>
                <div class="col-5">
                    <input type="text" name="vArea" class="form-control">
                </div>
                <div class="col"></div>
            </div>
            <div class="row m-1">
                <div class="col text-center fw-semibold border-end">유권자확인</div>
                <div class="col-5">
                    <input class="form-check-input" type="radio" name="vConfirm" id="Y" value="Y">&nbsp;<label for="Y">확인</label>
                    <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                    <input class="form-check-input" type="radio" name="vConfirm" id="N" value="N">&nbsp;<label for="N">미확인</label>
                </div>
                <div class="col"></div>
            </div>
        </div>    
            <div class="row mt-3 text-center">
                <div class=" ">
                    <button class="btn btn-secondary sub" type="submit">투표하기</button>
                    <button class="btn btn-secondary replay" type="button">다시하기</button>
                </div>
            </div> 
    </form>
	
	
	<script type="text/javascript">
	function userNameVaild(e) {
	    var element = e.target;
	    if(element.nextElementSibling !== null) {
	        element.nextElementSibling.remove();
	    }
	    if(element.value.length > 0) {	 
	        element.setAttribute("is-valid", true);
	    } else if (element.value == "Y" || element.value == "N") {
	    	element.setAttribute("is-valid", true);
		} else {	        
	        element.setAttribute("is-valid", false);
	    }
	}
	 
	function validCheck(form) {
	   	var vJumin = form.vJumin.getAttribute("is-valid") === "true" ? true : false;
		var vName = form.vName.getAttribute("is-valid") === "true" ? true : false;
	    var memberNo = form.memberNo.getAttribute("is-valid") === "true" ? true : false; 
	    var vTime = form.vTime.getAttribute("is-valid") === "true" ? true : false; 
	    var vArea = form.vArea.getAttribute("is-valid") === "true" ? true : false; 
	    var vConfirm = form.vConfirm.getAttribute("is-valid") === "true" ? true : false; 

	    if(vJumin&&vName&&memberNo&&vTime&&vArea&&vConfirm) {
	        return true;
	    } else {
	    	if(!vJumin){
	    		alert("주민번호가 입력되지 않았습니다.");
	    	} else if (!vName) {
	    		alert("성명이 입력되지 않았습니다.");
			} else if (!memberNo) {
	    		alert("후보번호가 선택되지 않았습니다.");
			} else if (!vTime) {
	    		alert("투표시간이 선택되지 않았습니다.");
			} else if (!vArea) {
	    		alert("투표장소가 선택되지 않았습니다.");
			} else if (!vConfirm) {
				 alert("유권자 확인이 선택되지 않았습니다.");
			}
	        location.href="<%=request.getContextPath()%>/vote";
	        return false;
	    }
	}

	window.onload = function() {
	    var form = document.forms[0];
	    form.vJumin.addEventListener("input", userNameVaild);	     
	    form.vName.addEventListener("input", userNameVaild);
	    form.memberNo.addEventListener("input", userNameVaild);
	    form.vTime.addEventListener("input", userNameVaild);
	    form.vArea.addEventListener("input", userNameVaild);	        
	}	
	
	
		$(".btn.replay").on("click", replay);
		
		function replay() {
			console.log("replay눌림");
			location.href="<%=request.getContextPath()%>/vote";
		} 
	</script>
</section>	
</body>
</html>