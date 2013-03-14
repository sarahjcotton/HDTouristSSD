/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;

import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class MainTourist {

    public static void main(String[] args) {
        // TODO code application logic here

        TouristInformationCenter tourist = new TouristInformationCenter();

        String first = "Sarah ";
        String last = "Cotton";
        String search = "Horrocks";
        
        //create new instance of customer 
        Customer customer = new Customer(first, last);

        //send customer to tourist addcustomer method      
        // tourist.addCustomer(customer);
        //print customer to screen
        //System.out.println("Main output: " +customer);
        //tourist.loadArrayItems();
        tourist.printCArray();
        // ArrayList<Customer> customersFound = tourist.searchForCustomer(search);
        tourist.searchForCustomer(search); 
        
        // tourist.printResults();
    }
}
