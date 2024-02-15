
package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeliveredOrders extends JFrame {
    private JPanel titPanel;    
    private JPanel tablePanel;
    private JPanel buttonPanal;

    private JLabel titleLable;
    
    private DefaultTableModel dtm;
    private JTable lblDeliveredOrdersTable;

    private JButton btnBack;

    public DeliveredOrders() {
        setSize(880, 600);
        setTitle("Burger Shop");
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Image/burgerIcon.png")));
        setLayout(null);

        // tittle
        titPanel = new JPanel();
        titPanel.setBackground(new Color(193, 82, 77));
        titPanel.setBounds(0, 0, 880, 80);
        titPanel.setLayout(null);

        titleLable = new JLabel("Delivered Orders");
        titleLable.setFont(new Font("", 1, 26));
        titleLable.setBounds(0, 0, 880, 80);
        titleLable.setForeground(Color.WHITE);
        titleLable.setHorizontalAlignment(JLabel.CENTER);
        titPanel.add(titleLable);
        add(titPanel);

        tablePanel = new JPanel();
        tablePanel.setBackground(new Color(193, 82, 77));
        tablePanel.setBounds(110, 110, 650, 350);
        tablePanel.setBackground(Color.WHITE);
        tablePanel.setLayout(null);

        // Table
        String[] Heding = { "Order ID", "Customer ID", "Name", "Qty", "Total" };
        dtm = new DefaultTableModel(Heding, 0);
        lblDeliveredOrdersTable = new JTable(dtm);

        JScrollPane scrollPane = new JScrollPane(lblDeliveredOrdersTable);
        scrollPane.setBounds(0, 0, 650, 350);

        tablePanel.add(scrollPane);

        add(tablePanel);

        // bAck Button
        buttonPanal = new JPanel();
        buttonPanal.setBackground(new Color(193, 82, 77));
        buttonPanal.setBounds(740, 500, 100, 40);
        buttonPanal.setBackground(Color.BLUE);
        buttonPanal.setLayout(null);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("", 1, 17));
        btnBack.setBackground(new Color(193, 82, 77));
        btnBack.setBounds(0, 0, 100, 40);
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
            new ViewOrder().setVisible(true);
        });

    }
}
