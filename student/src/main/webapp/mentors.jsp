<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mentor Form</title>
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
				</ul>
			</div>
		</nav>
		<h2>Mentor Form</h2>
		<div class="form-container mt-4">
			<form action="/submit-mentor-form" method="post">
				<div class="form-group">
					<label for="fname">First Name</label> <input type="text"
						class="form-control" id="fname" name="fname" required>
				</div>
				<div class="form-group">
					<label for="lname">Last Name</label> <input type="text"
						class="form-control" id="lname" name="lname" required>
				</div>
				<div class="form-group">
					<label for="mentor">Role</label> <select class="form-control"
						id="mentor" name="mentor" required>
						<option value="">Select Role</option>
						<option value="1">Java Developer</option>
						<option value="2">Full Stack Developer</option>
						<option value="3">MERN Stack Developer</option>
						<option value="4">UI/UX Developer</option>
					</select>
				</div>
				<div class="form-group">
					<label for="project-title">Assign Project</label> <input type="text"
						class="form-control" id="project-title" name="project-title" required>
				</div>
				<div class="form-group">
					<label for="project-file">Project-File</label>
					<div class="custom-file">
						<input type="file" class="custom-file-input" id="project-file"
							name="project-file"> <label class="custom-file-label"
							for="file">Choose file</label>
					</div>
				</div>
				<div class="form-group">
					<label for="assign-student">Assign To Student</label> <select class="form-control"
						id="assign-student" name="assign-student" required>
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
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
