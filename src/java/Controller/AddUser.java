/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.MemberDAO;
import Modal.MemberDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class AddUser extends HttpServlet {

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
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        String mobileno = request.getParameter("mobileno");
        String email = request.getParameter("email");
        MemberDB pd = new MemberDB();
        MemberDAO pdo = new MemberDAO();
        System.out.println(fname+" "+lname+" "+uname+" ");
        pd.setFname(fname);
        pd.setLname(lname);
        pd.setMobileno(mobileno);
        pd.setPwd(pwd);
        pd.setUname(uname);
        pd.setEmail(email);
        if(pdo.saveUser(pd))
        {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User added Successfully!');");
                out.println("location='MLog.jsp';");
                out.println("</script>");
        }
        else
        {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User Exists!');");
                out.println("location='MLog.jsp';");
                out.println("</script>");
        }
    }

}
