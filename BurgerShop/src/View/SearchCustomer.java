
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SearchCustomer extends JFrame {
    private JPanel titPanel;
    private JPanel ssearchPanel;
    private JPanel detailPanel;
    private JPanel detailPanelH;
    private JPanel buttonPanal;
    private JPanel WarningMassge;
    private JPanel tablePanel;

    private JLabel titleLable;
    private JLabel lblCustomerId;
    
    private JLabel lblCName;
    private JLabel lblCustomerName;    
    private JLabel worningLable;

    private JTextField txtCustomerId;    

    private JButton btnSearch;
    private JButton btnBack; 
    
    private DefaultTableModel dtm;
    private JTable tblOrder;
    
    public SearchCustomer() {
        setSize(700, 580);
        setTitle("Burger Shop");
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Image/burgerIcon.png")));
        setLayout(null);

        // tittle
        titPanel = new JPanel();
        titPanel.setBackground(new Color(193, 82, 77));
        titPanel.setBounds(0, 0, 700, 80);
        titPanel.setLayout(null);

        titleLable = new JLabel("Search Customer");
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

        lblCustomerId = new JLabel("Enter Customer ID :");
        lblCustomerId.setFont(new Font("", 1, 15));
        lblCustomerId.setBounds(100, 40, 150, 50);
        ssearchPanel.add(lblCustomerId);

        txtCustomerId = new JTextField();
        txtCustomerId.setFont(new Font("", 1, 15));
        txtCustomerId.setBounds(245, 51, 120, 28);
        ssearchPanel.add(txtCustomerId);

        btnSearch = new JButton(new ImageIcon("src/Image/Search.png"));
        btnSearch.setBounds(380, 48, 30, 30);
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
        lblCName = new JLabel("Customer Name : ");
        lblCName.setFont(new Font("", 1, 15));
        lblCName.setBounds(100, 30, 150, 50);
        lblCName.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblCName);

        lblCustomerName = new JLabel();
        lblCustomerName.setFont(new Font("", 1, 15));
        lblCustomerName.setBounds(238, 30, 150, 50);
        detailPanel.add(lblCustomerName);
        
        tablePanel = new JPanel();
        tablePanel.setBackground(new Color(193, 82, 77));
        tablePanel.setBounds(100, 90, 480, 200);
        tablePanel.setBackground(Color.WHITE);
        tablePanel.setLayout(null);

        String[] Heding = { "Order ID", "Qty", "Total" };
        dtm = new DefaultTableModel(Heding, 0);
        tblOrder = new JTable(dtm);
        
        tblOrder.getTableHeader().setBackground(new Color(216, 216, 216));
        tblOrder.getTableHeader().setFont(new Font("", 1, 15));        
        tblOrder.setRowHeight(30);        
        tblOrder.setFont(new Font("", 1, 12));   

        JScrollPane scrollPane = new JScrollPane(tblOrder);
        scrollPane.setBounds(0, 0, 480, 190);

        tablePanel.add(scrollPane);
        detailPanel.add(tablePanel);

        
        // back Button
        buttonPanal = new JPanel();
        buttonPanal.setBackground(new Color(193, 82, 77));
        buttonPanal.setBounds(0, 480, 700, 70);
        buttonPanal.setBackground(Color.WHITE);
        buttonPanal.setLayout(null);
        
        

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
        
        btnBack.addActionListener(evt -> {
            setVisible(false);
            new Search().setVisible(true);
        });
        
        btnSearch.addActionListener(evt -> {
            
            int index = OrderController.searchCustomer(txtCustomerId.getText());
            
            if (txtCustomerId.getText().equals("")) {
                
                worningLable.setText("Plese Enter Customer Id");
                WarningMassge.setVisible(true); 
                WarningMassge.setBackground(Color.RED);
                detailPanel.setVisible(false);
                detailPanelH.setVisible(true);
            }       
            else if (index != -1)
            {		
                detailPanel.setVisible(true);
                detailPanelH.setVisible(false);
                
                Orders or = OrderController.searchFromCustomer(index);
                lblCustomerName.setText(or.getCustomerName());

                for (int i = 0; i < OrderController.size(); i++)	{
                    or = OrderController.searchFromCustomer(i);
                    if (or.getCustomerId().equals(txtCustomerId.getText()))
                    {	
                        Object[] data = {"                   "+or.getOrderId(),  "                       "+or.getQuantity(), "                  "+or.getValue()};
                        dtm.addRow(data);
                    }
                }
                worningLable.setText("Found Orders");
                WarningMassge.setVisible(true); 
                WarningMassge.setBackground(Color.GREEN);
            }
            else{
                worningLable.setText("This customer ID is not added yet..");
                WarningMassge.setVisible(true); 
                WarningMassge.setBackground(Color.RED);
                detailPanel.setVisible(false);
                detailPanelH.setVisible(true);
                			
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
