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
public class MemberDB {
    
    private String fname;
    
    private String lname;
    
    private String pwd;
    
    private String mobileno;
    
    private String email;
//    private String town;
    
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getFname() {
        return fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public boolean equals(Object o)
    {
        MemberDB l = (MemberDB)o;
        if(uname.equals(l.getUname()) && pwd.equals(l.getPwd()))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    
}
