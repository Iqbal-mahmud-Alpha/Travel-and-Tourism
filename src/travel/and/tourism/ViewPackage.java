package travel.and.tourism;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPackage extends JFrame {

    private JPanel contentPane;
    Choice c1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewPackage frame = new ViewPackage("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ViewPackage(String username) {
        setBounds(580, 220, 1000, 600);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/bookedDetails.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(550, 40, 350, 350);
        add(la1);

        JLabel lblName = new JLabel("VIEW PACKAGE DETAILS");
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName.setBounds(88, 0, 350, 53);
        contentPane.add(lblName);

        JLabel lb3 = new JLabel("Username :");
        lb3.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lb3.setBounds(35, 70, 200, 25);
        contentPane.add(lb3);

        JLabel l1 = new JLabel();
        l1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l1.setBounds(271, 70, 250, 25);
        contentPane.add(l1);

        JLabel lblId = new JLabel("Package :");
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblId.setBounds(35, 120, 200, 25);
        contentPane.add(lblId);

        JLabel l2 = new JLabel();
        l2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l2.setBounds(271, 120, 200, 25);
        contentPane.add(l2);

        JLabel lb2 = new JLabel("Number of Persons :");
        lb2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lb2.setBounds(35, 160, 250, 25);
        contentPane.add(lb2);

        JLabel l3 = new JLabel();
        l3.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l3.setBounds(271, 160, 200, 25);
        contentPane.add(l3);

        JLabel lblName_1 = new JLabel("ID :");
        lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblName_1.setBounds(35, 200, 200, 25);
        contentPane.add(lblName_1);

        JLabel l4 = new JLabel();
        l4.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l4.setBounds(271, 200, 200, 25);
        contentPane.add(l4);

        JLabel lblGender = new JLabel("Number :");
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblGender.setBounds(35, 240, 200, 25);
        contentPane.add(lblGender);

        JLabel l5 = new JLabel();
        l5.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l5.setBounds(271, 240, 200, 25);
        contentPane.add(l5);

        JLabel lblCountry = new JLabel("Phone :");
        lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblCountry.setBounds(35, 280, 200, 25);
        contentPane.add(lblCountry);

        JLabel l6 = new JLabel();
        l6.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l6.setBounds(271, 280, 200, 25);
        contentPane.add(l6);

        JLabel lblReserveRoomNumber = new JLabel("Price :");
        lblReserveRoomNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblReserveRoomNumber.setBounds(35, 320, 200, 25);
        contentPane.add(lblReserveRoomNumber);

        JLabel l7 = new JLabel();
        l7.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l7.setBounds(271, 320, 200, 20);
        contentPane.add(l7);

        Myconnection c = new Myconnection();
        try {

            ResultSet rs = c.s.executeQuery("select * from bookpackage where username = '" + username + "'");
            while (rs.next()) {
                l1.setText(rs.getString(1));
                l2.setText(rs.getString(2));
                l3.setText(rs.getString(3));
                l4.setText(rs.getString(4));
                l5.setText(rs.getString(5));
                l6.setText(rs.getString(6));
                l7.setText(rs.getString(7));

            }

            rs.close();
        } catch (SQLException e) {
        }

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnExit.setBounds(160, 400, 150, 50);
         btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }
}
