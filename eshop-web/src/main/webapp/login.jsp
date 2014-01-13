<%@page import="cz.jiripinkas.example.eshop.entity.Item"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="WEB-INF/jsp/layout/taglib.jsp" %>
<jsp:include page="WEB-INF/jsp/layout/header.jsp">
	<jsp:param value="Login" name="title" />
</jsp:include>

<form name="f" action="j_spring_security_check" method="post" class="form-signin" style="width:300px">
<h2>Please sign in</h2>
<input type="text" name="j_username" placeholder="Username" class="form-control" /><br />
<input type="password" name="j_password" placeholder="Password" class="form-control" /><br />
<input type="submit" name="submit" class="btn btn-primary btn-lg" />
</form>

<jsp:include page="WEB-INF/jsp/layout/footer.jsp" />
