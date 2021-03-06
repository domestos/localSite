<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!-- <jstl:set var="baseURL" value="${fn:replace(String.valueOf(pageContext.request.requestURL), pageContext.request.requestURI, pageContext.request.contextPath)}" />
 -->
<jstl:set var="baseURL"
	value="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, pageContext.request.contextPath)}" />

<tilesx:useAttribute name="current" />
<!-- Static Navbar  -->
<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index">Support</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">

				<li class="${current == 'index' ? 'active' : ''}"><a
					href='<jstl:out value="${baseURL}/index"/>'>Home</a></li>
				<li class="${current == 'admin' ? 'active' : ''}"><a
					href='<spring:url value="${baseURL}/admin"/>'>Admin page</a></li>
				<!-- 					
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Nav header</li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
					 -->

			</ul>
			<ul class="nav navbar-nav navbar-right">

				<security:authorize access="! isAuthenticated()">
					<li><a href=<spring:url value="${baseURL}/login"/>>login</a></li>
				</security:authorize>


				<security:authorize access=" isAuthenticated()">
					<li><a href='<spring:url value="${baseURL}/logout"/>'>logout</a></li>
				</security:authorize>

			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>