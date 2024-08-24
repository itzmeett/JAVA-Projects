<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light">
			<a class="navbar-brand" href="index.jsp">Ordex-Intern</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="#">Student</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Mentor</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Admin</a></li>
				</ul>
			</div>
		</nav>
		<div class="form-container mt-4">
			<form action="/submit-mentor-form" method="post">
				<div class="form-group">
					<label for="assign-mentor">Assign a mentor</label> <select
						class="form-control" id="assign-mentor" name="assign-mentor"
						required>
						<option value="">Select Mentor</option>
						<option value="1">Mentor-1</option>
						<option value="2">Mentor-2</option>
						<option value="3">Mentor-3</option>
						<option value="4">Mentor-4</option>
					</select>
				</div>

				<div class="form-group">
					<label for="assign-student">To Student</label> <select
						class="form-control" id="assign-student" name="assign-student"
						required>
						<option value="">Select Student</option>
						<option value="1">Student-1</option>
						<option value="2">Student-2</option>
						<option value="3">Student-3</option>
						<option value="4">Student-4</option>
					</select>
				</div>


				<button type="submit" class="btn custom-btn">Submit</button>
			</form>
		</div>
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>