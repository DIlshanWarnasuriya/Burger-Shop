
package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlaceOrder extends JFrame {

    private JPanel titPanel;    
    private JPanel detailPanel;
    private JPanel buttonPanal;

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

    private JTextField lblCustomerID;
    private JTextField lblCustomerName;
    private JTextField lblQuantity;

    private JButton btnSearch;
    private JButton btnPlaceOrder;
    private JButton btnBack;
    private JButton btnCancel;

    public PlaceOrder() {
        setSize(880, 550);
        setTitle("Burger Shop");
        setLocationRelativeTo(null);
        setBackground(Color.white);
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
        detailPanel.setBackground(Color.white);
        detailPanel.setBounds(0, 80, 550, 450);
        detailPanel.setLayout(null);

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

        lblCustomerID = new JTextField();
        lblCustomerID.setBounds(240, 120, 120, 30);
        lblCustomerID.setFont(new Font("", 1, 15));
        detailPanel.add(lblCustomerID);

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

        lblCustomerName = new JTextField();
        lblCustomerName.setBounds(240, 160, 200, 30);
        lblCustomerName.setFont(new Font("", 1, 15));
        detailPanel.add(lblCustomerName);

        // Quantity
        lblQty = new JLabel("Burger QTY :");
        lblQty.setBounds(100, 200, 130, 30);
        lblQty.setFont(new Font("", 1, 15));
        detailPanel.add(lblQty);

        lblQuantity = new JTextField();
        lblQuantity.setBounds(240, 200, 50, 30);
        lblQuantity.setFont(new Font("", 1, 15));
        detailPanel.add(lblQuantity);

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

        lblTital = new JLabel("2500.00");
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

        // Action Events
        btnPlaceOrder.addActionListener(evt -> {

        });

        btnSearch.addActionListener(evt -> {

        });

        btnCancel.addActionListener(evt -> {
            System.exit(0);
        });

        btnBack.addActionListener(evt -> {
            setVisible(false);
            new HomePage().setVisible(true);
        });

    }

}

