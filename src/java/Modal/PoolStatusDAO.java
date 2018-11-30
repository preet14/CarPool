/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PoolStatusDAO {
    public boolean save(PoolStatusDB p) {
    
        boolean flag = false;
        
        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);
            
            String query="insert into statusPool values(?,?,?,?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            
            pstmt.setString(2,p.getFromLoc());
            
            pstmt.setString(1,p.getEmail());
            
            pstmt.setString(3,p.getToLoc());
            
            pstmt.setString(4,"false");
            
            int i = pstmt.executeUpdate();
            
            if(i != 0) {
                //System.out.println("i");
                flag = true;
            }
           
            con.close();
           
        }
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            
        }
        
        return flag;
    }

    public boolean getPoolStatus(String email,String toLoc,String fromLoc)
    {
      boolean flag = false;
      try
        {
           Class.forName("com.mysql.jdbc.Driver");
           String myurl = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
           Connection con = DriverManager.getConnection(myurl);
           //ResultSet rs;
           //PoolDB p = new PoolDB();
            String s = "true";
            Statement stmt=con.createStatement();
            String query="update statusPool set status='"+s+"'where email='"+email+"' and toLoc='"+toLoc+"' and fromLoc='"+fromLoc+"'";
            stmt.executeUpdate(query);
            Statement st2 = con.createStatement();
            String q = "select *from statusPool where status='"+s+"'where email='"+email+"' and toLoc='"+toLoc+"' and fromLoc='"+fromLoc+"'";
            ResultSet rs = st2.executeQuery(q);
            if(rs.next())
            {
                flag=true;
            }
            else 
            {
                flag=false;
            }
           con.close();
        }
        catch(Exception e)
        {
                System.out.println(e);
        }
      return flag;
    }
    public ArrayList<PoolStatusDB> getRequests(String email) {
    
        ArrayList<PoolStatusDB> a = new ArrayList<>();
        
        String url = "jdbc:mysql://localhost:3306/testDemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        
        boolean flag;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            Statement stmt1=con.createStatement();
            
            String nik = "select fromloc,toloc from pools where email='"+email+"';";
            
            String pre;
            
            ResultSet r3 = stmt.executeQuery(nik);
            
            ResultSet r4;
            
            while(r3.next()) {
                
                pre = "select * from statusPool where fromLoc='"+r3.getString("fromloc")+"' and toLoc='"+r3.getString("toloc")+"' and status='false';";
                
                r4 = stmt1.executeQuery(pre);
                
                while(r4.next()) {
                    
                    PoolStatusDB p = new PoolStatusDB(r4.getString("email"),r4.getString("fromLoc"),r4.getString("toLoc"),false);
                    
                    a.add(p);
                }
            
            }
            
//            String query="select fromloc,toloc from statusPool where email='"+email+"' and status='false';";
//            
//            ResultSet rs = stmt.executeQuery(query);
//            
//            ResultSet rs2;
//            
//            String query1;
//            
//            while(rs.next())
//            {
//                query1="select * from statusPool where fromLoc='"+rs.getString("fromloc")+"'and toLoc='"+rs.getString("toloc")+"' and status='false';";
//                
//                rs2 = stmt1.executeQuery(query1);
//                
//                while(rs2.next()){
//                
//                    PoolStatusDB p = new PoolStatusDB(rs2.getString("email"),rs2.getString("fromLoc"),rs2.getString("toLoc"),false);
//                    
//                    a.add(p);
//                    
//                }
con.close();
            }
        catch(Exception e) {
            System.out.println(e);
            flag = false;
            //System.out.println(e);
        }
        
        return a;
        
    }
    public boolean changeStatus(PoolStatusDB p)
    {
        boolean flag = false;
      try
        {
            System.out.println("tttt");
           Class.forName("com.mysql.jdbc.Driver");
           String myurl = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
           Connection con = DriverManager.getConnection(myurl);
           //ResultSet rs;
           //PoolDB p = new PoolDB();
            String s = "true";
            Statement stmt=con.createStatement();
            String query="update statusPool set status='"+s+"'where email='"+p.getEmail()+"' and toLoc='"+p.getToLoc()+"' and fromLoc='"+p.getFromLoc()+"'";
            System.out.println(query);
            int i=stmt.executeUpdate(query);
            //Statement st2 = con.createStatement();
            //String q = "select *from statusPool where status='"+s+"'where email='"+p.getEmail()+"' and toLoc='"+p.getToLoc()+"' and fromLoc='"+p.getFromLoc()+"'";
            //ResultSet rs = st2.executeQuery(q);
            if(i!=0)
            {
                flag=true;
            }
            else 
            {
                flag=false;
            }
           con.close();
        }
        catch(Exception e)
        {
                System.out.println(e);
        }
      return flag;
    }
}
