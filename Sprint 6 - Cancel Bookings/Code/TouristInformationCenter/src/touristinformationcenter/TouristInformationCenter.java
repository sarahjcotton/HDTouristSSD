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
import java.util.Iterator;
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
    public ArrayList<Booking> searchForBooking(String sur, String phone) {
        loadBookingArray();
        printBookingArray();
        System.out.println(sur + phone);

        for (Booking b : bookings) {
            if ((b.getSurname().equals(sur)) && (b.getPhone().equals(phone))) {
                bResults.add(b);
                System.out.println(b.toString());
            }

        }
        return bResults;
    }

    public void deleteBooking(int i) {
        loadHotelArray();
        int id = i;
        String hotel;
        String room;
        Booking booked;

        for (Booking b : bookings) { //got through bookings
            if (b.getID() == i) { //if id of booking matches paramter val, get booking
                booked = b;
                hotel = b.getHotelName();
                room = b.getRm();
                System.out.println(booked.toString());

                boolean mo = booked.dates[0];
                boolean tu = booked.dates[1];
                boolean we = booked.dates[2];
                boolean th = booked.dates[3];
                boolean fr = booked.dates[4];
                boolean sa = booked.dates[5];
                boolean su = booked.dates[6];

//                System.out.println(mo);
//                System.out.println(tu);
//                System.out.println(we);
//                System.out.println(th);
//                System.out.println(fr);
//                System.out.println(sa);
//                System.out.println(su);


                for (Accommodation a : hotels) { //loop through hotels
                    if (a.getName().toLowerCase().equals(hotel.toLowerCase())) { //if hotel matches that in booking
                        for (Room ro : a.getRooms()) { //loops through rooms
                            if (ro.getRoomNo().equals(room)) { //if room no matches booking room
                                if (mo == true) {
                                    System.out.println(ro.available[0]);
                                    ro.setMonAv(false);
                                }
                                if (tu == true) {
                                    System.out.println(ro.available[1]);
                                    ro.setTueAv(false);
                                }
                                if (we == true) {
                                    System.out.println(ro.available[2]);
                                    ro.setWedAv(false);
                                }
                                if (th == true) {
                                    System.out.println(ro.available[3]);
                                    ro.setThuAv(false);
                                }
                                if (fr == true) {
                                    System.out.println(ro.available[4]);
                                    ro.setFriAv(false);
                                }
                                if (sa == true) {
                                    System.out.println(ro.available[5]);
                                    ro.setSatAv(false);
                                }
                                if (su == true) {
                                    System.out.println(ro.available[6]);
                                    ro.setSunAv(false);
                                }
                            }
                        }
                    }
                }
            }
        }

        Iterator<Booking> iter = bookings.iterator(); //can't read and write, must be done using iterator
        while (iter.hasNext()) {
            Booking b = iter.next();
            if (b.getID() == i) {
                iter.remove(); // Removes the 'current' item
            }
        }
        saveBookingArray();
        saveHotelArray();
    }

    public void checkarray() {
        loadBookingArray();
        int id = 0;

        for (int i = 0; i < bookings.size(); i++) {
            id = bookings.get(i).getID() + 1;
        }
        System.out.println(id);
    }

    public void addBooking(String h, String r, String f, String s, String p, boolean[] d) {
        loadBookingArray();
        loadHotelArray();
        loadCustomerArray();
        int id = bookings.get(bookings.size() - 1).getID() + 1;

        Booking newBooking = new Booking(h, r, f, s, p, d, id);
        bookings.add(newBooking);
        String dates = "Dates: \t";
        String mo = null, tu = null, we = null, th = null, fr = null, sa = null, su = null;


        for (Accommodation a : hotels) {
            if (a.getName().toLowerCase().equals(h.toLowerCase())) {
                for (Room ro : a.getRooms()) {
                    if (ro.getRoomNo().equals(r)) {
                        for (boolean date : d) {
                            //getvalue of dates and add to variables
                            //this needs to ONLY set the ones that are true, and not override the ones that are false!
                            if (d[0] == true) {
                                ro.setMonAv(true);
                                mo = "Monday";
                            }
                            if (d[1] == true) {
                                ro.setTueAv(true);
                                tu = "Tuesday";
                            }
                            if (d[2] == true) {
                                ro.setWedAv(true);
                                we = "Wednesday";
                            }
                            if (d[3] == true) {
                                ro.setThuAv(true);
                                th = "Thursday";
                            }
                            if (d[4] == true) {
                                ro.setFriAv(true);
                                fr = "Friday";
                            }
                            if (d[5] == true) {
                                ro.setSatAv(true);
                                sa = "Saturday";
                            }
                            if (d[6] == true) {
                                ro.setSunAv(true);
                                su = "Sunday";
                            }
                        }
                    }
                }
            }
        }
        Boolean success = saveBookingArray();

        if (success == true) {

            if (mo != null) {
                dates += mo + " ";
            }
            if (tu != null) {
                dates += tu + " ";
            }
            if (we != null) {
                dates += we + " ";
            }
            if (th != null) {
                dates += th + " ";
            }
            if (fr != null) {
                dates += fr + " ";
            }
            if (sa != null) {
                dates += sa + " ";
            }
            if (su != null) {
                dates += su + " ";
            }
            System.out.println(dates);
            String message = "Booking Confirmation\n\n"
                    + "Name:  \t" + f + " " + s + "\n"
                    + "Hotel: \t" + h + "\n"
                    + dates;
            JOptionPane.showMessageDialog(frame, message);
        }
        saveHotelArray();
    }

    public Boolean saveBookingArray() {
        try {
            try (FileOutputStream fos = new FileOutputStream("bookings.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(bookings);
                oos.close();
                fos.close();
            }
            return true;

        } catch (IOException e) {
            System.out.println("Problem saving");
        }

        return false;
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

    public void printBookingArray() {
        for (Booking boo : bookings) {
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

        hResults.clear();
        loadHotelArray();
        loadBookingArray();
        printBookingArray();
        loadCustomerArray();
        //  printCustomerArray();
        if (type.matches("Empty")) {
            for (Accommodation a : hotels) {
                if (a.getName().toLowerCase().equals(name.toLowerCase())) {
                    hResults.add(a);
                }
                return hResults;
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
    public Boolean saveHotelArray() {

        try {
            try (FileOutputStream fos = new FileOutputStream("hotels.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(hotels);
                oos.close();
                fos.close();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Problem saving");
        }
        return false;
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
    /* END OF HOTEL CODE*/

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
        cResults.clear();
        loadCustomerArray();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getSurname().toLowerCase().equals(search.toLowerCase())) {
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