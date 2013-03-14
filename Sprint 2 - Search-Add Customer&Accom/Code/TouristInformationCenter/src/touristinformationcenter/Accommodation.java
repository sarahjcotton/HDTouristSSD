/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

/**
 *
 * @author Sarah
 */
public class Accommodation implements java.io.Serializable{
    
     private String name;
     private String address;
     private String phone;
     private String type; 
      
     public Accommodation(String n, String a, String p, String t) {
        name = n;
        address = a;
        phone = p;
        type = t;
    }
    
    @Override
    public String toString() {
        return name + " " + address + " " + phone + " " + type;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }

    public String getType() {
        return type;
    }
}