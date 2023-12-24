package travel.and.tourism;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    private JButton b1, b2, b3;
    private JLabel l1, l2, l3, l4;
    private JTextField f1, f2, f3;
    private JPasswordField passwordField;
    private JPanel p1;
    private Font font;
    private Container c;

    Login() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 300, 1000, 500);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        font = new Font("Time the new roman", Font.BOLD, 20);

        p1 = new JPanel();
        p1.setBounds(30, 30, 550, 380);
        p1.setBackground(Color.LIGHT_GRAY);
        c.add(p1);

        l1 = new JLabel("Username : ");
        l1.setFont(font);
        l1.setBounds(20, 50, 200, 40);
        p1.setLayout(null);
        p1.add(l1);

        f1 = new JTextField();
        f1.setBounds(180, 50, 280, 40);
        f1.setFont(font);
        f1.setForeground(Color.BLACK);
        p1.add(f1);

        l2 = new JLabel("Password : ");
        l2.setFont(font);
        l2.setBounds(20, 100, 200, 40);
        p1.add(l2);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 100, 280, 40);
        passwordField.setFont(font);
        p1.add(passwordField);

        b1 = new JButton("Login");
        b1.setFont(font);
        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(176, 224, 230));
        b1.setBounds(90, 200, 180, 40);
        p1.add(b1);

        b2 = new JButton("SignUp");
        b2.setFont(font);
        b2.setForeground(new Color(46, 139, 87));
        b2.setBackground(new Color(176, 224, 230));
        b2.setBounds(320, 200, 180, 40);
        p1.add(b2);

        l3 = new JLabel("Trouble in Login?");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setForeground(new Color(255, 0, 0));
        l3.setBounds(20, 280, 180, 40);
        p1.add(l3);

        b3 = new JButton("Forgot Password");
        b3.setFont(font);
        b3.setForeground(new Color(46, 139, 87));
        b3.setBackground(new Color(176, 224, 230));
        b3.setBounds(180, 280, 250, 40);
        p1.add(b3);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/login.png"));
        Image i2 = icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(i2);
        l4 = new JLabel(icon2);
        l4.setBounds(640, 50, 300, 300);
        c.add(l4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = f1.getText();
        String pass = passwordField.getText();
        try {
            Myconnection con = new Myconnection();
            if (e.getSource() == b1) {
                String Q = "SELECT *FROM account WHERE username='" + username + "' AND password ='" + pass + "'";
                ResultSet rs = con.s.executeQuery(Q);
                if (rs.next()) {
                    this.setVisible(false);
                    //System.out.println(username);
                    new Loding(username).setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalide Password");
                }
            } else if (e.getSource() == b2) {
                this.setVisible(false);
                new SignUp().setVisible(true);
            } else {
                this.setVisible(false);
                new ForgotPassword().setVisible(true);
            }
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, ee);
        }

    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
