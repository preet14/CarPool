/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.PoolDAO;
import Modal.PoolDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class Mypools extends HttpServlet {

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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        PoolDAO ob = new PoolDAO();
        HttpSession session = request.getSession();
        String email = (String)session.getAttribute("email");
        String uname = (String)session.getAttribute("uname");
        //System.out.println(email);
        ArrayList<PoolDB> pd;
        pd = ob.getPool(email,uname);
        if(pd.size()!=0)
        {
                session.setAttribute("poolDetail",pd);
                response.sendRedirect("Myrides.jsp");
        }
        else
        {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Ride Not Available!');");
                out.println("location='Home.jsp';");
                out.println("</script>");
        }
    }

   
}
