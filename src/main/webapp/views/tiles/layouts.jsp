<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap core CSS -->

<link rel="stylesheet"
	href='<jstl:url value="/resources/bootstrap/css/bootstrap.css" />'>

<!-- Bootstrap CSS mini -->
<link rel="stylesheet"
	href='<jstl:url value="/resources/bootstrap/css/bootstrap.min.css" />'>

<!-- Optional theme -->
<link rel="stylesheet"
	href='<jstl:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>'>

<!-- Latest compiled and minified JavaScript -->
<script
	src='<jstl:url value="/resources/bootstrap/js/bootstrap.min.js"/>'></script>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<title><tiles:getAsString name="title" /></title>
</head>


<body>

	<div>
		<tiles:insertAttribute name="header" />
	</div>

	<div class="container">
		<tiles:insertAttribute name="body" />

		<center>
			<tiles:insertAttribute name="footer" />
		</center>
	</div>
	<!-- and div.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src='<jstl:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"/>'></script>
	<script
		src='<jstl:url value="/resources/bootstrap/js/bootstrap.min.js"/>'></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src='<jstl:url value="/resources/bootstrap//js/ie10-viewport-bug-workaround.js"/>'></script>

</body>
</html>