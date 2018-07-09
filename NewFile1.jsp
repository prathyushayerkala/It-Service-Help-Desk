out.println("<td><a href = '/ItHelpDesk/DeleteEmpServlet?eid=" + eb.getEid() + "'><span class = 'glyphicon glyphicon-trash'></span>'</a> </td>");


<form class="form-horizontal" method="post" action="Login">
			<div class="form-group">
				<label class="control-label col-sm-3" for="email"><span
					class="glyphicon glyphicon-user"></span></label>
				<div class="col-sm-5">
					<input type="username" name="username" class="form-control"
						id="username" placeholder="Enter username" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-3" for="pwd"><span
					class="glyphicon glyphicon-lock"></span></label>
				<div class="col-sm-5">
					<input type="password" name="password" class="form-control"
						id="pwd" placeholder="Enter password" required>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-3 col-sm-10">
					<div class="checkbox">
						<label><input type="checkbox"> Remember me</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-4 col-sm-10">
					<input type="submit"  value="Login">
				</div>
			</div>
		</form>
