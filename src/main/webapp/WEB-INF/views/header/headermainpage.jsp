<%--
  Created by IntelliJ IDEA.
  User: MAKS
  Date: 05.09.2021
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="<c:url value='/css/style.css'/>" rel="stylesheet">
<link href="<c:url value="/css/form.css"/>" rel="stylesheet">
<link href="<c:url value="/css/icon.css"/>" rel="stylesheet">
<link href="<c:url value="/css/link.css"/>" rel="stylesheet">
<link href="<c:url value="/css/sale.css"/>" rel="stylesheet">
<link href="<c:url value="/css/stock.css"/>" rel="stylesheet">
<link href="<c:url value="/css/table.css"/>" rel="stylesheet">
<link href="<c:url value="/css/blocks.css"/>" rel="stylesheet">
<link href="<c:url value="/css/header.css"/>" rel="stylesheet">
<link href="<c:url value="/css/test.css"/>" rel="stylesheet">
<h2 align="right">
    <a title="English" href="?lang=en">
        <img src="/images/UK.jpg" width="30px" height="30px" class="round">
    </a>
    <a title="Russian" href="?lang=ru">
        <img src="/images/RU.png" width="30px" height="30px" class="round">
    </a> </h2>
<nav class="top-menu">
    <ul class="menu-main">
        <li class="left-item"><a title="Back to the main page" href="/"><img src="/images/logo.png" width="120" height="120"></a>
        </li>
        <sec:authorize access="!isAuthenticated() || hasRole('USER')">
            </li>
            <li class="right-item">
                <a title="Basket" href="/basket">
                    | <img src="/images/basket.png" class="shopping-cart"><spring:message
                        code="basket.startPage"/>
                </a></li></sec:authorize>

        <sec:authorize access="!isAuthenticated()">
            <li class="right-item">
                <a title="Registration" href="/registration"> | <img src="/images/add_users.png" width="30px" height="30px">
                    <spring:message code="registration.startPage"/>
                </a></li>
            <li class="right-item">
                <a title="Login" href="/login">
                    | <img src="/images/enter.png" width="30px" height="30px"><spring:message
                        code="authorization.startPage"/>
                </a></li>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <li class="right-item">
                <a title="Logout" href="/logout">
                    |<img src="/images/exit.png" width="30px" height="30px"><spring:message
                        code="logout.startPage"/>
                </a></li>
        </sec:authorize>
    </ul>
</nav>