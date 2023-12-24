package travel.and.tourism;

import java.awt.*;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteCustomer extends JFrame {

    private JPanel contentPane;
    Choice c1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DeleteCustomer frame = new DeleteCustomer();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DeleteCustomer() throws SQLException {
        setBounds(580, 220, 900, 700);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/delete.png"));
        Image i3 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(500, 100, 300, 300);
        add(l1);

        JLabel lblName = new JLabel("DELETE CUSTOMER DETAILS");
        lblName.setFont(new Font("Yu Mincho", Font.BOLD, 30));
        lblName.setBounds(200, 0, 450, 53);
        contentPane.add(lblName);

        JLabel lb3 = new JLabel("Username :");
        lb3.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lb3.setBounds(35, 70, 200, 25);
        contentPane.add(lb3);

        c1 = new Choice();
        Myconnection c = new Myconnection();
        try {

            ResultSet rs = c.s.executeQuery("select * from customer");
            while (rs.next()) {
                c1.add(rs.getString("username"));
            }

            rs.close();
        } catch (SQLException e) {
        }

        c1.setBounds(271, 70, 200, 30);
        c1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        add(c1);

        JLabel lblId = new JLabel("ID :");
        lblId.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblId.setBounds(35, 110, 200, 25);
        contentPane.add(lblId);

        JLabel l2 = new JLabel();
        l2.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l2.setBounds(271, 110, 200, 25);
        contentPane.add(l2);

        JLabel lb2 = new JLabel("Number :");
        lb2.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lb2.setBounds(35, 150, 200, 25);
        contentPane.add(lb2);

        JLabel l3 = new JLabel();
        l3.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l3.setBounds(271, 150, 200, 25);
        contentPane.add(l3);

        JLabel lblName_1 = new JLabel("Name :");
        lblName_1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName_1.setBounds(35, 190, 200, 25);
        contentPane.add(lblName_1);

        JLabel l4 = new JLabel();
        l4.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l4.setBounds(271, 190, 200, 25);
        contentPane.add(l4);

        JLabel lblGender = new JLabel("Gender :");
        lblGender.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblGender.setBounds(35, 230, 200, 25);
        contentPane.add(lblGender);

        JLabel l5 = new JLabel();
        l5.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l5.setBounds(271, 230, 200, 25);
        contentPane.add(l5);

        JLabel lblCountry = new JLabel("Country :");
        lblCountry.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCountry.setBounds(35, 270, 200, 25);
        contentPane.add(lblCountry);

        JLabel l6 = new JLabel();
        l6.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l6.setBounds(271, 270, 200, 25);
        contentPane.add(l6);

        JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
        lblReserveRoomNumber.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblReserveRoomNumber.setBounds(35, 310, 200, 25);
        contentPane.add(lblReserveRoomNumber);

        JLabel l7 = new JLabel();
        l7.setBounds(271, 310, 200, 25);
        l7.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        contentPane.add(l7);

        JLabel lblCheckInStatus = new JLabel("Phone :");
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 350, 200, 25);
        contentPane.add(lblCheckInStatus);

        JLabel l8 = new JLabel();
        l8.setBounds(271, 350, 200, 25);
        l8.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        contentPane.add(l8);

        JLabel lblDeposite = new JLabel("Email :");
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblDeposite.setBounds(35, 390, 200, 25);
        contentPane.add(lblDeposite);

        JLabel l9 = new JLabel();
        l9.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l9.setBounds(271, 390, 200, 25);
        contentPane.add(l9);

        JButton b1 = new JButton("Check");

        System.out.println(c1.getSelectedItem());
        String name = c1.getSelectedItem();
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Myconnection c = new Myconnection();
                System.out.println(name);
                try {
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '" + name + "'");
                    if (rs.next()) {
                        l2.setText(rs.getString(2));
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));
                        l7.setText(rs.getString(7));
                        l8.setText(rs.getString(8));
                        l9.setText(rs.getString(9));
                    }
                } catch (Exception ee) {
                }
            }
        });
        b1.setBounds(500, 70, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        JButton btnNewButton = new JButton("Delete");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Myconnection c = new Myconnection();

                try {
                    String s1 = c1.getSelectedItem();

                    String q1 = "delete from customer where username = '" + s1 + "'";
                    c.s.executeUpdate(q1);
                    String q2 = "delete from account where username = '" + s1 + "'";
                    c.s.executeUpdate(q2);
                    String q3 = "delete from bookhotel where username = '" + s1 + "'";
                    c.s.executeUpdate(q3);
                    String q4 = "delete from bookpackage where username = '" + s1 + "'";
                    c.s.executeUpdate(q4);

                    JOptionPane.showMessageDialog(null, "Customer Detail Deleted Successfully");
                    setVisible(false);
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                } catch (NumberFormatException s) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid Number");
                }
            }
        });
        btnNewButton.setBounds(100, 500, 100, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        contentPane.add(btnNewButton);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnExit.setBounds(260, 500, 100, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }
}
