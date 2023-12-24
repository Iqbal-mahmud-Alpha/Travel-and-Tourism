package travel.and.tourism;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SignUp extends JFrame implements ActionListener {

    private JButton b1, b2, b3;
    private JLabel l1, l2, l3, l4, l5, l6;
    private JTextField f1, f2, f3, f4;
    private JPanel p1;
    private Font font;
    private Container c;
    private JComboBox c1;

    public SignUp() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 200, 1200, 700);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        font = new Font("Time the new roman", Font.BOLD, 20);

        p1 = new JPanel();
        p1.setBounds(50, 50, 700, 550);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(null);
        c.add(p1);

        l1 = new JLabel("Username : ");
        l1.setFont(font);
        l1.setBounds(20, 40, 200, 40);
        p1.add(l1);

        f1 = new JTextField();
        f1.setFont(font);
        f1.setBounds(250, 40, 380, 40);
        p1.add(f1);

        l2 = new JLabel("Name : ");
        l2.setFont(font);
        l2.setBounds(20, 110, 200, 40);
        p1.add(l2);

        f2 = new JTextField();
        f2.setFont(font);
        f2.setBounds(250, 110, 380, 40);
        p1.add(f2);

        l3 = new JLabel("Password : ");
        l3.setFont(font);
        l3.setBounds(20, 180, 200, 40);
        p1.add(l3);

        f4 = new JTextField();
        f4.setFont(font);
        f4.setBounds(250, 180, 380, 40);
        p1.add(f4);

        l3 = new JLabel("Password : ");
        l3.setFont(font);
        l3.setBounds(20, 180, 200, 40);
        p1.add(l3);

        l4 = new JLabel("Security Question : ");
        l4.setFont(font);
        l4.setBounds(20, 250, 200, 40);
        p1.add(l4);

        String reg[] = {"Your NickName ?", "Your Lucky Number ?", "Your Child SuperHero", "Your Favorite Movie"};
        c1 = new JComboBox(reg);
        c1.setFont(font);
        c1.setBounds(250, 250, 380, 40);
        p1.add(c1);

        l5 = new JLabel("Answer : ");
        l5.setFont(font);
        l5.setBounds(20, 320, 200, 40);
        p1.add(l5);

        f3 = new JTextField();
        f3.setFont(font);
        f3.setBounds(250, 320, 380, 40);
        p1.add(f3);

        b1 = new JButton("Create");
        b1.setFont(new Font("Tahoma", Font.BOLD, 20));
        b1.setBounds(250, 450, 150, 50);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("Tahoma", Font.BOLD, 20));
        b2.setBounds(480, 450, 150, 50);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        p1.add(b2);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/signup.png"));
        Image i1 = c1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        l6 = new JLabel(i2);
        l6.setBounds(750, 100, 400, 400);
        c.add(l6);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(34, 139, 34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 4), "Create-Account",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
        panel.setBounds(20, 20, 1150, 600);
        panel.setBackground(Color.WHITE);
        c.add(panel);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String username = f1.getText();
        String name = f2.getText();
        String pass = f4.getText();
        String choice = (String) c1.getSelectedItem();
        String answere = f3.getText();

        if (ae.getSource() == b1) {
            
            try {
                Myconnection con = new Myconnection();
                String Q = "INSERT INTO account VALUES('" + username + "','" + name + "','" + pass + "','" + choice + "','" + answere + "')";
                con.s.executeUpdate(Q);
                con.c.close();
                JOptionPane.showMessageDialog(null,"Data insert succusfully");
                this.setVisible(false);
                new Login().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignUp().setVisible(true);
    }

}
