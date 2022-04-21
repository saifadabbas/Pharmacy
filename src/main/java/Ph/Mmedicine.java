/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ph;

import java.io.IOException;
import java.util.Date;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Mmedicine 
{
    private String Name;
    private String Exp_Date;
    private String price;
    private String ID;
    private String Quntity;
    private String Unit;
    
    
    public Mmedicine ()
    {
     
    }
    public void set_Name(String Name)
    {
        this.Name=Name;
    }
    public String get_Name()
    {
        return this.Name;
    }
    public void set_Exp_Date (String Exp_Date)
    {
       this.Exp_Date=Exp_Date;
       
    }
    public String get_Exp_Date()
    {
        return this.Exp_Date;
    }
      public void set_price (String price)
    {
       this.price=price;
       
    }
    public String get_price()
    {
        return this.price;
    }
    
      public void set_ID (String ID)
    {
       this.ID=ID;
       
    }
    public String get_ID()
    {
        return this.ID;
    }
    
      public void set_Quntity (String Quntity)
    {
       this.Quntity=Quntity;
       
    }
    public String get_Quntity()
    {
        return this.Quntity;
    }
    
      public void set_Unit (String Unit)
    {
       this.Unit=Unit;
       
    }
    public String get_Unit()
    {
        return this.Unit;
    }
    
}
