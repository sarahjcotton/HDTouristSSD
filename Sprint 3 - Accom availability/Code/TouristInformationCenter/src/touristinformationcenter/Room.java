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
        Arrays.fill(available, Boolean.TRUE);//boolean monday to sunday
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
    
    public void setAvailability(boolean mon, boolean tues, boolean weds,boolean thurs,boolean fri,boolean sat, boolean sun)
    {
        //reset array to true on a sunday at midnight
       available[0] = mon;
       available[1] = tues;
       available[2] = weds;
       available[3] = thurs;
       available[4] = fri;
       available[5] = sat;
       available[6] = sun;
       
    }
    
    
    @Override
    public String toString()
    {
        return hotelName+ " " +roomNo+ " " +roomType+ " " +available[0]+ " "+available[1]+" "+available[2]+ " " +available[3]+" "+available[4]+" "+available[5]+" "+available[6];
    }
}