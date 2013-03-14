/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

/**
 *
 * @author Sarah
 */
public class Booking {

    private Customer cust;
    private Room room;

    public Booking(Customer c, Room r) {
        cust = c;
        room = r;
    }
    
    public Customer getCust(){
        return cust;
    }
    
    public Room getRoom(){
        return room;
    }
}
