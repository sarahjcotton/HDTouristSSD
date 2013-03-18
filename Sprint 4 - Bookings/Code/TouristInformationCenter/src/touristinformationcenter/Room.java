/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

import java.util.Arrays;

/**
 *
 * @author Sarah
 */
public class Room implements java.io.Serializable {

    private String hotelName;
    private String roomNo;
    private String roomType; //double single etc
    boolean[] available; 

    public Room(String n, String no, String t, boolean[]a) {
        hotelName = n;
        roomNo = no;
        roomType = t;
        available = a;
        Arrays.fill(available, Boolean.FALSE);//boolean monday to sunday false == not booked
    }
    
    public String getHotelName(){
        return hotelName;
    }
    
    public String getRoomNo(){
        return roomNo;
    }
    
    public String getRoomType(){
        return roomType;
    }
    
    public boolean[] getAvailable(){
        return available;
    }  
    
    public void setMonAv(boolean mon)
    {
        //reset array to true on a sunday at midnight?
       available[0] = mon;
    }
   
    public void setTueAv(boolean tue)
    {
        //reset array to true on a sunday at midnight?
       available[1] = tue;
    }
    public void setWedAv(boolean wed)
    {
        //reset array to true on a sunday at midnight?
       available[2] = wed;
    }
    public void setThuAv(boolean thu)
    {
        //reset array to true on a sunday at midnight?
       available[3] = thu;
    }
    public void setFriAv(boolean fri)
    {
        //reset array to true on a sunday at midnight?
       available[4] = fri;
    }
    public void setSatAv(boolean sat)
    {
        //reset array to true on a sunday at midnight?
       available[5] = sat;
    }
    public void setSunAv(boolean sun)
    {
        //reset array to true on a sunday at midnight?
       available[6] = sun;
    }
    
    
    
    @Override
    public String toString()
    {
        return hotelName+ " " +roomNo+ " " +roomType+ " " +available[0]+ " "+available[1]+" "+available[2]+ " " +available[3]+" "+available[4]+" "+available[5]+" "+available[6];
    }
}