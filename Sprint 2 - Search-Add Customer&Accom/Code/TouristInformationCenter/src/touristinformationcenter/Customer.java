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

    public Customer(String f, String s) {
        firstname = f;
        surname = s;    
    }

    @Override
    public String toString() {
        return firstname + " " + surname;
    }

    public String getFirst() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }
}
