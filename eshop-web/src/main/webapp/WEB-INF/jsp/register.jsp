<%@page import="cz.jiripinkas.example.eshop.entity.Item"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp"%>
<jsp:include page="layout/header.jsp">
	<jsp:param value="Register" name="title" />
	<jsp:param value="register" name="page" />
</jsp:include>

<h1>Register new user:</h1>
<c:if test="${param.success}">
	<div class="alert alert-success">now you can <a href="<c:url value="/order.html" />">sign in</a></div>
</c:if>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form commandName="user" cssClass="form-horizontal">

	<myTags:textfield path="name" label="name:" required="true" />
	<myTags:password path="password" label="password:" required="true" />
	<myTags:submit />
</form:form>


<jsp:include page="layout/footer.jsp" />
