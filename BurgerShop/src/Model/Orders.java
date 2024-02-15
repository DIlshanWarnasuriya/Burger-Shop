
package Model;

public class Orders {
    private String orderId;
    private String customerId;
    private String customerName;
    private int quantity;
    private int status;
    private double value;

    public Orders(String orderId, String customerId, String customerName, int quantity, int status, double value) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.quantity = quantity;
        this.status = status;
        this.value = value;
    }

    public Orders(String customerId, String customerName, double value) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.value = value;
    }
    
    public Orders() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDetails(){
	return orderId + ", " + customerId + ", " + customerName + ", " + quantity + ", " + value;
    }	
    
    
}
