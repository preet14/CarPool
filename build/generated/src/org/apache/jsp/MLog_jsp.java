package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MLog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\tCARPOOLING\n");
      out.write("\t\t</title>\n");
      out.write("\t        <script src = \"Home.js\"> </script>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style2.css\">\n");
      out.write("        </head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<header>\n");
      out.write("        \n");
      out.write("          <header>\n");
      out.write("        \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("        <img src=\"Crazy_Taxi.png\" style=\"width:350px;height:90px;\">\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("    <ul class=\"main-nav\">    \n");
      out.write("        <li class=\"active\"><a href=\"MLog.jsp\"> HOME </a></li>\n");
      out.write("        <li><a href=\"Login.jsp\"> LOG IN </a></li>\n");
      out.write("        <li><a href=\"Signup.jsp\"> SIGN UP </a></li>\n");
      out.write("    </ul>    \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"hero\">\n");
      out.write("    <h1>Are You Ready To Travel?</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </header>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </header>\n");
      out.write("\t</body>\t\n");
      out.write("</html>");
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
