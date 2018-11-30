/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "Users", urlPatterns = {"/Users"})
public class Users extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pass");
        MemberDAO md = new MemberDAO();
        MemberDB m = new MemberDB();
        m.setUname(uname);
        m.setPwd(pwd);
        MemberDB mo = md.uEmail(m);
        
        if(md.checkUsers(m))
        {
            HttpSession session = request.getSession();
            session.setAttribute("uname",uname);
            String email= mo.getEmail();
            session.setAttribute("email",email);
            response.sendRedirect("Home.jsp");
        }
        else
        {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Wrong Username & password!');");
                out.println("location='MLog.jsp';");
                out.println("</script>");
        }
            
    }
}
