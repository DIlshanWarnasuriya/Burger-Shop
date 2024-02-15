package DB;

import Model.Orders;

public class OrderList{
    private Node first;

    public void add(Orders orders){
        Node n1 = new Node(orders);
        if (isEmpty()){
                first = n1;
        }
        else{
                Node temp = first;
                while (temp.next!=null){
                        temp=temp.next;
                }
                temp.next = n1;
        }		
    }
    public boolean isEmpty(){
        return first == null ? true : false;
    }
    //get Last Id
    public String getLastId(){
        Node temp = first;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.orders.getOrderId();
    }
    
    public void printList(){
        Node temp = first;
        while (temp!=null){
            System.out.println(temp.orders.getDetails());
            if (temp.orders.getOrderId().equals("B0001")) {
                System.out.println("yes");
            }
            
            temp = temp.next;
        }
    }	

    public String searchCustomerName(String id){        
        Node temp = first;		
        while (temp!=null){
            if (temp.orders.getCustomerId().equals(id)){                
                    return temp.orders.getCustomerName();
            }			
            temp = temp.next;
        }
        return "null";
    }
    //-------------------------------------------------------------------------------
    
    public Orders serchOrder(String id){
        Node temp = first;		
        while (temp!=null){
                if (temp.orders.getOrderId().equals(id)){
                        return temp.orders;
                }			
                temp = temp.next;
        }
        return null;
    }
    
    
    
    
    
    
    
    
    
    
    
    public Orders serchOrder(int i){
            int count = 0;
            Node temp = first;		
            while (temp!=null){
                    if (count == i){
                            return temp.orders;
                    }			
                    temp = temp.next;
                    count++;
            }
            return null;
    }

    public int size(){
            int count = 0;
            Node temp = first;
            while (temp!=null){
                    count++;
                    temp = temp.next;
            }
            return count;
    }
    public int searchCustomer(String id){
            int count = 0;
            Node temp = first;		
            while (temp!=null){
                    if (temp.orders.getCustomerId().equals(id)){
                            return count;
                    }			
                    count++;
                    temp = temp.next;
            }
            return -1;
    }

    public Orders searchFromCustomer(int i){
            int count = 0;
            Node temp = first;		
            while (temp!=null){
                    if (count == i){
                            return temp.orders;
                    }			
                    temp = temp.next;
                    count++;
            }
            return null;
    }

    public Orders[] toArray(){
            Orders[] or = new Orders[size()];
            Node temp = first;
            int i = 0;
            while (temp!=null)
            {
                    or[i++] = temp.orders;
                    temp = temp.next;
            }
            return or;
    }

    // inner class
    class Node{
            private Orders orders;
            private Node next;
            Node(Orders orders){
                    this.orders = orders;
            }
    }
}
