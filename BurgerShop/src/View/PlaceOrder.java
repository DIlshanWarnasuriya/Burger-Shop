
package View;

import Controllers.OrderController;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlaceOrder extends JFrame {

    private JPanel titPanel;    
    private JPanel detailPanel;
    private JPanel buttonPanal;
    private JPanel WarningMassge;

    private JLabel titleLable;
    private JLabel lblOID;
    private JLabel lblOrderId;
    private JLabel lblCID;
    private JLabel lblCName;
    private JLabel lblQty;
    private JLabel lblSta;
    private JLabel lblStatus;
    private JLabel Line;
    private JLabel lblTo;
    private JLabel lblTital;
   
    private JLabel worningLable;

    private JTextField txtCustomerID;
    private JTextField txtCustomerName;
    private JTextField txtQuantity;

    private JButton btnSearch;
    private JButton btnPlaceOrder;
    private JButton btnBack;
    private JButton btnCancel;
    private JButton calTotal;    
    

    public PlaceOrder() {
        setSize(880, 550);
        setTitle("Burger Shop");
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Image/burgerIcon.png")));
        setLayout(null);

        titPanel = new JPanel();
        titPanel.setBackground(new Color(193, 82, 77));
        titPanel.setBounds(0, 0, 880, 80);
        titPanel.setLayout(null);

        titleLable = new JLabel("Place Order");
        titleLable.setFont(new Font("", 1, 26));
        titleLable.setBounds(0, 0, 880, 80);
        titleLable.setForeground(Color.WHITE);
        titleLable.setHorizontalAlignment(JLabel.CENTER);

        titPanel.add(titleLable);
        add(titPanel);

        detailPanel = new JPanel();
        detailPanel.setBackground(Color.WHITE);
        detailPanel.setBounds(0, 80, 550, 450);
        detailPanel.setLayout(null);
        
        // Worning message 
        WarningMassge = new JPanel();        
        WarningMassge.setBounds(100, 30, 350, 25);   
        WarningMassge.setVisible(false);
        detailPanel.add(WarningMassge);        
        
        worningLable =  new JLabel();        
        worningLable.setHorizontalAlignment(JLabel.CENTER);
        worningLable.setForeground(Color.WHITE);
        WarningMassge.add(worningLable);    
        

        // Order id
        lblOID = new JLabel("Order Id:");
        lblOID.setBounds(100, 80, 100, 30);
        lblOID.setFont(new Font("", 1, 15));
        detailPanel.add(lblOID);

        lblOrderId = new JLabel("B0001");
        lblOrderId.setBounds(240, 80, 100, 30);
        lblOrderId.setFont(new Font("", 1, 15));
        detailPanel.add(lblOrderId);

        // Customer Id
        lblCID = new JLabel("Customer Id:");
        lblCID.setBounds(100, 120, 100, 30);
        lblCID.setFont(new Font("", 1, 15));
        detailPanel.add(lblCID);

        txtCustomerID = new JTextField();
        txtCustomerID.setBounds(240, 120, 120, 30);
        txtCustomerID.setFont(new Font("", 1, 15));
        detailPanel.add(txtCustomerID);      

        btnSearch = new JButton(new ImageIcon("src/Image/Search.png"));
        btnSearch.setBounds(380, 119, 30, 30);
        btnSearch.setFont(new Font("", 1, 15));
        btnSearch.setBackground(new Color(82, 150, 213));
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setFocusable(false);
        btnSearch.setBorder(null);
        btnSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
        detailPanel.add(btnSearch);

        // Customer Name
        lblCName = new JLabel("Customer Name :");
        lblCName.setBounds(100, 160, 130, 30);
        lblCName.setFont(new Font("", 1, 15));
        detailPanel.add(lblCName);

        txtCustomerName = new JTextField();
        txtCustomerName.setBounds(240, 160, 200, 30);
        txtCustomerName.setFont(new Font("", 1, 15));
        txtCustomerName.setEnabled(false);
        detailPanel.add(txtCustomerName);

        // Quantity
        lblQty = new JLabel("Burger QTY :");
        lblQty.setBounds(100, 200, 130, 30);
        lblQty.setFont(new Font("", 1, 15));
        detailPanel.add(lblQty);

        txtQuantity = new JTextField();
        txtQuantity.setBounds(240, 200, 50, 30);
        txtQuantity.setFont(new Font("", 1, 15));
        txtQuantity.setEnabled(false);
        detailPanel.add(txtQuantity);
        
        
        calTotal = new JButton("Calculate");
        calTotal.setBounds(310, 200, 100, 30);
        calTotal.setFont(new Font("", 1, 15));
        calTotal.setBackground(new Color(193, 82, 77));
        calTotal.setForeground(Color.WHITE);
        calTotal.setFocusable(false);
        calTotal.setBorder(null);
        calTotal.setCursor(new Cursor(Cursor.HAND_CURSOR));
        detailPanel.add(calTotal);

        // Status
        lblSta = new JLabel("Status :");
        lblSta.setBounds(100, 240, 130, 30);
        lblSta.setFont(new Font("", 1, 15));
        detailPanel.add(lblSta);

        lblStatus = new JLabel("Preparing...");
        lblStatus.setBounds(240, 240, 120, 30);
        lblStatus.setFont(new Font("", 1, 15));
        detailPanel.add(lblStatus);

        Line = new JLabel(
                "------------------------------------------------------------------------------------------------");
        Line.setBounds(90, 270, 400, 30);
        detailPanel.add(Line);

        // Total
        lblTo = new JLabel("NET Total   :");
        lblTo.setBounds(100, 300, 120, 30);
        lblTo.setFont(new Font("", 1, 15));
        detailPanel.add(lblTo);

        lblTital = new JLabel("0");
        lblTital.setBounds(240, 300, 120, 30);
        lblTital.setFont(new Font("", 1, 15));
        detailPanel.add(lblTital);

        add(detailPanel);

        buttonPanal = new JPanel();
        buttonPanal.setBackground(Color.WHITE);
        buttonPanal.setBounds(550, 80, 330, 450);
        buttonPanal.setLayout(null);

        btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setFont(new Font("", 1, 15));
        btnPlaceOrder.setBackground(new Color(79, 174, 76));
        btnPlaceOrder.setBounds(40, 100, 200, 40);
        btnPlaceOrder.setForeground(Color.WHITE);
        btnPlaceOrder.setFocusable(false);
        btnPlaceOrder.setBorder(null);
        btnPlaceOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanal.add(btnPlaceOrder);

        btnBack = new JButton("Back To Home");
        btnBack.setFont(new Font("", 1, 15));
        btnBack.setBackground(new Color(193, 82, 77));
        btnBack.setBounds(40, 180, 200, 40);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFocusable(false);
        btnBack.setBorder(null);
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanal.add(btnBack);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", 1, 15));
        btnCancel.setBackground(new Color(193, 82, 77));
        btnCancel.setBounds(40, 260, 200, 40);
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setFocusable(false);
        btnCancel.setBorder(null);
        btnCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanal.add(btnCancel);

        add(buttonPanal);        
        
        
        // ===================================== Actions ========================================
        
        // Set Order Order Id to order id lable
        if (OrderController.size() == 0) {
            lblOrderId.setText("B0001");
        }
        else{
            String LastId = OrderController.getLastId();
            String OrderId = OrderController.genarateId(LastId);
            lblOrderId.setText(OrderId);
        }       
        
        // Search Button Action Events
        btnSearch.addActionListener(evt -> {           
            WarningMassge.setVisible(false);
            
            if (!OrderController.validateCustomerId(txtCustomerID.getText())) {
                WarningMassge.setBackground(Color.red);
                worningLable.setText("Please Enter Valid Phone Number");   
                WarningMassge.setVisible(true);
            }
            else{
                WarningMassge.setVisible(false);             
                String CustomerName = OrderController.searchCustomerName(txtCustomerID.getText());
                if (!CustomerName.equals("null")) {
                    txtCustomerName.setText(CustomerName);
                    txtCustomerName.setEnabled(false);
                    txtQuantity.setEnabled(true);                               
                }
                else{
                    txtCustomerName.setEnabled(true);
                    txtQuantity.setEnabled(true);
                    txtQuantity.setText("");
                    txtCustomerName.setText("");
                }                
            }         
        });

        // calTotal Button Action Events
        calTotal.addActionListener(evt -> {        
            if (txtQuantity.getText().equals("")) {
                WarningMassge.setVisible(true);
                WarningMassge.setBackground(Color.red);
                worningLable.setText("Please fill all text fields");            
            }
            else{
                lblTital.setText(""+OrderController.CalculateTotal(txtQuantity.getText()));
            }
            
        });
        
        // Place Order Button Action Events
        btnPlaceOrder.addActionListener(evt -> {
            if (txtCustomerID.equals("") || txtCustomerName.getText().equals("") || txtQuantity.getText().equals("")) {        
                WarningMassge.setVisible(true);
                WarningMassge.setBackground(Color.red);
                worningLable.setText("Please fill all text fields");             
            }
            else{      
                // Add To list
                OrderController.addList(lblOrderId.getText(), txtCustomerID.getText(), txtCustomerName.getText(), txtQuantity.getText());
                
                WarningMassge.setVisible(true);
                WarningMassge.setBackground(new Color(79, 174, 76));
                worningLable.setText("Place Order Successful");  
                
                // Order Id 
                if (OrderController.size() == 0) {
                    lblOrderId.setText("B0001");
                }
                else{
                    String LastId = OrderController.getLastId();                    
                    String OrderId = OrderController.genarateId(LastId);
                    lblOrderId.setText(OrderId);
                }                    
                txtCustomerID.setText("");
                txtCustomerName.setText("");
                txtCustomerName.setEnabled(false);
                txtQuantity.setText("");
                txtQuantity.setEnabled(false);
                lblTital.setText("0");
                
            }
        });        

        //Cancel Button Action Events
        btnCancel.addActionListener(evt -> {
            System.exit(0);
        });
        
        //Back Button Action Events
        btnBack.addActionListener(evt -> {
            setVisible(false);
            new HomePage().setVisible(true);
        });
    }
}

       