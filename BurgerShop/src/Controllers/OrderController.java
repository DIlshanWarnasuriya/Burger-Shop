
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
    
    //search order using given Id
    public static Orders serchOrder(String id){
            return ol.serchOrder(id);
    }
    
    public static boolean serchOrderId(String id){
            return ol.serchOrderId(id);
    }
    
    //search order using index using for View Orders
    public static Orders serchOrder(int i){
            return ol.serchOrder(i);
    }
    
    // update Order Details
    public static void UpdateOrder(Orders or, String qty, String Nowstatus){
        int status = PREPARING;
        double total = BURGERPRICE * Integer.parseInt(qty);
        if (Nowstatus.equals("Delivered                   v")) {
             status = DELIVERED;
        }
        else if (Nowstatus.equals("Canceled                   v")) {
            status = CANCEL;
            total = 0;
        }        
        or.setStatus(status);
        or.setQuantity(Integer.parseInt(qty));
        or.setValue(total);
    }
    
    
    // search best customers
    public static Orders[] getBestCustomerArray(){
        // best Customer Array
        Orders[] bc = new Orders[0]; 

        Orders[] or = ol.toArray();
    
        for (int i = 0; i < size(); i++){			
            int index = IsDuplicate(bc, or[i].getCustomerId()); //check Duplicates
            
            if (index != -1){
                Orders dpOrder = bc[index];
                double value = dpOrder.getValue() + or[i].getValue();
                dpOrder.setValue(value);
            }
            else{
                Orders[] tempbc = new Orders[bc.length+1];

                for (int j = 0; j < bc.length; j++){
                    tempbc[j] = bc[j];
                }				

                tempbc[tempbc.length-1] = new Orders(or[i].getCustomerId(), or[i].getCustomerName(), or[i].getValue());				
                bc = tempbc;
            }	

            // bubblee sort useing for sort Totals
            for (int j = bc.length-1; j > 0; j--){
                for (int z = 0; z < j; z++){
                    if (bc[z].getValue() > bc[z+1].getValue()){
                        Orders t = bc[z];
                        bc[z] = bc[z+1];
                        bc[z+1] = t;						
                    }				
                }
            }							
        }
        return bc;
    }    
    // isduplicate 
    public static int IsDuplicate(Orders[] bc, String id){
        for (int i = 0; i < bc.length; i++){			
            if (bc[i].getCustomerId().equals(id)){
                    return i;
            }
        }
        return -1;
    }	
    
    // serch Customer using id and get index of list
    public static int searchCustomer(String id){
        return ol.searchCustomer(id);
    }

    // search order using index
    public static Orders searchFromCustomer(int i){
        return ol.searchFromCustomer(i);
    }
    
    
    
    
    
    
}
