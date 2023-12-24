package travel.and.tourism;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookPackage extends JFrame {

    private JPanel contentPane;
    JTextField t1, t2;
    Choice c1, c2, c3;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BookPackage frame = new BookPackage("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BookPackage(String username) {
        setBounds(420, 220, 1100, 800);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/bookpackage.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(450, 50, 700, 400);
        add(la1);

        JLabel lblName = new JLabel("BOOK PACKAGE");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblName.setBounds(118, 11, 300, 53);
        contentPane.add(lblName);

        JLabel la2 = new JLabel("Username :");
        la2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        la2.setBounds(35, 70, 200, 25);
        contentPane.add(la2);

        JLabel l1 = new JLabel(username);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l1.setBounds(271, 70, 200, 25);
        contentPane.add(l1);

        JLabel lblId = new JLabel("Select Package :");
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblId.setBounds(35, 110, 200, 25);
        contentPane.add(lblId);

        c1 = new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        c1.setBounds(271, 110, 180, 30);
        add(c1);

        JLabel la3 = new JLabel("Total Persons");
        la3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        la3.setBounds(35, 150, 200, 20);
        contentPane.add(la3);

        t1 = new JTextField();
        t1.setText("0");
        t1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        t1.setBounds(271, 150, 180, 30);
        contentPane.add(t1);
        t1.setColumns(10);

        JLabel lbl1 = new JLabel("ID :");
        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl1.setBounds(35, 190, 200, 20);
        contentPane.add(lbl1);

        JLabel l2 = new JLabel();
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setBounds(271, 190, 200, 20);
        contentPane.add(l2);

        JLabel lbl2 = new JLabel("Number :");
        lbl2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl2.setBounds(35, 230, 200, 20);
        contentPane.add(lbl2);

        JLabel l3 = new JLabel();
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setBounds(271, 230, 200, 20);
        contentPane.add(l3);

        JLabel lbl3 = new JLabel("Phone :");
        lbl3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl3.setBounds(35, 270, 200, 20);
        contentPane.add(lbl3);

        JLabel l4 = new JLabel();
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l4.setBounds(271, 270, 200, 20);
        contentPane.add(l4);

        JLabel lblDeposite = new JLabel("Total Price :");
        lblDeposite.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDeposite.setBounds(35, 310, 200, 20);
        contentPane.add(lblDeposite);

        JLabel l5 = new JLabel();
        l5.setBounds(271, 310, 200, 20);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l5.setForeground(Color.RED);
        contentPane.add(l5);

        try {
            Myconnection c = new Myconnection();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '" + username + "'");
            while (rs.next()) {
                l2.setText(rs.getString("id_type"));
                l3.setText(rs.getString("number"));
                l4.setText(rs.getString("phone"));

            }

            rs.close();
        } catch (SQLException e) {
        }

        JButton b1 = new JButton("Check Price");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p = c1.getSelectedItem();
                int cost = 0;
                if (p.equals("Gold Package")) {
                    cost += 12000;
                }
                if (p.equals("Silver Package")) {
                    cost += 25000;
                } else if (p.equals("Bronze Package")) {
                    cost += 32000;
                }

                cost *= Integer.parseInt(t1.getText());
                l5.setText("Tk " + cost);

            }
        });
        b1.setBounds(50, 550, 150, 50);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        JButton btnNewButton = new JButton("Book");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Myconnection c = new Myconnection();

                try {
                    String s1 = c1.getSelectedItem();

                    String q1 = "insert into bookpackage values('" + username + "', '" + c1.getSelectedItem() + "', '" + t1.getText() + "', '" + l2.getText() + "', '" + l3.getText() + "', '" + l4.getText() + "', '" + l5.getText() + "')";
                    c.s.executeUpdate(q1);

                    JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                    setVisible(false);
                } catch (Exception ee) {
                    System.out.println(ee.getMessage());
                }

            }
        });
        btnNewButton.setBounds(220, 550, 150, 50);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(btnNewButton);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnExit.setBounds(390, 550, 150, 50);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }
}
