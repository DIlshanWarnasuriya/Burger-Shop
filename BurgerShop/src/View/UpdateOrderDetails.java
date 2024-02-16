
package View;

import Controllers.OrderController;
import Model.Orders;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateOrderDetails extends JFrame{
    private JPanel titPanel;
    private JPanel ssearchPanel;
    private JPanel detailPanel;
    private JPanel detailPanelH;
    private JPanel buttonPanal;
    private JPanel WarningMassge;

    private JLabel titleLable;
    private JLabel lblOrderId;
    private JLabel lblCID;
    private JLabel lblCustomerId;
    private JLabel lblCName;
    private JLabel lblCustomerName;
    private JLabel lblQty;    
    private JLabel lblTot;
    private JLabel lblTotal;
    private JLabel lblStatus;
    private JLabel worningLable;

    private JTextField txtOrderId;
    private JTextField txtQty;

    private JButton btnSearch;
    private JButton btnBack;
    private JButton btnUpdateOrder;

    private JMenuBar statusBar;
    private JMenu statusMenu;
    private JMenuItem Delivered;
    private JMenuItem Processing;
    private JMenuItem Canceled;
    
    private Orders or;

    int quantuty = 0;
    
    public UpdateOrderDetails() {
        setSize(700, 580);
        setTitle("Burger Shop");
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Image/burgerIcon.png")));
        setLayout(null);

        // tittle
        titPanel = new JPanel();
        titPanel.setBackground(new Color(193, 82, 77));
        titPanel.setBounds(0, 0, 700, 80);
        titPanel.setLayout(null);

        titleLable = new JLabel("Update Order Details");
        titleLable.setFont(new Font("", 1, 26));
        titleLable.setBounds(0, 0, 700, 80);
        titleLable.setForeground(Color.WHITE);
        titleLable.setHorizontalAlignment(JLabel.CENTER);
        titPanel.add(titleLable);
        add(titPanel);

        // search Panel
        ssearchPanel = new JPanel();
        ssearchPanel.setBackground(new Color(193, 82, 77));
        ssearchPanel.setBounds(0, 80, 880, 130);
        ssearchPanel.setLayout(null);
        ssearchPanel.setBackground(Color.WHITE);
        add(ssearchPanel);

        lblOrderId = new JLabel("Enter Order ID :");
        lblOrderId.setFont(new Font("", 1, 15));
        lblOrderId.setBounds(100, 40, 150, 50);
        ssearchPanel.add(lblOrderId);

        txtOrderId = new JTextField();
        txtOrderId.setFont(new Font("", 1, 15));
        txtOrderId.setBounds(230, 51, 120, 28);
        ssearchPanel.add(txtOrderId);

        btnSearch = new JButton(new ImageIcon("src/Image/Search.png"));
        btnSearch.setBounds(365, 48, 30, 30);
        btnSearch.setFont(new Font("", 1, 15));
        btnSearch.setBackground(new Color(82, 150, 213));
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setFocusable(false);
        btnSearch.setBorder(null);
        btnSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ssearchPanel.add(btnSearch);
        
        
         // Worning message 
        WarningMassge = new JPanel();        
        WarningMassge.setBounds(100, 100, 470, 25);   
        WarningMassge.setVisible(false);        
        ssearchPanel.add(WarningMassge);        
        
        worningLable =  new JLabel();            
        worningLable.setHorizontalAlignment(JLabel.CENTER);
        worningLable.setForeground(Color.WHITE);          
        WarningMassge.add(worningLable);            

        // Detail Panel
        detailPanel = new JPanel();
        detailPanel.setBackground(new Color(193, 82, 77));
        detailPanel.setBounds(0, 180, 880, 300);
        detailPanel.setLayout(null);
        detailPanel.setVisible(false);
        detailPanel.setBackground(Color.WHITE);
        add(detailPanel);
        
        // Hide Detail Panel
        detailPanelH = new JPanel();
        detailPanelH.setBackground(new Color(193, 82, 77));
        detailPanelH.setBounds(0, 180, 880, 300);
        detailPanelH.setLayout(null);
        detailPanelH.setVisible(true);
        detailPanelH.setBackground(Color.WHITE);
        add(detailPanelH);

        // customer Id lables
        lblCID = new JLabel("Customer ID        : ");
        lblCID.setFont(new Font("", 1, 15));
        lblCID.setBounds(100, 30, 150, 50);
        lblCID.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblCID);

        lblCustomerId = new JLabel();
        lblCustomerId.setFont(new Font("", 1, 15));
        lblCustomerId.setBounds(238, 30, 150, 50);
        detailPanel.add(lblCustomerId);

        // customer Name lables
        lblCName = new JLabel("Customer Name : ");
        lblCName.setFont(new Font("", 1, 15));
        lblCName.setBounds(100, 70, 150, 50);
        lblCName.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblCName);

        lblCustomerName = new JLabel();
        lblCustomerName.setFont(new Font("", 1, 15));
        lblCustomerName.setBounds(238, 70, 150, 50);
        detailPanel.add(lblCustomerName);

        // Quantity lables
        lblQty = new JLabel("Quantity               : ");
        lblQty.setFont(new Font("", 1, 15));
        lblQty.setBounds(100, 110, 150, 50);
        lblQty.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblQty);

        txtQty = new JTextField();
        txtQty.setFont(new Font("", 1, 15));
        txtQty.setBounds(238, 122, 50, 30);
        detailPanel.add(txtQty);

        // Total lables
        lblTot = new JLabel("Total                     : ");
        lblTot.setFont(new Font("", 1, 15));
        lblTot.setBounds(100, 150, 150, 50);
        lblTot.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblTot);

        lblTotal = new JLabel();
        lblTotal.setFont(new Font("", 1, 15));
        lblTotal.setBounds(238, 150, 150, 50);
        detailPanel.add(lblTotal);

        // Status lables
        lblStatus = new JLabel("Order Status       : ");
        lblStatus.setFont(new Font("", 1, 15));
        lblStatus.setBounds(100, 190, 150, 50);
        lblStatus.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblStatus);

        statusBar = new JMenuBar();
        statusBar.setFont(new Font("", 1, 15));
        statusBar.setBounds(238, 200, 140, 30);   

        statusMenu = new JMenu("Select Status             v");    
        statusMenu.setBounds(0, 0, 120, 30);            

        Delivered = new JMenuItem("Delivered");
        statusMenu.add(Delivered);
        Processing = new JMenuItem("Processing");
        statusMenu.add(Processing);
        Canceled = new JMenuItem("Canceled");
        statusMenu.add(Canceled);

        statusBar.add(statusMenu);
        detailPanel.add(statusBar); 


        // back Button
        buttonPanal = new JPanel();
        buttonPanal.setBackground(new Color(193, 82, 77));
        buttonPanal.setBounds(0, 480, 700, 70);
        buttonPanal.setBackground(Color.WHITE);
        buttonPanal.setLayout(null);
        
        btnUpdateOrder = new JButton("Update Order");
        btnUpdateOrder.setFont(new Font("", 1, 17));
        btnUpdateOrder.setBackground(new Color(79, 174, 76));
        btnUpdateOrder.setBounds(400, 0, 150, 33);
        btnUpdateOrder.setFocusable(false);
        btnUpdateOrder.setBorder(null);
        btnUpdateOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnUpdateOrder.setForeground(Color.WHITE);
        btnUpdateOrder.setFocusable(false);
        btnUpdateOrder.setBorder(null);
        btnUpdateOrder.setVisible(false);
        buttonPanal.add(btnUpdateOrder);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("", 1, 17));
        btnBack.setBackground(new Color(193, 82, 77));
        btnBack.setBounds(570, 0, 80, 33);
        btnBack.setFocusable(false);
        btnBack.setBorder(null);
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBack.setForeground(Color.WHITE);
        btnBack.setFocusable(false);
        btnBack.setBorder(null);
        buttonPanal.add(btnBack);

        add(buttonPanal);

        // Action Events

        Delivered.addActionListener(evt -> {
            statusMenu.setText("Delivered                   v");            
        });

        Processing.addActionListener(evt -> {
            statusMenu.setText("Processing                v");            
        });

        Canceled.addActionListener(evt -> {
            statusMenu.setText("Canceled                   v");            
        });

        btnBack.addActionListener(evt -> {
            setVisible(false);
            new HomePage().setVisible(true);
        });

        
        
        btnSearch.addActionListener(evt -> {
            if (txtOrderId.getText().equals("")){
                worningLable.setText("Plese Enter Order ID");
                WarningMassge.setBackground(Color.RED);
                WarningMassge.setVisible(true); 
                detailPanelH.setVisible(true);
                detailPanel.setVisible(false);
            }
            else{                
                or = OrderController.serchOrder(txtOrderId.getText());	
                
                if (or == null) {
                    worningLable.setText("Order Not Found. Wrong Order ID!");
                    WarningMassge.setBackground(Color.RED);
                    WarningMassge.setVisible(true);   
                    detailPanelH.setVisible(true);
                    detailPanel.setVisible(false);
                    btnUpdateOrder.setVisible(false);
                    txtOrderId.setText("");
                }
                else{               
                    if (or.getStatus()== 1) {
                        worningLable.setText("This Order Is Deleverd");
                        WarningMassge.setBackground(Color.RED);
                        WarningMassge.setVisible(true); 
                        detailPanelH.setVisible(true);
                        detailPanel.setVisible(false);
                        btnUpdateOrder.setVisible(false);
                        txtOrderId.setText("");
                    }
                    else if(or.getStatus()== 2){
                        worningLable.setText("This Order Is Canceled");
                        WarningMassge.setBackground(Color.RED);
                        WarningMassge.setVisible(true);  
                        detailPanelH.setVisible(true);
                        detailPanel.setVisible(false);
                        btnUpdateOrder.setVisible(false);
                        txtOrderId.setText("");
                    }
                    else{
                        worningLable.setText("Found Order Details");
                        WarningMassge.setBackground(Color.GREEN);
                        WarningMassge.setVisible(true); 
                        detailPanelH.setVisible(false);
                        detailPanel.setVisible(true);
                        
                        lblCustomerId.setText(or.getCustomerId());
                        lblCustomerName.setText(or.getCustomerName());
                        txtQty.setText(""+or.getQuantity());
                        lblTotal.setText(""+or.getValue());
                        statusMenu.setText("Processing                v");  
                        
                        quantuty = or.getQuantity();
                        btnUpdateOrder.setVisible(true);                        
                    }              
                }
            }
        });        
        
        btnUpdateOrder.addActionListener(evt ->{      
            if(txtQty.getText().equals("0") || txtQty.getText().equals("")){
                worningLable.setText("Can't Update Quantity is null");
                WarningMassge.setBackground(Color.RED);
                WarningMassge.setVisible(true); 
            }
            else if (quantuty == Integer.parseInt(txtQty.getText()) && statusMenu.getText().equals("Processing                v")) {
                worningLable.setText("No any Changes");
                WarningMassge.setBackground(Color.RED);
                WarningMassge.setVisible(true);    
            }      
            else{       
                // update Order Details
                OrderController.UpdateOrder(or, txtQty.getText(), statusMenu.getText());   
                
                if (statusMenu.getText().equals("Delivered                   v")) {
                    worningLable.setText("Update Successful. Now Order Is Delivered");
                    WarningMassge.setBackground(Color.GREEN);
                    detailPanelH.setVisible(true);
                    detailPanel.setVisible(false);
                }
                else if (statusMenu.getText().equals("Canceled                   v")) {
                    worningLable.setText("Update Successful. Now Order Is Canceled");
                    WarningMassge.setBackground(Color.GREEN);
                    detailPanelH.setVisible(true);
                    detailPanel.setVisible(false);
                }
                else{
                    worningLable.setText("Update Successful");
                    WarningMassge.setBackground(Color.GREEN);   
                    detailPanelH.setVisible(true);
                    detailPanel.setVisible(false);
                }
            }
        });
    }

}
