/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package touristinformationcenter;
/**
 *
 * @author Sarah
 */
public class Customer implements java.io.Serializable{

    private String firstname;
    private String surname; 
    private String address1;
    private String address2;
    private String postcode;
    private String phone;

    public Customer(String f, String s, String ad1, String ad2, String p, String t) {
        firstname = f;
        surname = s; 
        address1 = ad1;
        address2 = ad2;
        postcode = p;
        phone = t;
    }

    @Override
    public String toString() {
        return firstname + " " + surname +", "+ address1+", "+address2+", "+postcode+", "+phone;
    }

    public String getFirst() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }
    
    public String getAdd1() {
        return address1;
    }
    
    public String getAdd2() {
        return address2;
    }
    
    public String getPostcode() {
        return postcode;
    }
    
    public String getPhone() {
        return phone;
    }
}
