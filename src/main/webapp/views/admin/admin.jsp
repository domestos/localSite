<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<h1>admin page</h1>
<div>

	<!-- Nav tabs -->
	<ul class="nav nav-tabs" role="tablist">
		<li role="presentation" class="active"><a href="#owner"
			aria-controls="owner" role="tab" data-toggle="tab">Owner</a></li>
		<li role="presentation"><a href="#cartridge"
			aria-controls="cartridge" role="tab" data-toggle="tab">Cartridge</a></li>

	</ul>

	<!-- Tab panes -->
	<div class="tab-content">
		<div role="tabpanel" class="tab-pane active" id="owner">
			<h3>Owner info.</h3>
			<!-- Button trigger modal -->
			<button type="button" class="btn btn-primary btn-lg"
				data-toggle="modal" data-target="#myModal"><strong>+</strong> Add new owner
			</button>

			<!-- Modal -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Create new Owner</h4>
						</div>
						<div class="modal-body">
							<!-- From -->
							<form role="form" action="createOwner" method="POST" accept-charset="UTF-8">
								<div class="form-group">
									<label for="labelOwner">Name owner</label> <input type="text"
										class="form-control" id="labelOwner" name="name"  placeholder="Name">
								</div>

								<div class="form-group">
									<label for="labelEmail1">Email address</label> <input
										type="email" class="form-control" id="labelEmail"
										name="email" placeholder="Email">
								</div>
								
								
								<div class="form-group">
									<label for="labelPhone">Phone</label> <input
										type="text" class="form-control" id="labelPhone"
										 name="phone" placeholder="+380(xx) xx-xx-xxx">
								</div>
								
								<!-- End From -->
								
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Save</button>
						</div>
						</form>
					</div>
				</div>
			</div>
			<!-- END Modal -->

			<!-- Table -->
			<table class="table">
				<caption>Optional table caption.</caption>
				<thead>
					<tr>
						<th>#</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Username</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>@mdo</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>Jacob</td>
						<td>Thornton</td>
						<td>@fat</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>Larry</td>
						<td>the Bird</td>
						<td>@twitter</td>
					</tr>
				</tbody>
			</table>
			<!-- END Table -->



		</div>
		<div role="tabpanel" class="tab-pane" id="cartridge">

			<h3>Cartridge</h3>

		</div>

	</div>

</div>