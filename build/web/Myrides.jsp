<%-- 
    Document   : ResultRide
    Created on : Nov 19, 2018, 2:07:30 PM
    Author     : user
--%>
<%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
    if(request.getSession().getAttribute("uname")==null)
    {
%>
<script>
    location = "Login.jsp";
    </script>
    <%
        }
        else
        {
        %>
<%@page import="java.util.ArrayList"%>
<%@page import="Modal.PoolDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
	<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
*{
  box-sizing: border-box;
}
*
{
    margin: 0;
    padding: 0;
}

body
{
    font-family: monospace;
	background:url(new1.jpg);
	background-size: cover;
	repeat:no-repeat;
}
.row
{
    max-width: 1200px;
    margin: auto;
}

.main-nav
{
    float: right;
    list-style: none;
    margin-top: 30px;
}
.main-nav li
{
    display: inline-block;
}

.main-nav li.active a
{
    border: 1px solid white;
    
}

.main-nav li a:hover
{
    border: 1px solid white;
}


.main-nav li a
{
    color: white;
    text-decoration: none;
    padding: 5px 20px;
    font-family: "Roboto", sans-serif;
    font-size: 15px;
}

.hero
{
    position: absolute;
    width: 1200px;
    margin-left: 0px;
    margin-top: 0px;
    
}


h1
{
    color: white;
    text-transform: uppercase;
    font-size: 70px;
    text-align: center;
    margin-top: 275px;
    
}
header
{
    background-image:linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url(pic1.jpg);
    height: 100vh;
    background-size: cover;
    background-position: center;
}
.button
{
    margin-top: 30px;
    margin-left: 440px;
}

.btn
{
    border: 1px solid white;
    padding: 10px 30px;
    color: white;
    text-decoration: none;
    margin-right: 5px;
    font-size: 13px;
    text-transform: uppercase;
}
.btn-one
{
    background-color: darkorange;
    font-family: "Roboto", sans-serif;
}

.btn-two
{
    font-family: "Roboto", sans-serif;
}


.btn-two:hover
{
    background-color: darkorange;
    transition: all 0.5s ease-in;
    
        
}

.logo img
{
    width: 150px;
    height: auto;
}

body {
  font-family: Arial;
  font-size: 17px;
}

.container {
  position: relative;
  max-width: 800px;
  margin: 0 auto;
}

.container img {vertical-align: bottom;}

.container .content {
  position: relative;
  top:10px;
  bottom: 0;
  background: rgb(0, 0, 0); /* Fallback color */
  background: rgba(0, 0, 0, 0.5); /* Black background with 0.5 opacity */
  color: #f1f1f1;
  width: 100%;
  padding: 20px;
}
 .logo {
	padding:0;
	width:auto;
	float:left;
	height:112px;
	color:black;
    }
	.topnav {
  overflow: hidden;
  background-color: black;
  float:right;
}

.topnav a {
  float: left;
  display: block;
  color: #2196F3;
  text-align: center;
  padding: 12px 14px;
  text-decoration: none;
  font-size: 20px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: blue;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}

.loginBox
{
	position: absolute;
	top: 55%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 350px;
	height: 420px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}
.user
{
	width: 100px;
	height: 100px;
	border-radius: 50%;
	overflow: hidden;
	position: absolute;
	top: calc(-100px/2);
	left: calc(50% - 50px);
}
h2
{
	margin: 0;
	padding: 0 0 20px;
	color: #efed40;
	text-align: center;
}
.loginBox p
{
	margin: 0;
	padding: 0;
	font-weight: bold;
	color: #fff;
}
.loginBox input
{
	width: 100%;
	margin-bottom: 20px;
}
.loginBox input[type="text"],
.loginBox input[type="password"]
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}
::placeholder
{
	color: rgba(255,255,255,.5);
}
.loginBox input[type="submit"]
{
	border: none;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
	background: black;
	cursor: pointer;
	border-radius: 20px;
}
.loginBox input[type="submit"]:hover
{
	background: #efed40;
	color: #262626;
}
.loginBox a
{
	color: #fff;
	font-size: 14px;
	font-weight: bold;
	text-decoration: none;
}
           .outer-table td,th {
                    
                    border: 1px solid black;
                    text-align: left;
                    padding: 8px;
                }
        .outer-table {
	padding: 20px;
	float: left;
	background: #f2f2f2;
	opacity: 0.7;
       }
.outer-table tr th {

    padding: 10px;
    font-size: 20px;
    text-align: center;
    text-transform: capitalize;
    background: #000;
    color: #fff;
    border: 1px solid;

}
.outer-table tr td img {

    width: 200px;
    height: 200px;
    border: 4px solid #000;

}
.outer-table tr td {

    text-align: center;
    font-size: 20px;

}
.outer-table tr td a {
	padding: 10px;
	color: red;
	text-decoration: navajowhite;
	font-size: 22px;
}

</style>
</head>
<body >
            <div class="logo">
				<!-- <td><h3><pre><a href="Home.html" style="text-decoration: none !important;"><font style="color:black;font-family:courier;font-size:270%">CARPOOLING    </font></h3></td></pre> -->
				<a href="Home.jsp" style=" text-decoration: none !important;"><img src="Crazy_Taxi.png" style="width:350px;height:90px;"><pre><h3>     	                                         </h3></pre></a>
				</div>
				
            <table id = "tab">
				<tr>
				
				<td>
				<div class="topnav">
                                          <a href="Home.jsp">Home</a>
                                          <a href="Ride.jsp">Ride</a>
                                          <a href="Submit.jsp">Submit</a>
                                          <a class="active" href="Myrides.jsp">Myrides</a>
                                          <a href="setStatusPool?id=">Requests</a>
					  <a href="About.jsp">About</a>
					  <a href="Contact.jsp">Contact</a>		
				</div>
				</td>
				<td>
				<div class="topnav">
					  <a href="Logout.jsp">Logout</a>
				</div>
				</td>
				</tr>
			</table>
    <br>
            <%
                session = request.getSession();
                ArrayList<PoolDB> al = (ArrayList<PoolDB>)session.getAttribute("poolDetail");
                if(al.size()!=0){
            %>
        <table class='outer-table' style="border-collapse: collapse;width: 100%;">
        <tr>
            <th>S.No.</th>
            <th>UserName</th>
            <th>Email</th>
            <th>From Location</th>
            <th>To Location</th>
            <th>Seats</th>
            <th>Date</th>
            <th>Time</th>
            <th>Status</th>
        </tr>
        <%
           int i;
           for(i=0;i<al.size();i++)
           {
        %>
        <tr>
            <td><%=i+1%></td>
            <td><%=(al.get(i)).getUname() %></td>
            <td><%=(al.get(i)).getEmail()%></td>
            <td><%=(al.get(i)).getFrom()%></td>
            <td><%=(al.get(i)).getTo()%></td>
            <td><%=(al.get(i)).getSeats() %></td>
            <td><%=(al.get(i)).getDate()%></td>
            <td><%=(al.get(i)).getTime()%></td>
            <%
                if(!(al.get(i)).isStatus())
                {
            %>
               <td><a href="">Remove</a></td>
            <%
                }
                else{
            %>
               <td><a href="">Not Requested</a></td>
            <%
                }
                %>
        </tr>
        <%
           }
          }
          else{
                out.println("<h2>No Rides Available</h2>");
           } 
        %>
    </table>
  <table class="container" cellpadding="10" cellspacing="10">
  <tr>
  <td>
  </td>
  </tr>
  <tr>
  <td>
  </td>
  </tr>
  <tr>
  <td>
  </td>
  </tr>
  <tr>
  <td align="center">
  <div class="content">
     <img src="join.png" style="width:50%;height:40%;">
	 <h3>JOIN</h3>
	 <h4>It's quick, simple & free.You have to sign up to offer empty car seats</h4>
  </div>
  </td>
  <td align="center">
  <div class="content">
     <img src="search.png" style="width:50%;height:20%;">
	  <h3>Offer/Book a Ride</h3>
      <h4>Search rides on your way and book seats.Post your rides</h4>
  </div>
  </td>
  <td align="center">
  <div class="content">
     <img src="car.jpg" style="width:50%;height:40%;">
	  <h3>Travel Together</h3>
      <h4>Don't just travel Have a nice Journey!You save Time& Money:-)</h4>
  </div>
  </td>
  </tr>
  </table>


</body>
</html>
<%
    }
%>
