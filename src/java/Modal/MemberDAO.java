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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author user
 */
public class MemberDAO {
    
    public boolean saveUser(MemberDB s) {
        
         boolean flag = false;
//    
//       String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
//    
//       try {
//           
//           Class.forName("com.mysql.cj.jdbc.Driver");
//            
//           Connection con = DriverManager.getConnection(url);
//           
//           String qr = "insert into member values(?,?,?,?,?,?)";
//            
//           PreparedStatement pstmt = con.prepareStatement(qr);
//           
//           pstmt.setString(1,s.getFirstname());
//           
//           pstmt.setString(2,s.getLastname());
//           
//           pstmt.setString(3,s.getPwd());
//           
//           pstmt.setString(4,s.getMobileno());
//           
//           pstmt.setString(5,s.getEmail());
//           
//           pstmt.setString(6,s.getUname());
//           
//           int i = pstmt.executeUpdate();
//           
//           if(i>0)
//           {
//               flag=true;
//           }
//       }
//       catch(Exception e) {
//           
//           flag = false;
//
//           System.out.println(e);
//     
//       }
//       return flag;
            try
            {
                Configuration cf = new Configuration();
                cf.configure("hibercfg/hibernate.cfg.xml");
                SessionFactory sf = cf.buildSessionFactory();
                Session ss = sf.openSession();
                Transaction tx = ss.beginTransaction();
                ss.save(s);
                tx.commit();
                ss.close();
                sf.close();
                flag = true;
            }
            catch(Exception e)
            {
                flag=false;
                System.out.println(e);
            }
            return flag;
    } 
    public boolean checkUsers(MemberDB u)
    {
//        boolean flag = true;
//
//        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
//
//        try {
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection con = DriverManager.getConnection(url);
//
//            Statement stmt=con.createStatement();
//            
//            String query="select * from member where uname='"+u.getUsername()+"'";
//            
//            int c = 0;
//            
//            ResultSet rs = stmt.executeQuery(query);
//            
//            if(rs.next())
//            {
//                flag = true;
//            }
//            else {
//                
//                flag = false;
//            }
                MemberDB l1=null;
      try{
      Configuration cf = new Configuration();
      cf.configure("hibercfg/hibernate.cfg.xml");
      SessionFactory sf = cf.buildSessionFactory();
      Session s = sf.openSession();
      l1 = (MemberDB)s.get(MemberDB.class,u.getUname());
      s.close();
      sf.close();
      
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      if(l1==null)
      {
          return false;
      }
      else if(l1.equals(u))
      {
          return true;
      }
      else
      {
          return false;
      }
    }
    public MemberDB uEmail(MemberDB u)
    {
        MemberDB ob = new MemberDB();
        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            String query="select * from member where uname='"+u.getUname()+"'";
            
            int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next())
            {
                 ob.setEmail(rs.getString("email"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return ob;
    }
    public boolean check(MemberDB u) {
    
        boolean flag = true;

        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            String query="select * from member where uname='"+u.getUname()+"'";
            
            int c = 0;
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                 c++;  //System.out.println(c); 
            }
            
            if(c == 0) {
               
                flag = true;
            }
            
            else {
                
                flag = false;
            }

        }   
        
        catch(Exception e) {
            //System.out.println(e);
            flag = false;
            
        }
        
        return flag;
    }

        
    
}
