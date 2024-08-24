<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="navbar-index.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>
	<div class="container">
		<div class="form-container mt-4">
			<h2>Log-in Form</h2>
			<form action="/submit-form" method="post"
				enctype="multipart/form-data">

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
</body>
</html>