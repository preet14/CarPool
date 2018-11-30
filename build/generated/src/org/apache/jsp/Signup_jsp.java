package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>Sign Up Form</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("\t\t<script src = \"SignUp.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"loginBox\">\n");
      out.write("\t\t\t<img src=\"user.png\" class=\"user\">\n");
      out.write("\t\t\t<h2>Sign Up Here</h2>\n");
      out.write("                        <form action=\"AddUser\" method=\"post\" name=\"myforms\">\n");
      out.write("\t\t\t\t<p>First Name</p>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"fname\" placeholder=\"First Name\" required> \n");
      out.write("\t\t\t\t<p>Last Name</p>\n");
      out.write("                                <input type=\"text\" name=\"lname\" placeholder=\"Last Name\" required>\n");
      out.write("\t\t\t\t<p>Username</p>\n");
      out.write("\t\t                <input type=\"text\" name=\"uname\" placeholder=\"UserName\" required>\n");
      out.write("\t\t\t\t<p>Contact No. </p>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ct\" placeholder=\"+91-\" required>\n");
      out.write("\t\t\t\t<p>Email</p>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("\t\t\t\t<p>Password</p>\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"pwd\" id=\"pwdt\" placeholder=\"••••••\" required>\n");
      out.write("\t\t\t\t<p>Re-Enter Password</p>\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"pswd\" id=\"cpwdt\" placeholder=\"••••••\" required>\n");
      out.write("\t\t\t\t<input type=\"submit\" onclick=\"validatePass()\" name=\"bt\" value=\"Sign Up\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
