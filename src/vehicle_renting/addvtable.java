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
public class addvtable {
    private String  VehicleID,VehicleNumber,VehicleName,CompanyName,Rate;
    String[] row;
     public addvtable(String VehicleID, String VehicleNumber,String VehicleName,String CompanyName,String Rate)
    {
       this.VehicleID=VehicleID;
       this.VehicleNumber=VehicleNumber;
       this.VehicleName=VehicleName;
       this.CompanyName=CompanyName;
       this.Rate=Rate;
       
    }

    addvtable(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String VehicleID()
    {
        return VehicleID;
    }
     public String VehicleNumber()
    {
        return VehicleNumber;
    }
      public String VehicleName()
    {
        return VehicleName;
    }
       public String CompanyName()
    {
        return CompanyName;
    }
        public String Rate()
    {
        return Rate;
    }
              
    
}
