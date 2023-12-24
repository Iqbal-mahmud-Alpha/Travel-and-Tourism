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

public class updatecustomar extends JFrame implements ActionListener {

    private JButton b1, b2, b3;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    private JTextField f1, f2, f3, f4, f5, f6, f7, f8, f9, f10;
    private JPasswordField passwordField;
    private JPanel p1;
    private Font font;
    private Container c;
    private JComboBox combo;
    private JRadioButton r1, r2;
    private ButtonGroup grp1, grp2;

    String name1;

    updatecustomar(String username) {
        name1 = username;
        this.setLayout(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 1000, 800);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        font = new Font("Time the new roman", Font.BOLD, 40);

        l1 = new JLabel("Update Customar Details");
        l1.setFont(font);
        l1.setBounds(300, 20, 500, 40);
        c.add(l1);

        l2 = new JLabel("Username :");
        l2.setBounds(50, 100, 200, 40);
        l2.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l2);

        f2 = new JTextField();
        f2.setBounds(400, 100, 400, 40);
        f2.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f2);

        l3 = new JLabel("ID :");
        l3.setBounds(50, 150, 200, 40);
        l3.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l3);

        f3 = new JTextField();
        f3.setBounds(400, 150, 400, 40);
        f3.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(f3);

        l4 = new JLabel("Number :");
        l4.setBounds(50, 200, 200, 40);
        l4.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l4);

        f4 = new JTextField();
        f4.setBounds(400, 200, 400, 40);
        f4.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f4);

        l5 = new JLabel("Name :");
        l5.setBounds(50, 250, 200, 40);
        l5.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l5);

        f5 = new JTextField();
        f5.setBounds(400, 250, 400, 40);
        f5.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f5);

        l6 = new JLabel("Gender :");
        l6.setBounds(50, 300, 200, 40);
        l6.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l6);

        f6 = new JTextField();
        f6.setBounds(400, 300, 400, 40);;
        f6.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f6);

        l7 = new JLabel("Country :");
        l7.setBounds(50, 350, 200, 40);
        l7.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l7);

        f7 = new JTextField();
        f7.setBounds(400, 350, 400, 40);
        f7.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f7);

        l8 = new JLabel("Permanent Address :");
        l8.setBounds(50, 400, 300, 40);
        l8.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l8);

        f8 = new JTextField();
        f8.setBounds(400, 400, 400, 40);
        f8.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f8);

        l9 = new JLabel("Phone :");
        l9.setBounds(50, 450, 300, 40);
        l9.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l9);

        f9 = new JTextField();
        f9.setBounds(400, 450, 400, 40);
        f9.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f9);

        l10 = new JLabel("Email :");
        l10.setBounds(50, 500, 300, 40);
        l10.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l10);

        f10 = new JTextField();
        f10.setBounds(400, 500, 400, 40);
        f10.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(f10);

        b1 = new JButton("Update");
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
        System.out.println("updatepersonal " + name1);

        try {
            Myconnection c = new Myconnection();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '" + name1 + "'");
            while (rs.next()) {
                f2.setText(rs.getString("username"));
                f5.setText(rs.getString("name"));

                f3.setText(rs.getString("id_type"));
                f4.setText(rs.getString("number"));
                f6.setText(rs.getString("gender"));
                f7.setText(rs.getString("country"));
                f8.setText(rs.getString("address"));
                f9.setText(rs.getString("phone"));
                f10.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            this.setVisible(false);
        } else {
            String uname = f2.getText();
            String name = f5.getText();
            String id = f3.getText();
            String number = f4.getText();
            String gender = f6.getText();
            String country = f7.getText();
            String paddress = f8.getText();
            String phone = f9.getText();
            String email = f10.getText();
            Myconnection con = new Myconnection();
            try {
                String q1 = "update customer set id_type = '" + id + "', number = '" + number + "', name = '" + name + "', gender = '" + gender + "', country = '" + country + "', address = '" + paddress + "', phone = '" + phone + "', email = '" + email + "' where username = '" + uname + "'";
                con.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Customer Detail Updated Successfully");
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    public static void main(String[] args) {
        new updatecustomar("").setVisible(true);
    }

}
