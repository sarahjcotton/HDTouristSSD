/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarah
 */
public class TouristInformationCenter implements java.io.Serializable {

    private ArrayList<Customer> customers;
    private ArrayList<Customer> cResults;
    private ArrayList<Accommodation> hotels;
    private ArrayList<Accommodation> hResults;
    private ArrayList<Booking> bookings;
    private ArrayList<Booking> bResults;
    private Component frame;

    public TouristInformationCenter() {
        customers = new ArrayList<>();
        cResults = new ArrayList<>();
        hotels = new ArrayList<>();
        hResults = new ArrayList<>();
        bookings = new ArrayList<>();
        bResults = new ArrayList<>();
    }

    /**
     * ***********Booking Code************
     */
    public void addBooking(String h, String r, String f, String s, String p, boolean[] d) {
        loadBookingArray();
        loadHotelArray();
        loadCustomerArray();
        Booking newBooking = new Booking(h, r, f, s, p, d);
        bookings.add(newBooking);

      /*  for (Booking b : bookings) {
            System.out.println("Booking: " + b.toString());
        }
        for (Accommodation ac : hResults) {
            System.out.println("Hotel: " + ac.toString());
        }
        for (Accommodation ho : hotels) {
            System.out.println("Hotel: " + ho.toString());
        }*/



        for (Accommodation a : hotels) {
            if (a.getName().equals(h)) {
                for (Room ro : a.getRooms()) {
                    if (ro.getRoomNo().equals(r)) {
                        //how to set the availability??
                        for (boolean date : d) {
                            //getvalue of dates and add to variables

                            //this needs to ONLY set the ones that are true, and not override the ones that are false!
                            if (d[0] == true) {
                                ro.setMonAv(true);
                            }
                            if (d[1] == true) {
                                ro.setTueAv(true);
                            }
                            if (d[2] == true) {
                                ro.setWedAv(true);
                            }
                            if (d[3] == true) {
                                ro.setThuAv(true);
                            }
                            if (d[4] == true) {
                                ro.setFriAv(true);
                            }
                            if (d[5] == true) {
                                ro.setSatAv(true);
                            }
                            if (d[6] == true) {
                                ro.setSunAv(true);
                            }
                        }
                    }
                }
            }
        }


        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println(d[4]);
        System.out.println(d[5]);
        System.out.println(d[6]);

        saveBookingArray();
        saveHotelArray();
    }

    public void saveBookingArray() {
        try {
            try (FileOutputStream fos = new FileOutputStream("bookings.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(bookings);
                oos.close();
                fos.close();
            }
            JOptionPane.showMessageDialog(frame,
                    "Booking Successfully Saved!");
            System.out.println("Booking successfully saved!");
        } catch (IOException e) {
            System.out.println("Problem saving");
        }
    }

    public void loadBookingArray() {
        try {
            FileInputStream fis = new FileInputStream("bookings.dat");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                bookings = (ArrayList<Booking>) ois.readObject();
                ois.close();
                fis.close();
               // printBookingArray();
            }
            System.out.println("Bookings loaded!");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Problem reading object");
        }
    }
    
    public void printBookingArray(){
        for (Booking boo: bookings){
            System.out.println(boo);
        }
    }

    /**
     * ***********ROOMS CODE**************
     */
    public void addRoom(Room newRoom) {
        loadHotelArray();
        printHotelArray();

        String hname = newRoom.getHotelName(); //get hotel name
        ArrayList<Accommodation> hotel = searchForAccommodation(hname, "Empty"); //get Hotel details

        for (int i = 0; i < hotel.size(); i++) {
            hotel.get(i).addRoom(newRoom);
        }

        saveHotelArray();
        //  saveRoomsArray();
        printHotelArray();
    }

    /**
     * *********END ROOMS CODE******************
     */
    /*ACCOMMODATION CODE*/
    public void addAccommodation(Accommodation accommodation) {
        loadHotelArray();
        hotels.add(accommodation);
        saveHotelArray();
        printHotelArray();
    }

    /*Loads Array items then loops through to find matching
     customers. Adds new cust to results arraylist if lastname matches then prints resuts to screen
     using printResults method*/
    public ArrayList<Accommodation> searchForAccommodation(String name, String type) {
        loadHotelArray();
        loadBookingArray();
        printBookingArray();
        loadCustomerArray();
      //  printCustomerArray();
        if (type.matches("Empty")) {
            for (Accommodation a : hotels) {
                if (a.getName().equals(name)) {
                    hResults.add(a);
                    return hResults;
                }
            }
        } else {
            for (Accommodation a : hotels) {
                if (a.getType().equals(type)) {
                    hResults.add(a);
                }
            }
            //printHResults();
            //System.out.println("Type = " + type);
            return hResults;
        }
        return null;
    }

    //prints results of search to screen
    public void printHotelResults() {
        System.out.println("******* Search Results ***********");
        for (int i = 0; i < hResults.size(); i++) {
            System.out.println(hResults.get(i));
        }
    }

    //print hotels returned in araylist to screen
    public void printHotelArray() {
        System.out.println("******* Hotel Array Contents ***********");
        for (int i = 0; i < hotels.size(); i++) {
            System.out.println(hotels.get(i));
        }
    }

    //Save hotels in arrayl
    public void saveHotelArray() {
        try {
            try (FileOutputStream fos = new FileOutputStream("hotels.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(hotels);
                oos.close();
                fos.close();
            }
            JOptionPane.showMessageDialog(frame,
                    "Accommodation Successfully Saved!");
            System.out.println("Accommodation successfully saved!");
        } catch (IOException e) {
            System.out.println("Problem saving");
        }
    }

    public void loadHotelArray() {
        try {
            FileInputStream fis = new FileInputStream("hotels.dat");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                hotels = (ArrayList<Accommodation>) ois.readObject();
                ois.close();
                fis.close();
                //printHArray();
            }
            // System.out.println("Accommodation loaded!");

        } catch (IOException | ClassNotFoundException e) {
            // System.out.println("Problem reading object");
        }
    }
    /* END OF CUSTOMER CODE*/

    /**
     * **********CUSTOMER CODE***************
     */
    //load existing array items from file then add a new customer to the array, then save array to file and print array to screen
    public void addCustomer(Customer customer) {
        loadCustomerArray();
        customers.add(customer);
        saveCustomerArray();
        printCustomerArray();
    }

    /*Loads Array items then loops through to find matching
     customers. Adds new cust to results arraylist if lastname matches then prints resuts to screen
     using printResults method*/
    public ArrayList<Customer> searchForCustomer(String search) {
        loadCustomerArray();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getSurname().equals(search)) {
                cResults.add(customers.get(i));
            }
        }
        printCResults();
        return cResults;
    }

    //prints results of search to screen
    public void printCResults() {
        System.out.println("******* Search Results***********");
        for (int i = 0; i < cResults.size(); i++) {
            System.out.println(cResults.get(i).toString());
        }
    }

    //print customers returned in araylist to screen
    public void printCustomerArray() {
        for (int count = 0; count < customers.size(); count++) {
            System.out.println(customers.get(count));
        }
    }

    //Save customers in arrayl
    public void saveCustomerArray() {
        try {
            try (FileOutputStream fos = new FileOutputStream("customers.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(customers);
                oos.close();
                fos.close();
            }
            System.out.println("Customer class saved message");
            JOptionPane.showMessageDialog(frame,
                    "Customer Successfully Saved!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame,
                    "There has been a problem, please try again!");
            System.out.println("Problem saving");
        }
    }

    public void loadCustomerArray() {
        try {
            FileInputStream fis = new FileInputStream("customers.dat");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                customers = (ArrayList<Customer>) ois.readObject();
                ois.close();
                fis.close();
                //printArray();
            }
            System.out.println("Customers loaded!");

        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(frame,
                    "Problem loading customers!");
            System.out.println("Problem reading object");
        }
    }
    /* END OF CUSTOMER CODE*/
}