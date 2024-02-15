
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

public class Search extends JFrame {
    private JPanel photoPanel;
    private JPanel buttonPanel;
    private JPanel titPanel;

    private JLabel titleLable;
    private JLabel NewtitleLable;    

    private JButton btnSearchBest;
    private JButton btnSearchCustomer;
    private JButton btnSerchOrder;
    private JButton btnBack;

    public Search() {
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

        // tittle
        titPanel = new JPanel();
        titPanel.setBackground(new Color(193, 82, 77));
        titPanel.setBounds(400, 0, 560, 80);
        titPanel.setLayout(null);

        NewtitleLable = new JLabel("Search");
        NewtitleLable.setFont(new Font("", 1, 26));
        NewtitleLable.setBounds(0, 0, 560, 80);
        NewtitleLable.setForeground(Color.WHITE);
        NewtitleLable.setHorizontalAlignment(JLabel.CENTER);
        titPanel.add(NewtitleLable);
        add(titPanel);

        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(216, 216, 216));
        buttonPanel.setBounds(400, 80, 560, 500);
        buttonPanel.setLayout(null);

        btnSearchBest = new JButton("Search Best Customers");
        btnSearchBest.setFont(new Font("", 1, 17));
        btnSearchBest.setBackground(new Color(193, 82, 77));
        btnSearchBest.setBounds(150, 120, 250, 40);
        btnSearchBest.setForeground(Color.WHITE);
        btnSearchBest.setFocusable(false);
        btnSearchBest.setBorder(null);
        btnSearchBest.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnSearchBest);

        btnSearchCustomer = new JButton("Search Customers");
        btnSearchCustomer.setFont(new Font("", 1, 17));
        btnSearchCustomer.setBackground(new Color(193, 82, 77));
        btnSearchCustomer.setBounds(150, 190, 250, 40);
        btnSearchCustomer.setForeground(Color.WHITE);
        btnSearchCustomer.setFocusable(false);
        btnSearchCustomer.setBorder(null);
        btnSearchCustomer.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnSearchCustomer);

        btnSerchOrder = new JButton("Search Orders");
        btnSerchOrder.setFont(new Font("", 1, 17));
        btnSerchOrder.setBackground(new Color(193, 82, 77));
        btnSerchOrder.setBounds(150, 260, 250, 40);
        btnSerchOrder.setForeground(Color.WHITE);
        btnSerchOrder.setFocusable(false);
        btnSerchOrder.setBorder(null);
        btnSerchOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnSerchOrder);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("", 1, 17));
        btnBack.setBackground(new Color(193, 82, 77));
        btnBack.setBounds(420, 420, 100, 40);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFocusable(false);
        btnBack.setBorder(null);
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnBack);

        add(buttonPanel);

        btnSearchBest.addActionListener(evt -> {
            setVisible(false);
            new SearchBestCustomer().setVisible(true);
        });

        btnSerchOrder.addActionListener(evt -> {
            setVisible(false);
            new searchOrder().setVisible(true);
        });

        btnSearchCustomer.addActionListener(evt -> {
            //setVisible(false);
            //new SearchCustomer().setVisible(true);
        });       

        btnBack.addActionListener(evt -> {
            setVisible(false);
            new HomePage().setVisible(true);
        });
    }

}