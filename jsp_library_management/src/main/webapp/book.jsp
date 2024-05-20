<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<style>
body {
	height: 100vh;
	width: 100%;
	position: absolute;
	top: 0px;
	left: 0px;
	background-color: aliceblue;
}

.mdiv {
	position: absolute;
	top: 120px;
	left: 100px;
	background-color: transparent height: 400px;
	width: 300px;
	padding: 20px;
}

input {
	width: 90%;
	border: none;
	border-bottom: 2px solid black;
	background-color: transparent;
}

.img img {
	position: relative;
	top: 170px;
	left: 730px;
	height: 300px;
	width: 400px;
}

button {
	margin-left: 25%;
	height: 35px;
	width: 90px;
	background-color: orange;
	border-radius: 10px;
	font-weight: bolder;
}

label {
	font-weight: bolder;
}
</style>
</head>
<body>
	<div class="division">
		<div class="img">
			<img
				src="https://www.freeiconspng.com/thumbs/book-png/book-png-17.jpg"
				alt="">
		</div>
		<div class="mdiv">
			<form action="add" method="post">
				<h2 style="color: black;">Add Book</h2>
				<label>Id : </label><br>
				<input type="text" name="id"><br>
				<br> <label>Name : </label><br>
				<input type="text" name="name"><br>
				<br> <label>Author : </label><br>
				<input type="text" name="author"><br>
				<br> <label>Genre : </label><br>
				<input type="text" name="genre"><br>
				<br> <br>
				<br>
				<button>Add</button>
			</form>
		</div>

	</div>
</body>
</html>