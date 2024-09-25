<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<style>
* {
	margin:0;
	padding:0;	
}
h1{
color:blue;
}
input{
	padding: 5px;
    border: solid 1px greenyellow;
}
button{
    padding: 10px;
    font-size: 15px;
    background: transparent;
    color: black;
}
form{
margin:10px;
padding:20px;
}

</style>
<body>
	<div align="center">
		<h1>Simple Basic Caluclator</h1>
		<form>
		Number 1:<input type="text" name="num1" value="${num1}"> <br><br>
        Number 2:<input type="text" name="num2" value="${num2}"> <br>
			<br>
			<button formaction="add">+</button>
			<button formaction="sub">-</button>
			<button formaction="product">x</button>
			<button formaction="div">/</button>
			<br>
			<br> 
            Result:<input type="text" name="result" value="${result}">
		</form>
	</div>
</body>
</html>