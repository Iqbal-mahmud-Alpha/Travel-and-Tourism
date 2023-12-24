package travel.and.tourism;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ForgotPassword extends JFrame implements ActionListener {

    private JButton b1, b2, b3, b4;
    private JLabel l1, l2, l3, l4, l5, l6;
    private JTextField f1, f2, f3, f4,f5;
    private JPanel p1;
    private Font font;
    private Container c;
    private JComboBox c1;

    public ForgotPassword() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 200, 1200, 700);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        font = new Font("Time the new roman", Font.BOLD, 18);

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
        f1.setBounds(260, 40, 250, 40);
        p1.add(f1);

        l2 = new JLabel("Name : ");
        l2.setFont(font);
        l2.setBounds(20, 110, 200, 40);
        p1.add(l2);

        f2 = new JTextField();
        f2.setFont(font);
        f2.setBounds(260, 110, 250, 40);
        p1.add(f2);

        b3 = new JButton("Serch");
        b3.setFont(new Font("Tahoma", Font.BOLD, 20));
        b3.setBounds(520, 40, 150, 40);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        p1.add(b3);

        l3 = new JLabel("Security Question : ");
        l3.setFont(font);
        l3.setBounds(20, 180, 200, 40);
        p1.add(l3);

        f3 = new JTextField();
        f3.setFont(font);
        f3.setBounds(260, 180, 350, 40);
        p1.add(f3);

        l4 = new JLabel("Answer : ");
        l4.setFont(font);
        l4.setBounds(20, 250, 200, 40);
        p1.add(l4);

        f4 = new JTextField();
        f4.setFont(font);
        f4.setBounds(260, 250, 250, 40);
        p1.add(f4);

        l5 = new JLabel("Password : ");
        l5.setFont(font);
        l5.setBounds(20, 320, 200, 40);
        p1.add(l5);

        f5 = new JTextField();
        f5.setFont(font);
        f5.setBounds(260, 320, 250, 40);
        p1.add(f5);

        b4 = new JButton("Retrive");
        b4.setFont(new Font("Tahoma", Font.BOLD, 20));
        b4.setBounds(520, 250, 150, 40);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        p1.add(b4);

        b1 = new JButton("Back");
        b1.setFont(new Font("Tahoma", Font.BOLD, 20));
        b1.setBounds(260, 400, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/forgetpass.jpeg"));
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
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = f1.getText();
            String answere = f4.getText();
            Myconnection con = new Myconnection();
            if (ae.getSource() == b1) {
                this.setVisible(false);
                new Login().setVisible(true);
            } else if (ae.getSource() == b3) {
                String Q = "SELECT *FROM account WHERE username='" + username + "'";
                ResultSet rs = con.s.executeQuery(Q);
                while (rs.next()) {
                    f2.setText(rs.getString("name"));
                    f3.setText(rs.getString("security"));
                }

            } else {
                String Q = "SELECT *FROM account WHERE answere='" + answere + "' AND username ='" + username + "'";
                ResultSet rs = con.s.executeQuery(Q);
                while (rs.next()) {
                    f5.setText(rs.getString("password"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void main(String[] args) {
        new ForgotPassword().setVisible(true);
    }
}
