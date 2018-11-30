package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!DOCTYPE html>\n");
      out.write("\t<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>\n");
      out.write("\t\t   HOME  |  CARPOOLING\n");
      out.write("\t\t</title>\n");
      out.write("\t<script src = \"Home.js\"> </script>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Home.css\" >\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("\t<body >\n");
      out.write("\t\t\t<table id = \"tab\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<td><h1><pre><a href=\"Home.html\"><font style=\"color:black;font-family:courier;font-size:160%\">CARPOOLING      </font></h1></td></pre>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t<div class=\"topnav\">\n");
      out.write("                      <a class=\"active\" href=\"Home.jsp\">Home</a>\n");
      out.write("                      <a href=\"Ride.jsp\">Ride</a>\n");
      out.write("                      <a href=\"Submit.jsp\">Submit</a>\n");
      out.write("\t\t\t\t\t  <a href=\"About.jsp\">About</a>\n");
      out.write("\t\t\t\t\t  <a href=\"Contact.jsp\">Contact</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search-container\">\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"/action_page.php\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\">Submit</button>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t<div class=\"topnav\">\n");
      out.write("\t\t\t\t\t  <a href=\"M1.html\">Logout</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t   <marquee behavior=\"alternate\" direction=\"left\">\n");
      out.write("\t                     <a href=\"#\"><img src=\"slide1.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"slide2.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"slide3.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a>\n");
      out.write("\t                   </marquee>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t  <table id=\"tab\">\n");
      out.write("\t\t\t\t     <tr>\n");
      out.write("\t\t\t\t\t  <td>\n");
      out.write("\t\t\t\t\t        <pre><h1>           </h1></pre>\n");
      out.write("\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t  <td>\n");
      out.write("\t\t\t\t         <h1 align=\"center\" style=\"background-color:black;font-size:260%;font-family:courier;color:#2196F3\">Eco Friendly</h1>\n");
      out.write("\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t  <td>\n");
      out.write("\t\t\t\t\t     <h1 align=\"center\" style=\"background-color:black;font-size:260%;font-family:courier;color:#2196F3\">Share your Ride</h1>\n");
      out.write("\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t  <td>\n");
      out.write("\t\t\t\t\t     <h1 align=\"center\" style=\"background-color:black;font-size:260%;font-family:courier;color:#2196F3\">Save fuel</h1>\n");
      out.write("\t\t\t\t\t  </td>\n");
      out.write("\t\t\t\t\t </tr>\n");
      out.write("\t\t\t\t  </table>\n");
      out.write("\t\t\t\t </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\t\n");
      out.write("\t</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
