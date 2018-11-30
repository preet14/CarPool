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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class PoolAdd extends HttpServlet {

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
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String rdate = request.getParameter("rdate");
        String rtime = request.getParameter("rtime");
        String rseats = request.getParameter("rseats");
        PoolDB pd = new PoolDB();
        PoolDAO pdo = new PoolDAO();
        HttpSession session = request.getSession();
        String email = (String)session.getAttribute("email");
        String uname = (String)session.getAttribute("uname");
        pd.setUname(uname);
        pd.setEmail(email);
       // System.out.println(pd.getEmail()+" "+email);
        pd.setDate(rdate);
        pd.setFrom(from);
        pd.setTime(rtime);
        pd.setTo(to);
        pd.setSeats(rseats);
        if(pdo.addPool(pd))
        {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Ride added Successfully!');");
                out.println("location='Home.jsp';");
                out.println("</script>");
        }
        else
        {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Ride not added !');");
                out.println("location='Home.jsp';");
                out.println("</script>");
        }
    }

}
