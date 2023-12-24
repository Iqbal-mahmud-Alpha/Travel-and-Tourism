/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.and.tourism;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Prity
 */
public class Payment extends JFrame {

    public Payment() {

        setLayout(null);
        setBounds(600, 220, 1000, 800);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Pay using Bkash");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/bkash.png"));
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(100, 150, 800, 600);
        add(l4);

        JButton pay = new JButton("Pay");
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //new Payment().setVisible(false);
                new Paytm().setVisible(true);
            }
        });
        pay.setForeground(Color.WHITE);
        pay.setBackground(Color.black);
        pay.setFont(new Font("Time the new romane", Font.PLAIN, 20));
        pay.setBounds(420, 20, 150, 40);
        add(pay);

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(600, 20, 150, 40);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.black);
        back.setFont(new Font("Time the new romane", Font.PLAIN, 20));
        add(back);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Payment().setVisible(true);
    }

}
