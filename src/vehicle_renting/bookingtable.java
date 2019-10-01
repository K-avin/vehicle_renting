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
public class bookingtable {
     private String  CustomerID,BookingID,BookingTo,BookingFrom,TakeDate,RetuntDate,PackageCatacary ;
     public bookingtable (String CustomerID,String BookingID,String BookingTo,String BookingFrom,String TakeDate,String RetuntDate,String PackageCatacary)
    {
       this.CustomerID=CustomerID;
       this.BookingID=BookingID;
       this.BookingTo=BookingTo;
       this.BookingFrom=BookingFrom;
       this.TakeDate=TakeDate;
       this.RetuntDate=RetuntDate;
       this.PackageCatacary=PackageCatacary;
    }

    bookingtable(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     public String CustomerID()
    {
        return CustomerID;
    }
     public String BookingID()
     {
         return BookingID;
     }
      public String BookingTo()
    {
        return BookingTo;
    }
       public String BookingFrom()
    {
        return BookingFrom;
    }
        public String TakeDate()
    {
        return TakeDate;
    }
        public String RetuntDate()
    {
        return RetuntDate;
    }
        public String PackageCatacary()
    {
        return PackageCatacary;
    }
        

}
