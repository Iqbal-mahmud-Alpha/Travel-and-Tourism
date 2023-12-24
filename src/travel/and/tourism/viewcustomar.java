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

public class viewcustomar extends JFrame implements ActionListener {

    private JButton b1, b2, b3;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
    private Font font;
    private Container c;

    String name1;

    viewcustomar(String username) {
        name1 = username;
        this.setLayout(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 1000, 800);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        font = new Font("Time the new roman", Font.BOLD, 40);

        l1 = new JLabel("view Customar Details");
        l1.setFont(font);
        l1.setBounds(250, 20, 500, 40);
        c.add(l1);

        l2 = new JLabel("Username :");
        l2.setBounds(50, 100, 200, 40);
        l2.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l2);

        l11 = new JLabel();
        l11.setBounds(400, 100, 400, 40);
        l11.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l11);

        l3 = new JLabel("ID :");
        l3.setBounds(50, 150, 200, 40);
        l3.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l3);

        l12 = new JLabel();
        l12.setBounds(400, 150, 400, 40);
        l12.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l12);

        l4 = new JLabel("Number :");
        l4.setBounds(50, 200, 200, 40);
        l4.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l4);

        l13 = new JLabel();
        l13.setBounds(400, 200, 400, 40);
        l13.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l13);

        l5 = new JLabel("Name :");
        l5.setBounds(50, 250, 200, 40);
        l5.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l5);

        l14 = new JLabel();
        l14.setBounds(400, 250, 400, 40);
        l14.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l14);

        l6 = new JLabel("Gender :");
        l6.setBounds(50, 300, 200, 40);
        l6.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l6);

        l15 = new JLabel();
        l15.setBounds(400, 300, 400, 40);;
        l15.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l15);

        l7 = new JLabel("Country :");
        l7.setBounds(50, 350, 200, 40);
        l7.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l7);

        l16 = new JLabel();
        l16.setBounds(400, 350, 400, 40);
        l16.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l16);

        l8 = new JLabel("Permanent Address :");
        l8.setBounds(50, 400, 300, 40);
        l8.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l8);

        l17 = new JLabel();
        l17.setBounds(400, 400, 400, 40);
        l17.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l17);

        l9 = new JLabel("Phone :");
        l9.setBounds(50, 450, 300, 40);
        l9.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l9);

        l18 = new JLabel();
        l18.setBounds(400, 450, 400, 40);
        l18.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l18);

        l10 = new JLabel("Email :");
        l10.setBounds(50, 500, 300, 40);
        l10.setFont(new Font("Time the new roman", Font.PLAIN, 25));
        c.add(l10);

        l19 = new JLabel();
        l19.setBounds(400, 500, 400, 40);
        l19.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        c.add(l19);

        b1 = new JButton("Back");
        b1.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(400, 600, 180, 40);
        c.add(b1);

        try {
            Myconnection c = new Myconnection();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '" + name1 + "'");
            while (rs.next()) {
                l11.setText(rs.getString("username"));
                l14.setText(rs.getString("name"));

                l12.setText(rs.getString("id_type"));
                l13.setText(rs.getString("number"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            this.setVisible(false);
        } else {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new viewcustomar("").setVisible(true);
    }

}
