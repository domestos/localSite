<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<div class="row">
	<div class="col-md-3">
		<h3>Owner info</h3>
		<hr>
		<h4>${owner.name}</h4>
		<p>${owner.email}</p>
		<p>${owner.phone}</p>
	</div>
	<div class="col-md-9">
		<h4>Add new Cartridge</h4>
		<form class="form-inline" role="form" action="createCartridge" method="POST">
			<div class="form-group">
				<label class="sr-only" for="labelType">model</label> <input name="type" type="text" class="form-control"
					id="labelType" placeholder="model">
			</div>
			<div class="form-group">
				<label class="sr-only" for="labelNumber">number</label> <input name="number" type="text" class="form-control"
					id="labelNumber" placeholder="number">
			</div>
			<button name="ownerId" value="${owner.id}" type="submit" class="btn btn-default">Save</button>
		</form>
		<hr>



		<div class="row">
		
			<div class="col-md-3">Model cartridge</div>
			<div class="col-md-3">Nmber Limk</div>
			<div class="col-md-4">RQLink</div>


		</div>
		<hr>
	</div>