/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

/**
 *
 * @author Sarah
 */
public class Booking implements java.io.Serializable {
    
    private int id;
    private Customer cust;
    private String hotel;
    private String room;
    private String first;
    private String sur;
    private String phone;
    private Room rm;
    boolean[] dates;

    public Booking(String h, String r, String f, String s, String p, boolean[] d, int i) {
        id = i;
        hotel = h;
        room = r;
        first = f;
        sur = s;
        phone = p;        
        dates = d;
    }
    
    @Override
    public String toString(){
        return "Hotel: " +hotel+ " Room: " +room+ " First name: " +first+ " Surname: " +sur+ " Phone: "+phone+ " Dates: "+dates[0]+dates[1]+dates[2]+dates[3]+dates[4]+dates[5]+dates[6];
    }
    
    public int getID(){
        return id;
    }
    
    public String getHotelName(){
        return hotel;
    }

    public Customer getCust() {
        return cust;
    }

    public Room getRoom() {
        return rm;
    }
    
    public String getRm(){
        return room;
    }
    
    public String getFirst() {
        return first;
    }
    
    public String getSurname() {
        return sur;
    }
    
    public String getPhone() {
        return phone;
    }

    public boolean[] getDates() {
        return dates;
    }

    public void setCust(Customer c) {
        cust = c;
    }

    public void setRoom(Room r) {
        rm = r;
    }   
}
