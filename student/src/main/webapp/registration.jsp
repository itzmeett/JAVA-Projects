<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="navbar-index.jsp"%>	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Form</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<!-- Form Container -->
	<div class="container">
		<div class="form-container mt-4">
			<h2>Registration Form</h2>
			<form action="/submit-form" method="post"
				enctype="multipart/form-data">

				<div class="form-group">
					<label for="mentor">User Type</label> <select class="form-control"
						id="mentor" name="mentor" required>
						<option value="">Select Type</option>
						<option value="1">Intern</option>
						<option value="2">Mentor</option>
						<option value="3">Admin</option>
					</select>
				</div>
				<div class="form-group">
					<label for="fname">First Name</label> <input type="text"
						class="form-control" id="fname" name="fname" required>
				</div>
				<div class="form-group">
					<label for="lname">Last Name</label> <input type="text"
						class="form-control" id="lname" name="lname" required>
				</div>
				<div class="form-group">
					<label for="mobile">Mobile</label> <input type="text"
						class="form-control" id="mobile" name="mobile" required>
				</div>
				<div class="form-group">
					<label for="email">Email</label> <input type="email"
						class="form-control" id="email" name="email" required>
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" name="password" required>
				</div>
				<div class="form-group">
					<label for="cpassword">Confirm Password</label> <input
						type="password" class="form-control" id="cpassword"
						name="password" required>
				</div>

				<button type="submit" class="btn custom-btn">Submit</button>
			</form>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
