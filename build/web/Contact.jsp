<%-- 
    Document   : Contact
    Created on : Nov 15, 2018, 6:22:47 PM
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
	<script src = "Home.js"> </script>
	<link rel="stylesheet" type="text/css" href="Home.css" >
        </head>

	<body >
			<table id = "tab">
				<tr>
				<div class="logo">
				<td><h1><pre><a href="Home.jsp"><font style="color:black;font-family:courier;font-size:160%">CARPOOLING      </font></a></pre></h1></td>
                                </div>	
				<td>
				<div class="topnav">
                      <a href="Home.jsp">Home</a>
                      <a href="Ridee.jsp">Ride</a>
                      <a href="Submit.jsp">Submit</a>
					  <a class="active" href="About.jsp">About</a>
					  <a href="Contact.jps">Contact</a>
							<div class="search-container">
								<form action="">
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
					    
					</td>
				</tr>
                                <tr>
                                    <td align="center"><h1 style="background-color:black;font-size:160%;font-family:courier;color:#2196F3">+91-9999999911 </h1> </td>
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