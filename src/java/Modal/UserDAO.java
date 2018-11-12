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

/**
 *
 * @author NIKHIL-PC
 */
public class UserDAO {
    
    public boolean save(UserDataBase s) {
        
       boolean flag = true;
    
       String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
    
       try {

           Class.forName("com.mysql.cj.jdbc.Driver");
            
           Connection con = DriverManager.getConnection(url);
           
           String qr = "insert into details values(?,?,?,?,?,?)";
            
           PreparedStatement pstmt = con.prepareStatement(qr);
           
           pstmt.setString(1,s.getFirstname());
           
           pstmt.setString(2,s.getLastname());
           
           pstmt.setString(3,s.getPassword());
           
           pstmt.setString(4,s.getMobileno());
           
           pstmt.setString(5,s.getDob());
           
           pstmt.setString(6,s.getUsername());
           
           int i = pstmt.executeUpdate();
        
            
       }
       catch(Exception e) {
           
           flag = false;

           System.out.println(e);
     
       }
       
       return flag;
       
       
    } 
    
    public boolean check(UserDataBase u) {
    
        boolean flag = true;

        String url = "jdbc:mysql://localhost:3306/UserDetails?user=root&password=692512&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url);

            Statement stmt=con.createStatement();
            
            String query="select * from details where username='"+u.getUsername()+"'";
            
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
