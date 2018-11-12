<%-- 
    Document   : log
    Created on : Nov 12, 2018, 1:07:37 PM
    Author     : user
--%>

<%@ page import ="java.sql.*" %>
<%
    
    String userid = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    String myurl = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
    Connection con = DriverManager.getConnection(myurl);
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from members where uname='" + userid + "' and pass='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("userid", userid);
        out.println("welcome " + userid);
        out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("Home.html");
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>
