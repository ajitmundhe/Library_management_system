<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
 body{
            position: absolute;
            top: 0px;
            left: 0px;
            height: 100vh;
            width: 100%;
            background-image: url('https://png.pngtree.com/thumb_back/fh260/background/20230425/pngtree-huge-library-with-old-books-that-have-multiple-doors-image_2513239.jpg');
            background-repeat: no-repeat;
            background-position: center;
            background-size:100% 100%;
            height: 100vh;
            background-attachment: fixed;
            overflow: hidden;
        }
        .mdiv{
            height: 500px;
            width: 300px;
            background-color: transparent;
            position: relative;
            top: 70px;
            left: 38%;
            padding: 15px;
        }
        input{
            width: 90%;
            border: none;
            border-bottom: 2px solid whitesmoke;
            background-color: transparent;
        }
        label{
            font-weight: bolder;
            color: white;
            font-size:22px;
        }
        button{
            font-weight: bolder;
            margin-top: 20px;
            margin-left: 70px;
            width: 100px;
            height: 35px;
            border-radius: 10px;
            background-color: rgb(19, 36, 192);
            color: white;
        }
        .head{position:relative;
          
          top:90px;
          left:35%;
          color:blue;
        }

</style>
</head>
<body>
  <h2 style="color: white;font-size:40px;" class="head">Library Management System</h2>
 <div class="mdiv">
 
        <form action="register" method="post">
          
            <label>Id : </label><br><input type="text" name="id"><br><br>
            <label>Name : </label><br><input type="text" name="name"><br><br>
            <label>Phone : </label><br><input type="tel" name="phone"><br><br>
            <label>Email : </label><br><input type="text" name="email"><br><br>
            <label>Password : </label><br><input type="password" name="password">
            <br><br>
            <button>Register</button>
        </form>
       </div>
</body>
</html>