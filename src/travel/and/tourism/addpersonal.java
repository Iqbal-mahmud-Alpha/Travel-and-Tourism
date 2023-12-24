package travel.and.tourism;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class addpersonal extends JFrame implements ActionListener {

    private JButton b1, b2, b3;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    private JTextField f1, f2, f3, f4, f5, f6, f7;
    private JPasswordField passwordField;
    private JPanel p1;
    private Font font;
    private Container c;
    private JComboBox combo;
    private JRadioButton r1, r2;
    private ButtonGroup grp1, grp2;

    String name;
    addpersonal(String username) {
        name=username;
        this.setLayout(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 1000, 800);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        font = new Font("Time the new roman", Font.BOLD, 40);

        l1 = new JLabel("New customar From");
        l1.setFont(font);
        l1.setBounds(300, 20, 500, 40);
        c.add(l1);

        l2 = new JLabel("Username :");
        l2.setBounds(50, 100, 200, 40);
        l2.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l2);

        f1 = new JTextField();
        f1.setBounds(400, 100, 400, 40);
        f1.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f1);

        l3 = new JLabel("ID :");
        l3.setBounds(50, 150, 200, 40);
        l3.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l3);

        combo = new JComboBox(new String[]{"Passport", "Date of birth", "Voter Id", "Driving license"});
        combo.setBounds(400, 150, 400, 40);
        combo.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(combo);

        l3 = new JLabel("Number :");
        l3.setBounds(50, 200, 200, 40);
        l3.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l3);

        f2 = new JTextField();
        f2.setBounds(400, 200, 400, 40);
        f2.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f2);

        l4 = new JLabel("Name :");
        l4.setBounds(50, 250, 200, 40);
        l4.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l4);

        f3 = new JTextField();
        f3.setBounds(400, 250, 400, 40);
        f3.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f3);

        l5 = new JLabel("Gender :");
        l5.setBounds(50, 300, 200, 40);
        l5.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l5);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        r1.setBackground(Color.WHITE);
        r1.setBounds(400, 300, 150, 30);
        c.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        r2.setBackground(Color.WHITE);
        r2.setBounds(600, 300, 150, 30);
        c.add(r2);

        l6 = new JLabel("Country :");
        l6.setBounds(50, 350, 200, 40);
        l6.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l6);

        f4 = new JTextField();
        f4.setBounds(400, 350, 400, 40);
        f4.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f4);

        l7 = new JLabel("Permanent Address :");
        l7.setBounds(50, 400, 300, 40);
        l7.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l7);

        f5 = new JTextField();
        f5.setBounds(400, 400, 400, 40);
        f5.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f5);

        l7 = new JLabel("Permanent Address :");
        l7.setBounds(50, 400, 300, 40);
        l7.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l7);

        f5 = new JTextField();
        f5.setBounds(400, 400, 400, 40);
        f5.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f5);

        l8 = new JLabel("Phone :");
        l8.setBounds(50, 450, 300, 40);
        l8.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l8);

        f6 = new JTextField();
        f6.setBounds(400, 450, 400, 40);
        f6.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f6);

        l8 = new JLabel("Email :");
        l8.setBounds(50, 500, 300, 40);
        l8.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l8);

        f7 = new JTextField();
        f7.setBounds(400, 500, 400, 40);
        f7.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f7);

        b1 = new JButton("Add");
        b1.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(400, 600, 180, 40);
        c.add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(620, 600, 180, 40);
        c.add(b2);
       // System.out.println("addpersonal"+username);
        try {
            Myconnection c = new Myconnection();
            ResultSet rs = c.s.executeQuery("select * from account where username = '" + name + "'");
            while(rs.next()){
                f1.setText(rs.getString("username"));
                f3.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String uname = f1.getText();
        String id = combo.getSelectedItem().toString();
        String number = f2.getText();
        String name = f3.getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        String country = f4.getText();
        String peraddress = f5.getText();
        String phone = f6.getText();
        String email = f7.getText();
        Myconnection c = new Myconnection();
        if (ae.getSource() == b1) {
            try {
                String q1 = "insert into customer values('" + uname + "','" + id + "','" + number + "','" + name + "','" + gender + "','" + country + "','" + peraddress + "','" + phone + "','" + email + "')";
                c.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                this.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addpersonal("").setVisible(true);
    }

}
