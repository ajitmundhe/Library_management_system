<%@page import="jsp_library_management.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
        integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
    <style>
        body {
            height: 100vh;
            width: 100%;
            position: absolute;
            top: 0px;
            left: 0px;
            background-image: url('https://thumbs.dreamstime.com/b/open-book-wooden-table-open-book-wooden-table-wooden-deck-table-grunge-background-111539363.jpg');
            background-repeat: no-repeat;
            background-position: center; 
            background-size:100% 100%;
            
            background-attachment: fixed;
            overflow: hidden;
        }

        .lgout {
            position: fixed;
            top: 25px;
            right: 60px;
            height: 35px;
            border-radius: 10px;
            background-color: red;
        }

        .table {
            width: 90%;
            margin-top: 100px;
            margin-left: 70px;
        }
       .data{
        color: black;
        font-weight: bolder;
       }
        .menu{
         position: relative;
            top: 25px;
            
            left: 90px;
            height: 35px;
            border-radius: 10px;
            background-color: red;
       }
      .a{
         color:black;
         text-decoration: none;
       }
       .search{
        position: relative;
            top: 25px;
            
            left: 90px;
            height: 35px;
            border-radius: 10px;
            background-color: transparent;
       }
    </style>
</head>
<body>
   <% List<Book> li= (List)request.getAttribute("books");%>
    <%    String value=(String)request.getAttribute("cookie"); 
    if(value!=null){%>
    <h2>Data edited by <%=value %></h2>
    <%}; %>
   
    <div>
       <form action="search">
           <a href="home.jsp"><button class="menu"> Books</button></a>
           <a href="book.jsp"><button class="menu" style="margin-left: 20px;">Add Book</button></a>
        <a href="search"> <button class="menu" style="margin-left: 20px;">Search by Name</button></a>
        
        <input type="search" name="search"class="search" style="margin-left:20px;" placeholder="Enter text here">

       
       </form>
       <a href="welcome.jsp"> <button class="lgout">Log Out</button></a>
    </div>
    <div>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Author</th>
                    <th scope="col">Genre</th>
                    <th scope="col">Delete</th>
                    <th scope="col">Update</th>
                </tr>
            </thead>
            <tbody>
                <% if(li!=null){for(Book bk: li){ %>
                <tr>
                    <th scope="row"><%=bk.getId() %></th>
                    <td class="data"><%=bk.getName() %></td>
                    <td class="data"><%=bk.getAuthor() %></td>
                    <td class="data"><%=bk.getGener() %></td>
                    <td><a href="delete?id=<%=bk.getId() %>"><button>Delete</button></a></td>
                     <td><a href="update?id=<%=bk.getId() %>"><button>Update</button></a></td>
                </tr>
                 <%}}; %>
            </tbody>
        </table>


    </div>
</body>
</html>