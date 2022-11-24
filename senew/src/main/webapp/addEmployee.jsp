<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" >
<style>
.mrgtop {
margin-top:30px;
margin-right:50px;
margin-left:50px;
}
.ttp{
margin-top:15px;
}

</style>
</head>
<body>
	<div class="mrgtop">
		<form action="addemployee" method="post">
		  <div class="row">
		    <div class="col">
		      <input type="text" class="form-control" placeholder="First name" name="fname">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Last name" name="lname">
		    </div>
		  </div>
		  <div class="row ttp">
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Personal_ID" name="Personal_ID">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Phone" name="phone">
		    </div>
		  </div>
		  <div class="row ttp">
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Salary" name="salary">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Email" name="email">
		    </div>
		  </div>
		  <div class="row ttp">
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Password" name="password">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Confirm Password" >
		    </div>
		  </div>
		  <div class="form-check form-check-inline ttp">
		  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="Male">
		  <label class="form-check-label" for="inlineRadio1">Male</label>
		</div>
		<div class="form-check form-check-inline ttp">
		  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="Female">
		  <label class="form-check-label" for="inlineRadio2">Female</label>
		</div> 
		<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>