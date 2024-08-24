<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Form</title>
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
		</nav>
		<div class="form-container mt-4">
			<h2>Student Form</h2>
			<form action="/submit-form" method="post"
				enctype="multipart/form-data">
				<div class="form-group">
					<label for="fname">First Name</label> <input type="text"
						class="form-control" id="fname" name="fname" required>
				</div>
				<div class="form-group">
					<label for="lname">Last Name</label> <input type="text"
						class="form-control" id="lname" name="lname" required>
				</div>
				<div class="form-group">
					<label for="date">Date of Birth</label> <input type="date"
						class="form-control" id="date" name="date" required>
				</div>
				<div class="form-group">
					<label for="image">Image</label>
					<div class="custom-file">
						<input type="file" class="custom-file-input" id="image"
							name="image"> <label class="custom-file-label"
							for="image">Choose file</label>
					</div>
				</div>
				<div class="form-group">
					<label for="mentor">Mentor</label> <select class="form-control"
						id="mentor" name="mentor" required>
						<option value="">Select Mentor</option>
						<option value="1">Mentor 1</option>
						<option value="2">Mentor 2</option>
						<option value="3">Mentor 3</option>
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
