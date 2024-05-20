<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management</title>
<style type="text/css">
   
     body{
            background-color: rgb(233, 223, 223);
            background-image: url('https://rare-gallery.com/uploads/posts/879028-Many-Library-Book-Glasses-Bokeh.jpg');
            background-repeat: no-repeat;
            background-position: center;
            background-size:100% 100%;
            height: 100vh;
            background-attachment: fixed;
            overflow: hidden;
        }
        .mdiv{
            height: 400px;
            width: 400px;
            background-color: transparent;
            position: absolute;
            top: 150px;
            right: 200px;
            /* border:2px solid red; */
            padding: 15px;
        }
        .head{
            font-size: 35px;
            font-weight: bolder;
            font-family: cursive;
            color: white;
        }
       .btn{
            height: 35px;
            border-radius: 10px;
            background-color: white;
            margin-left: 120px;
            margin-top: 10px;
            width: 100px;
            font-weight: bolder;
            border: none;
        }
        label{
            font-weight: bolder;
            color: whitesmoke;
            font-size:30px ;
        }
        input[placeholder]
        {
            font-weight: bolder;
            font-family: cursive;
            
        }
        input{
            border: none;
            border-bottom: 2px solid white;
            height: 30px;
            width: 50%;
            background-color: transparent;
        }
        a{
          text-decoration:none;
          color:whitesmoke;
        }
  
</style>
</head>
<body >
   
   
   <div class="mdiv" >
      <h2 class="head">Welcome !!!</h2>

      <form action="lgn" method="post">
        <label >Username :</label>
        <input type="text" name="email" placeholder="">
        <br><br>
        <label >Password :</label>
        <input type="text" name="password" placeholder="">
        <br><br><br>
        <button class="btn">Login</button>
         <br><br><br>
         <h3><a href="register.jsp">Not register yet? Click here to register</a></h3>
        
      </form>
    </div>
</body>
</html>