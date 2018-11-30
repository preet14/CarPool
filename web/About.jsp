<%-- 
    Document   : About
    Created on : Nov 15, 2018, 6:23:38 PM
    Author     : user
--%>
<%
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
		<title>
		   CARPOOLING
		</title>
	</head>
	<script src = "Home.js"> </script>
	<link rel="stylesheet" type="text/css" href="Home.css" >
	<body >
			<table id = "tab">
				<tr>
				<div class="logo">
				<td><h1><pre><a href="Home.jsp"><font style="color:black;font-family:courier;font-size:160%">CARPOOLING      </font></a></h1></td></pre>
				</div>
				
				<td>
				<div class="topnav">
                      <a href="Home.jsp">Home</a>
                      <a href="Ridee.jsp">Ride</a>
                      <a href="Submit.jsp">Submit</a>
					  <a class="active" href="About.jsp">About</a>
					  <a href="Contact.jsp">Contact</a>
							<div class="search-container">
								<form action="PoolCheck">
								<input type="text" placeholder="Search.." name="search">
								<button type="submit">Submit</button>
								</form>
							</div>
							</div>
				</td>
				<td>
				<div class="topnav">
					  <a href="Logout.jsp">Logout</a>
				</div>
				</td>
				</tr>
			</table>
			<table>
				<tr>	
					<td>
					   <marquee behavior="alternate" direction="left">
	                     <a href="#"><img src="slide1.jpg" width="960" height="360" alt="" /></a> <a href="#"><img src="slide2.jpg" width="960" height="360" alt="" /></a> <a href="#"><img src="slide3.jpg" width="960" height="360" alt="" /></a>
	                   </marquee>
					</td>
				</tr>
				<tr>
				     <td>
					    <font style="background-color:black;font-size:80%;font-family:courier;color:#2196F3">
						   Carpooling Helps Save You Money
                              You can save money on gas and such by diving up the gas fees among your carpool passengers. 
							  The more people you have the more you can save. 
							  Carpooling also helps you save on the cost of vehicle repairs and maintenance if you rotate vehicle use between the members of your carpool team. 
                           Carpooling Helps the Environment
                              Carpooling cuts down on the number of cars and vehicle son the road. 
							  Fewer cars means there is less carbon and other gasses and pollution getting into the air. 
							  This protects the environment by keeping the air, water, and land cleaner.
                           It is Good for You
                              According to numerous health reports and research, air pollution caused by auto emissions can significantly increase the likelihood of health issues such as asthma, allergies, lung cancer, COPD, and the like. 
							  Research data has also suggested that carpooling can be far less stressful than simply commuting on your own.
                           Carpooling is a Very Convenient Option
                              Carpooling is an option that can give you great flexibility. 
							  If you need to carpool three days a week or five, you can do so. 

                           It Helps You Make New Friends
                              Carpooling is also a wonderful way to meet interesting people, get to know the people you work with or go to school with, and to make new friends!
						</font>
					 </td>
				</tr>
				<tr>
				<td>
				  <table id="tab">
				     <tr>
					  <td>
					        <pre><h1>           </h1></pre>
					  </td>
					  <td>
				         <h1 align="center" style="background-color:black;font-size:260%;font-family:courier;color:#2196F3">Eco Friendly</h1>
					  </td>
					  <td>
					     <h1 align="center" style="background-color:black;font-size:260%;font-family:courier;color:#2196F3">Share your Ride</h1>
					  </td>
					  <td>
					     <h1 align="center" style="background-color:black;font-size:260%;font-family:courier;color:#2196F3">Save fuel</h1>
					  </td>
					 </tr>
				  </table>
				 </td>
				</tr>
			</table>
		<div>
			

		</div>
	</body>	
	</html>
<%
    }
%>