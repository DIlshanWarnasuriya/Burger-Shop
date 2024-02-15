
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

public class searchOrder extends JFrame {
    private JPanel titPanel;
    private JPanel ssearchPanel;
    private JPanel detailPanel;
    private JPanel buttonPanal;

    private JLabel titleLable;
    private JLabel lblOrderId;
    private JLabel lblCID;
    private JLabel lblCustomerId;
    private JLabel lblCName;
    private JLabel lblCustomerName;
    private JLabel lblQty;
    private JLabel lblQuantity;
    private JLabel lblTot;
    private JLabel lblTotal;
    private JLabel lblStatus;
    private JLabel lblSta;

    private JTextField txtOrderId;

    private JButton btnSearch;
    private JButton btnBack;

    public searchOrder() {
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

        titleLable = new JLabel("Search Order Details");
        titleLable.setFont(new Font("", 1, 26));
        titleLable.setBounds(0, 0, 700, 80);
        titleLable.setForeground(Color.WHITE);
        titleLable.setHorizontalAlignment(JLabel.CENTER);
        titPanel.add(titleLable);
        add(titPanel);

        // search Panel
        ssearchPanel = new JPanel();
        ssearchPanel.setBackground(new Color(193, 82, 77));
        ssearchPanel.setBounds(0, 80, 880, 100);
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

        // Detail Panel
        detailPanel = new JPanel();
        detailPanel.setBackground(new Color(193, 82, 77));
        detailPanel.setBounds(0, 180, 880, 300);
        detailPanel.setLayout(null);
        detailPanel.setBackground(Color.WHITE);
        add(detailPanel);

        // customer Id lables
        lblCID = new JLabel("Customer ID : ");
        lblCID.setFont(new Font("", 1, 15));
        lblCID.setBounds(100, 30, 150, 50);
        lblCID.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblCID);

        lblCustomerId = new JLabel("0786786767");
        lblCustomerId.setFont(new Font("", 1, 15));
        lblCustomerId.setBounds(210, 30, 150, 50);
        detailPanel.add(lblCustomerId);

        // customer Name lables
        lblCName = new JLabel("Customer Name : ");
        lblCName.setFont(new Font("", 1, 15));
        lblCName.setBounds(100, 70, 150, 50);
        lblCName.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblCName);

        lblCustomerName = new JLabel("Kamal Priyantha");
        lblCustomerName.setFont(new Font("", 1, 15));
        lblCustomerName.setBounds(238, 70, 150, 50);
        detailPanel.add(lblCustomerName);

        // Quantity lables
        lblQty = new JLabel("Quantity : ");
        lblQty.setFont(new Font("", 1, 15));
        lblQty.setBounds(100, 110, 150, 50);
        lblQty.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblQty);

        lblQuantity = new JLabel("12");
        lblQuantity.setFont(new Font("", 1, 15));
        lblQuantity.setBounds(180, 110, 150, 50);
        detailPanel.add(lblQuantity);

        // Total lables
        lblTot = new JLabel("Total : ");
        lblTot.setFont(new Font("", 1, 15));
        lblTot.setBounds(100, 150, 150, 50);
        lblTot.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblTot);

        lblTotal = new JLabel("12000.00");
        lblTotal.setFont(new Font("", 1, 15));
        lblTotal.setBounds(155, 150, 150, 50);
        detailPanel.add(lblTotal);

        // Status lables
        lblStatus = new JLabel("Order Status : ");
        lblStatus.setFont(new Font("", 1, 15));
        lblStatus.setBounds(100, 190, 150, 50);
        lblStatus.setForeground(new Color(193, 82, 77));
        detailPanel.add(lblStatus);

        lblSta = new JLabel("Preparing....");
        lblSta.setFont(new Font("", 1, 15));
        lblSta.setBounds(210, 190, 150, 50);
        detailPanel.add(lblSta);

        // back Button
        buttonPanal = new JPanel();
        buttonPanal.setBackground(new Color(193, 82, 77));
        buttonPanal.setBounds(0, 480, 880, 70);
        buttonPanal.setBackground(Color.WHITE);
        buttonPanal.setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("", 1, 17));
        btnBack.setBackground(new Color(193, 82, 77));
        btnBack.setBounds(100, 0, 80, 33);
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

        });
    }
}
