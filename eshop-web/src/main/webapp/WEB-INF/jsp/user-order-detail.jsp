<%@page import="cz.jiripinkas.example.eshop.entity.UserOrder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp" %>
<jsp:include page="layout/header.jsp">
	<jsp:param value="user orders" name="title" />
	<jsp:param value="user_orders" name="page" />
</jsp:include>

<h1>User order:</h1>

name: ${userOrder.name}<br />
city: ${userOrder.city}<br />
street: ${userOrder.street}<br />
zip: ${userOrder.zip}<br />
ordered date: <fmt:formatDate value="${userOrder.orderDate}" pattern="dd.MM.yyyy" /><br /><br />

<h2>Ordered items:</h2>

<c:forEach items="${userOrder.orderedItems}" var="oi">
	${oi.item.name}<br />
</c:forEach>

<jsp:include page="layout/footer.jsp" />
