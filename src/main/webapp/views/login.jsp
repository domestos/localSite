<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<form  name="f" action="/java-local-site/login" method="POST" class="form-signin">
	<h2 class="form-signin-heading">Please sign in</h2>
	<label for="inputEmail" class="sr-only">Login</label> 
	<input name ="username" id="inputEmail" class="form-control" placeholder="Login"
		required="" autofocus="" type="text"> <label
		for="inputPassword" class="sr-only">Password</label> <input name="password"
		id="inputPassword" class="form-control" placeholder="Password"
		required="" type="password">
	
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
		in</button>
</form>