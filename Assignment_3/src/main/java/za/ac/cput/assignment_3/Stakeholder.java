/**
 *Stakeholder.java
 * This is my Stakeholder Class
 * @author Tshegofatso Molefe {219001235}
 * Date: 06 June 2021
 */
package za.ac.cput.assignment_3;

import java.io.Serializable;


public class Stakeholder implements Serializable{
    private String stHolderId;

    public Stakeholder() {
    }
    
    public Stakeholder(String stHolderId) {
        this.stHolderId = stHolderId;
    }
    
    public String getStHolderId() {
        return stHolderId;
    }

    public void setStHolderId(String stHolderId) {
        this.stHolderId = stHolderId;
    }

    @Override
    public String toString() {
       return stHolderId;
    }

}