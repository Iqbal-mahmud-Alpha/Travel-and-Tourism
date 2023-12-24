package travel.and.tourism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class home extends JFrame implements ActionListener {

    private JPanel p1, p2;
    private JLabel l1, l2;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    String name;

    home(String username) {
        name = username;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1950, 80);
        p1.setLayout(null);
        this.add(p1);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/dashbord.jpg"));
        Image i2 = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(i2);
        JLabel l2 = new JLabel(icon2);
        l2.setBounds(0, 0, 100, 100);
        setLayout(null);
        p1.add(l2);

        l1 = new JLabel("Dashboard");
        l1.setBounds(120, 0, 200, 100);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Time the new roman", Font.BOLD, 30));
        p1.add(l1);

        p2 = new JPanel();
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 80, 400, 1000);
        p2.setLayout(null);
        this.add(p2);

        b1 = new JButton("Add Personal Details");
        b1.setBounds(0, 0, 400, 60);
        b1.setBackground(new Color(0, 0, 102));
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        p2.add(b1);

        b2 = new JButton("Update Personal Details");
        b2.setBounds(0, 60, 400, 60);
        b2.setBackground(new Color(0, 0, 102));
        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        p2.add(b2);

        b3 = new JButton("Vied Details");
        b3.setBounds(0, 120, 400, 60);
        b3.setBackground(new Color(0, 0, 102));
        b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b3.setForeground(Color.WHITE);
        p2.add(b3);

        b4 = new JButton("Delete Personal Details");
        b4.setBounds(0, 180, 400, 60);
        b4.setBackground(new Color(0, 0, 102));
        b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b4.setForeground(Color.WHITE);
        p2.add(b4);

        b5 = new JButton("Check Package");
        b5.setBounds(0, 240, 400, 60);
        b5.setBackground(new Color(0, 0, 102));
        b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b5.setForeground(Color.WHITE);
        p2.add(b5);

        b6 = new JButton("Book Package");
        b6.setBounds(0, 300, 400, 60);
        b6.setBackground(new Color(0, 0, 102));
        b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b6.setForeground(Color.WHITE);
        p2.add(b6);

        b7 = new JButton("View Package");
        b7.setBounds(0, 360, 400, 60);
        b7.setBackground(new Color(0, 0, 102));
        b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b7.setForeground(Color.WHITE);
        p2.add(b7);

        b8 = new JButton("View Hotels");
        b8.setBounds(0, 420, 400, 60);
        b8.setBackground(new Color(0, 0, 102));
        b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b8.setForeground(Color.WHITE);
        p2.add(b8);

        b9 = new JButton("Book Hotel");
        b9.setBounds(0, 480, 400, 60);
        b9.setBackground(new Color(0, 0, 102));
        b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b9.setForeground(Color.WHITE);
        p2.add(b9);

        b10 = new JButton("View Booked Hotel");
        b10.setBounds(0, 540, 400, 60);
        b10.setBackground(new Color(0, 0, 102));
        b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b10.setForeground(Color.WHITE);
        p2.add(b10);

        b11 = new JButton("Destination");
        b11.setBounds(0, 600, 400, 60);
        b11.setBackground(new Color(0, 0, 102));
        b11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b11.setForeground(Color.WHITE);
        p2.add(b11);

        b12 = new JButton("Payment");
        b12.setBounds(0, 660, 400, 60);
        b12.setBackground(new Color(0, 0, 102));
        b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b12.setForeground(Color.WHITE);
        p2.add(b12);

        b13 = new JButton("About");
        b13.setBounds(0, 720, 400, 60);
        b13.setBackground(new Color(0, 0, 102));
        b13.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b13.setForeground(Color.WHITE);
        p2.add(b13);

        l2 = new JLabel("Travel And Turism Management System");
        l2.setBounds(580, 80, 1200, 100);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 60));
        this.add(l2);

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/home.jpg"));
        Image i1 = icon1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(i1);
        JLabel l1 = new JLabel(icon3);
        l1.setBounds(0, 0, 1950, 1000);
        setLayout(null);
        add(l1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            //System.out.println("home "+name);
            new addpersonal(name).setVisible(true);
        }
        else if(e.getSource()==b2){
            new updatecustomar(name).setVisible(true);
        }
        else if(e.getSource()==b3){
            new viewcustomar(name).setVisible(true);
        }
        else if(e.getSource()==b4){
            try {
                new DeleteCustomer().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(e.getSource()==b5){
            new CheckPackage().setVisible(true);
        }
        else if(e.getSource()==b6){
            new BookPackage(name).setVisible(true);
        }
        else if(e.getSource()==b7){
            new ViewPackage(name).setVisible(true);
        }
        else if(e.getSource()==b8){
            new ViewHotel().setVisible(true);
        }
        else if(e.getSource()==b9){
            new BookHotel(name).setVisible(true);
        }
        else if(e.getSource()==b10){
            new ViewBookedHotel(name).setVisible(true);
        }
        else if(e.getSource()==b11){
            new Destination().setVisible(true);
        }
        else if(e.getSource()==b12){
            new Payment().setVisible(true);
        }
        else if(e.getSource()==b13){
            new About().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new home("").setVisible(true);
    }

}
