/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_renting;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class table {
     private String  CustomerID,Name,MobilNumber,NICNumber,Address,EmailAddress ;
    String[] row;
     public table(String CustomerID,String Name,String MobilNumber,String NICNumber,String Address,String EmailAddress)
    {
       this.CustomerID=CustomerID;
       this.Name=Name;
       this.MobilNumber=MobilNumber;
       this.NICNumber=NICNumber;
       this.Address=Address;
       this.EmailAddress=EmailAddress;
    }

    table(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public String CustomerID()
    {
        return CustomerID;
    }
      public String Name()
    {
        return Name;
    }
       public String MobilNumber()
    {
        return MobilNumber;
    }
        public String NICNumber()
    {
        return NICNumber;
    }
        public String Address()
    {
        return Address;
    }
        public String EmailAddress()
    {
          return EmailAddress;
    }
        
}

    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ICTSTUDENT
 */

   