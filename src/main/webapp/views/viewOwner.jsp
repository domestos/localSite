<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<div class="row">
	<div class="col-xs-6 col-md-4">
		<h3>Owner info</h3>
		<hr>
		<h4>${owner.name}</h4>
		<p>${owner.email}</p>		
		<p>${owner.phone}</p>		
	</div>
	<div class="col-xs-12 col-md-8">
		<h3>Cartridge information</h3>
		<hr>
	</div>

</div>