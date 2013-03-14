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

    ArrayList<Customer> customers;
    ArrayList<Customer> cResults;
    ArrayList<Accommodation> hotels;
    ArrayList<Accommodation> hResults;
    ArrayList<Room> rooms;
    ArrayList<Room> rmResults;
    private Component frame;

    public TouristInformationCenter() {
        customers = new ArrayList<>();
        cResults = new ArrayList<>();
        hotels = new ArrayList<>();
        hResults = new ArrayList<>();
        rooms = new ArrayList<>();
        rmResults = new ArrayList<>();
    }

    /**
     * ***********ROOMS CODE**************
     */
    public void addRoom(Room room) {
        loadRoomArray();
        rooms.add(room);
        saveRoomsArray();
        printRoomsArray();
    }

    public void saveRoomsArray() {
        try {
            try (FileOutputStream fos = new FileOutputStream("rooms.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(rooms);
                oos.close();
                fos.close();
            }
            JOptionPane.showMessageDialog(frame,
             "Room has been added!");
            System.out.println("Rooms class saved message");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame,
             "There has been a problem, please try again!");
            System.out.println("Problem saving");
        }
    }

    public void loadRoomArray() {
        try {
            FileInputStream fis = new FileInputStream("rooms.dat");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                rooms = (ArrayList<Room>) ois.readObject();
                ois.close();
                fis.close();
                //printArray();
            }
            System.out.println("Rooms loaded!");

        } catch (IOException | ClassNotFoundException e) {
             JOptionPane.showMessageDialog(frame,
             "Problem loading rooms!");
            System.out.println("Problem reading object");
        }
    }

    public void printRoomsArray() {
        System.out.println("******* Hotel Array Contents ***********");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i).toString());
        }
    }
    /* THIS ALSO NEEDS TO BE ABLE TO RETURN ALL AVAILABILITY FOR ALL HOTELS*/

    public ArrayList<Room> searchForAvailabiltiy(String hName) {
        loadRoomArray();
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getHotelName().equals(hName)) {
                rmResults.add(rooms.get(i));
                System.out.println(rooms.get(i).toString());
            }
        }
        return rmResults;
    }

    /**
     * *********END ROOMS CODE******************
     */
    /**
     * **********CUSTOMER CODE***************
     */
    //load existing array items from file then add a new customer to the array, then save array to file and print array to screen
    public void addCustomer(Customer customer) {
        loadCustomerArray();
        customers.add(customer);
        saveCustomerArray();
        printCArray();
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
    public void printCArray() {
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
             "A new customer has been created!");
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

    /*ACCOMMODATION CODE*/
    public void addAccommodation(Accommodation accommodation) {
        loadHotelArray();
        hotels.add(accommodation);
        saveHArrayItems();
        printHArray();
    }

    /*Loads Array items then loops through to find matching
     customers. Adds new cust to results arraylist if lastname matches then prints resuts to screen
     using printResults method*/
    public ArrayList<Accommodation> searchForAccommodation(String name, String type) {
        loadHotelArray();
        if (type.matches("Empty")) {
            for (int i = 0; i < hotels.size(); i++) {
                if (hotels.get(i).getName().equals(name)) {
                    hResults.add(hotels.get(i));
                    return hResults;
                }
            }
        } else {
            for (int i = 0; i < hotels.size(); i++) {
                if (hotels.get(i).getType().equals(type)) {
                    hResults.add(hotels.get(i));
                }
            }
            //printHResults();
            //System.out.println("Type = " + type);
            return hResults;
        }
        return null;
    }

    //prints results of search to screen
    public void printHResults() {
        System.out.println("******* Search Results ***********");
        for (int i = 0; i < hResults.size(); i++) {
            System.out.println(hResults.get(i));
        }
    }

    //print hotels returned in araylist to screen
    public void printHArray() {
        System.out.println("******* Array Contents ***********");
        for (int i = 0; i < hotels.size(); i++) {
            System.out.println(hotels.get(i));
        }
    }

    //Save hotels in arrayl
    public void saveHArrayItems() {
        try {
            try (FileOutputStream fos = new FileOutputStream("hotels.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(hotels);
                oos.close();
                fos.close();
            }
            JOptionPane.showMessageDialog(frame,
             "A new hotel has been created!");
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
}
