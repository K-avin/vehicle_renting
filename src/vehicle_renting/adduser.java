/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_renting;

/**
 *
 * @author User
 */
public class adduser {
    private String  UserID,Name,UserName,Password;
    String[] row;
     public adduser(String UserID, String Name, String UserName,String Password)
    {
       this.UserID=UserID;
       this.Name=Name;
       this.UserName=UserName;
       this.Password=Password;
       
       
    }

    adduser(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String UserID()
    {
        return UserID;
    }
    public String Name()
    {
        return Name;
    }
     public String UserName()
    {
        return UserName;
    }
      public String Password()
    {
        return Password;
    }
       
    
}
