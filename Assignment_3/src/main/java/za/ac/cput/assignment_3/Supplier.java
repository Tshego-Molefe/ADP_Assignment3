/*
*  Supplier.java
 * This is my Supplier Class
 * @author Tshegofatso Molefe {219001235}
 * Date: 06 June 2021
*/
package za.ac.cput.assignment_3;

public class Supplier extends Stakeholder{
    private String name;
    private String productType;
    private String productDescription;

    public Supplier() {
        super();
    }

    public Supplier(String stHolderId, String name, String productType, String productDescription ) {
        super(stHolderId);
        this.name = name;
        this.productType = productType;
        this.productDescription = productDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return String.format("%-5s\t%-20s\t%-10s\t%-15s",super.toString(), getName(),getProductType(), getProductDescription());
    }

   
    
}
