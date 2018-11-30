/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author user
 */
import java.util.*;

import java.sql.*;
public class PoolDAO{
    
    
    
    public ArrayList<PoolDB> search(String email,String fromloc,String toloc,String time,String date,String uname)
    {
        ArrayList<PoolDB> ls = new ArrayList<>();
        boolean flag = true;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           String myurl = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
           Connection con = DriverManager.getConnection(myurl);
           Statement st = con.createStatement();
           ResultSet rs;
           String q1;
           ResultSet rs2;
           Statement st1=con.createStatement();
           boolean set=false;
           //System.out.println("aa"+" "+fromloc+" "+toloc+" "+uname);
           rs = st.executeQuery("select * from pools where fromloc='" + fromloc + "' and toloc='" + toloc + "' and not email='"+email+"'");
           while(rs.next())
           {
               //System.out.println("bbb");
               q1="select * from statuspool where fromloc='" + fromloc + "' and toloc='" + toloc + "' and email='"+email+"'";
               rs2=st1.executeQuery(q1);
               PoolDB p = new PoolDB();
               if(rs2.next())
               {
                   if(rs2.getString("status").equals("true"))
                   {
                       set=true;
                   }
                   else
                   {
                       set=false;
                   }
               }
               p.setUname(rs.getString(7));
               p.setEmail(rs.getString(6));
               p.setFrom(rs.getString(1));
               p.setTo(rs.getString(2));
               p.setTime(rs.getString(4));
               p.setDate(rs.getString(3));
               p.setSeats(rs.getString(5));
               p.setStatus(set);
               ls.add(p);
           }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            return ls;
    }
    public boolean addPool(PoolDB ob)
    {
        System.out.println("Output");
            boolean flag=false;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           String myurl = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
           Connection con = DriverManager.getConnection(myurl);
           //ResultSet rs;
           //PoolDB p = new PoolDB();
           String query="insert into pools values(?,?,?,?,?,?,?)";
           PreparedStatement pstmt = con.prepareStatement(query);
           pstmt.setString(1,ob.getFrom());
           pstmt.setString(2,ob.getTo());
           pstmt.setString(3,ob.getDate());
           pstmt.setString(4,ob.getTime());
           pstmt.setInt(5, Integer.parseInt(ob.getSeats()));
           pstmt.setString(6,ob.getEmail());
           pstmt.setString(7,ob.getUname());
            System.out.println(query);
           int i= pstmt.executeUpdate();
           //System.out.println(i);
           if(i!=0)
           {
               flag = true;
           }
           con.close();
        }
        catch(Exception e)
        {
                System.out.println(e);
        }
            return flag;
    }
    public ArrayList<PoolDB> getPool(String email,String uname)
    {
        ArrayList<PoolDB> ls = new ArrayList<>();
        boolean flag = true;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           String myurl = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
           Connection con = DriverManager.getConnection(myurl);
           Statement st = con.createStatement();
           Statement st2 = con.createStatement();
           ResultSet rs;
           ResultSet rs2;
           //System.out.println("aa"+" "+fromloc+" "+toloc+" "+uname);
           rs = st.executeQuery("select *from pools where email='" + email + "' and uname='" + uname+"'");
           while(rs.next())
           {
               //System.out.println("bbb");
               PoolDB p = new PoolDB();
               p.setUname(rs.getString(7));
               p.setEmail(rs.getString(6));
               p.setFrom(rs.getString(1));
               p.setTo(rs.getString(2));
               p.setTime(rs.getString(4));
               p.setDate(rs.getString(3));
               p.setSeats(rs.getString(5));
               ls.add(p);
           }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            return ls;
    }
    
}
