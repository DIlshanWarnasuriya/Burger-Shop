
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

public class ViewOrder extends JFrame {
    private JPanel photoPanel;
    private JPanel buttonPanel;
    private JPanel titPanel;

    private JLabel titleLable;
    private JLabel NewtitleLable;

    private JButton btnDeliverdOrder;
    private JButton btnProccessingOrder;
    private JButton btnCanceledOrder;
    private JButton btnBack;

    public ViewOrder() {
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

        NewtitleLable = new JLabel("View Order");
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

        btnDeliverdOrder = new JButton("Delivered Orders");
        btnDeliverdOrder.setFont(new Font("", 1, 17));
        btnDeliverdOrder.setBackground(new Color(193, 82, 77));
        btnDeliverdOrder.setBounds(150, 120, 250, 40);
        btnDeliverdOrder.setForeground(Color.WHITE);
        btnDeliverdOrder.setFocusable(false);
        btnDeliverdOrder.setBorder(null);
        btnDeliverdOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnDeliverdOrder);

        btnProccessingOrder = new JButton("Proccessing Orders");
        btnProccessingOrder.setFont(new Font("", 1, 17));
        btnProccessingOrder.setBackground(new Color(193, 82, 77));
        btnProccessingOrder.setBounds(150, 190, 250, 40);
        btnProccessingOrder.setForeground(Color.WHITE);
        btnProccessingOrder.setFocusable(false);
        btnProccessingOrder.setBorder(null);
        btnProccessingOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnProccessingOrder);

        btnCanceledOrder = new JButton("Canceled Orders");
        btnCanceledOrder.setFont(new Font("", 1, 17));
        btnCanceledOrder.setBackground(new Color(193, 82, 77));
        btnCanceledOrder.setBounds(150, 260, 250, 40);
        btnCanceledOrder.setForeground(Color.WHITE);
        btnCanceledOrder.setFocusable(false);
        btnCanceledOrder.setBorder(null);
        btnCanceledOrder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonPanel.add(btnCanceledOrder);

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

        // Action Events    

        btnDeliverdOrder.addActionListener(evt -> {
            setVisible(false);
            new DeliveredOrders().setVisible(true);
        });

        btnProccessingOrder.addActionListener(evt -> {
            setVisible(false);
            new ProcessingOrders().setVisible(true);
        });

        btnCanceledOrder.addActionListener(evt -> {
            setVisible(false);
            new CanceledOrders().setVisible(true);
        });

        btnBack.addActionListener(evt -> {
            setVisible(false);
            new HomePage().setVisible(true);
        });

    }

}
