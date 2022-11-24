<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->


<style >
.bg-custom-1 {
  background-color: #85144b;
}

.bg-custom-2 {
background-image: linear-gradient(15deg, #13547a 0%, #80d0c7 100%);
}
.marg {
margin-left:10%;
}
#log {
margin-left:60%;
}
.martop {
margin-top:5%;
margin-left:7%;
}
.mrgl {
margin-left:2%;
}
</style>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>
<nav class="navbar navbar-dark bg-dark navbar-expand-sm">
  <a class="navbar-brand marg" href="#">
    <img src="images/medicine.png" width="30" height="30" alt="logo">
    Admin
  </a>
  
  <button id="log"   type="button" >
    <span >Logout</span>
  </button>
  
</nav>
<div class="martop">
<a type="button" class="btn btn-outline-primary" href="http://localhost:8088/senew/addEmployee.jsp">Add Employee</a>
<a type="button" class="btn btn-outline-secondary mrgl" href="http://localhost:8088/senew/ifexistemployee.jsp">Delete Employee</a>
<a type="button" class="btn btn-outline-success mrgl" href="http://localhost:8088/senew/ifexistemployee.jsp">Edit Employee</a>
<a type="button" class="btn btn-outline-danger mrgl">Report Employees</a>
<a type="button" class="btn btn-outline-dark mrgl">Add Medicine</a>
<a type="button" class="btn btn-outline-info mrgl">Add Category</a>
</div>

</body>

</html>