
package Controllers;

import DB.OrderList;
import Model.Orders;

public class OrderController {
    final static double BURGERPRICE = 500;	
    public static final int PREPARING=0;
    public static final int DELIVERED=1;
    public static final int CANCEL=2;	

    public static OrderList ol = new OrderList();

    //Size of List
    public static int size(){
        return ol.size(); 
    }
    // get Last Id
    public static String getLastId(){
        return ol.getLastId();
    }    
    // Genarate Order ID
    public static String genarateId(String lastId){	
        int lastDogit = Integer.parseInt(lastId.substring(1));        
        return String.format("B%04d", lastDogit + 1);		
    }
    // Customer Id(Phone number) Validation
    public static boolean validateCustomerId(String id){
        boolean isvalid = false;
        if (id.length() == 10){
                if (id.charAt(0) == '0'){
                        isvalid = true;
                }
        }
        return isvalid;
    }    
    // Search customersname 
    public static String searchCustomerName(String CID){				
            return ol.searchCustomerName(CID);			
    }    
    // add Order to list
    public static void addList(String OID, String CID, String CName, String Quantity){
        int qty = Integer.parseInt(Quantity);      
        int status = PREPARING;        
        ol.add(new Orders(OID, CID, CName, qty, status, CalculateTotal(Quantity)));
    }
    // calculate Total
    public static double CalculateTotal(String Quantity){
        int qty = Integer.parseInt(Quantity); 
        return BURGERPRICE * qty;
    }    
    public static void prinOrdertList(){
        ol.printList();
    }
    
    //search order
    public static Orders serchOrder(String id){
            return ol.serchOrder(id);
    }
    
    
    
    
}