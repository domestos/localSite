<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!-- <jstl:set var="baseURL" value="${fn:replace(String.valueOf(pageContext.request.requestURL), pageContext.request.requestURI, pageContext.request.contextPath)}" />
 -->
<jstl:set var="baseURL"
	value="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, pageContext.request.contextPath)}" />

<div class="row">
	<div class="col-md-3">
		<hr>
		<h3>Owner info</h3>
		<hr>
		<h4>${owner.name}</h4>
		<p>${owner.email}</p>
		<p>${owner.phone}</p>
		<br>
		<hr>
		<h3>Select other owner</h3>



		<form class="form-group" role="form"
			action="${baseURL}/view/${owner.id}" method="POST">

			<select name="ownerId" class="form-control">
				<option></option>
				<jstl:forEach items="${owners}" var="owner">
					<option value="${owner.id}">${owner.name}</option>
				</jstl:forEach>

			</select> <br>
			<button value="${owner.id}" type="submit" class="btn btn-default">Select</button>
		</form>

		<hr>


	</div>

	<div class="col-md-9">
		<h4>Add new Cartridge</h4>
		<form class="form-inline" role="form" action="createCartridge"
			method="POST">
			<div class="form-group">
				<label class="sr-only" for="labelType">model</label> <input
					name="type" type="text" class="form-control" id="labelType"
					placeholder="model">
			</div>
			<div class="form-group">
				<label class="sr-only" for="labelNumber">number</label> <input
					name="number" type="text" class="form-control" id="labelNumber"
					placeholder="number">
			</div>
			<button name="ownerId" value="${owner.id}" type="submit"
				class="btn btn-default">Save</button>
		</form>
		<hr>



		<div class="row">
			<strong>
				<div class="col-md-3">Model cartridge</div>
				<div class="col-md-3">Number Limk</div>
				<div class="col-md-4">RQLink</div>
			</strong>
			<hr>
		</div>

		<jstl:forEach items="${cartridges}" var="cartridge">
			<div class="row">
				<div class="col-md-3">
					<strong>Model</strong> ${cartridge.type}
				</div>
				<div class="col-md-3">
					<strong>Number</strong> ${cartridge.number}
				</div>
				<div class="col-md-4">
					<strong>RQ</strong>...
				</div>
				<hr>
			</div>



		</jstl:forEach>

		<hr>
	</div>