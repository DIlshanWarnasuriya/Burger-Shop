
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

public class HomePage extends JFrame {

    private JPanel photoPanel;
    private JPanel buttonPanel;
    private JLabel titleLable;
    private JButton btnPlaceOrder;
    private JButton btnSearch;
    private JButton btnViewOrder;
    private JButton btnUpdateOrder;
    private JButton btnExit;

    public HomePage() {
        setSize(960, 600);
        setTitle("Burger Shop");
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Image/burgerIcon.png")));
        setLayout(null);

        photoPanel = new JPanel();
        photoPanel.setBackground(Color.WHITE);
        photoPanel.setBounds(0, 0, 400, 600);
        photoPanel.setLayout(null);

        titleLable = new JLabel("Welcome to Burgers");
        titleLable.setFont(new Font("", 1, 28));
        titleLable.setForeground(new Color(197, 162, 55));
        titleLable.setBounds(0, 50, 400, 35);
        titleLable.setHorizontalAlignment(JLabel.CENTER);
        photoPanel.add(titleLable);

        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(Color.WHITE);
        imagePanel.setBounds(50, 130, 300, 450);
        imagePanel.add(new JLabel(new ImageIcon("src/Image/home.jpg")));
        imagePanel.setBorder(null);
        photoPanel.add(imagePanel);
        add(photoPanel);

        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(216, 216, 216));
        buttonPanel.setBounds(400, 0, 560, 600);
        buttonPanel.setLayout(null);

        btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setFont(new Font("", 1, 17));
        btnPlaceOrder.setBackground(new Color(193, 82, 77));
        btnPlaceOrder.setBounds(150, 150, 250, 40);
        btnPlaceOrder.setForeground(Color.WHITE);
        btnPlaceOrder.setFocusable(false);
        btnPlaceOrder.setBorder(null);
        btnPlaceOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnPlaceOrder);

        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("", 1, 17));
        btnSearch.setBackground(new Color(193, 82, 77));
        btnSearch.setBounds(150, 220, 250, 40);
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setFocusable(false);
        btnSearch.setBorder(null);
        btnSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnSearch);

        btnViewOrder = new JButton("View Order");
        btnViewOrder.setFont(new Font("", 1, 17));
        btnViewOrder.setBackground(new Color(193, 82, 77));
        btnViewOrder.setBounds(150, 290, 250, 40);
        btnViewOrder.setForeground(Color.WHITE);
        btnViewOrder.setFocusable(false);
        btnViewOrder.setBorder(null);
        btnViewOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnViewOrder);

        btnUpdateOrder = new JButton("Update Order details");
        btnUpdateOrder.setFont(new Font("", 1, 17));
        btnUpdateOrder.setBackground(new Color(193, 82, 77));
        btnUpdateOrder.setBounds(150, 360, 250, 40);
        btnUpdateOrder.setForeground(Color.WHITE);
        btnUpdateOrder.setFocusable(false);
        btnUpdateOrder.setBorder(null);
        buttonPanel.add(btnUpdateOrder);

        btnExit = new JButton("Exit");
        btnExit.setFont(new Font("", 1, 17));
        btnExit.setBackground(new Color(193, 82, 77));
        btnExit.setBounds(420, 500, 100, 40);
        btnExit.setForeground(Color.WHITE);
        btnExit.setFocusable(false);
        btnExit.setBorder(null);
        btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnExit);

        add(buttonPanel);

        // Action Events
        btnExit.addActionListener(evt -> {
            System.exit(0);
        });

        btnPlaceOrder.addActionListener(evt -> {
            setVisible(false);
            new PlaceOrder().setVisible(true);

        });

        btnSearch.addActionListener(evt -> {
            setVisible(false);
            new Search().setVisible(true);
        });

        btnViewOrder.addActionListener(evt -> {
            setVisible(false);
            new ViewOrder().setVisible(true);
        });

        btnUpdateOrder.addActionListener(evt -> {
            setVisible(false);
            new UpdateOrderDetails().setVisible(true);
        });

    }

}