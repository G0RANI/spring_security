<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="<%=application.getContextPath()%>/resources/css/login.css" rel="stylesheet" id="text/css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="sidenav">
         <div class="login-main-text">
            <h2>Application<br> Login Page</h2>
            <p>Login or register from here to access.</p>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form action="/login" method="post">
                  <div class="form-group">
                     <label>User Name</label>
                     <input type="text" class="form-control" name="loginId" placeholder="User Name">
                  </div>
                  <div class="form-group">
                     <label>Password</label>
                     <input type="password" class="form-control" name="loginPwd" placeholder="Password">
                  </div>
                  <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
                  <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
    				<font color="red">
                  		<p>아이디 혹은 비밀번호를 확인해주세요</p>
                  	<c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session"/>
    				</font>
				  </c:if>
                  <button type="submit" class="btn btn-black">Login</button>
               </form>
            </div>
         </div>
      </div>
</body>
</html>