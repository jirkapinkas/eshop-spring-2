<%@page import="cz.jiripinkas.example.eshop.entity.Item"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp" %>
<jsp:include page="layout/header.jsp">
	<jsp:param value="About" name="title" />
	<jsp:param value="about" name="page" />
</jsp:include>

<h1>About</h1>

<p>This is example eshop :)</p>

<jsp:include page="layout/footer.jsp" />
