package travel.and.tourism;

import java.awt.*;

import javax.swing.*;

public class CheckPackage extends JFrame {

    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }

    CheckPackage() {
        setBounds(550, 200, 1000, 800);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        String[] package1 = new String[]{"package1.jpg", "GOLD PACKAGE", "6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "TK 12000 only"};
        String[] package2 = new String[]{"package2.jpg", "SILVER PACKAGE", "4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "TK 25000 only"};
        String[] package3 = new String[]{"package3.jpg", "BRONZE PACKAGE", "6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "TK 32000 only"};

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tabbedPane.addTab("Package 1", null, p1);

        JPanel p2 = createPackage(package2);
        tabbedPane.addTab("Package 2", null, p2);

        JPanel p3 = createPackage(package3);
        tabbedPane.addTab("Package 3", null, p3);

        add(tabbedPane, BorderLayout.CENTER);
    }

    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/" + pack[0]));
        Image i3 = i1.getImage().getScaledInstance(550, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(450, 0, 450, 420);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Time the new roman", Font.BOLD, 30));
        lblName.setBounds(50, 5, 350, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        l3.setForeground(Color.RED);
        l3.setBounds(35, 70, 350, 30);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        lblId.setForeground(Color.BLUE);
        lblId.setBounds(35, 110, 450, 30);
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        l2.setForeground(Color.RED);
        l2.setBounds(35, 160, 350, 30);
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        lblName_1.setForeground(Color.BLUE);
        lblName_1.setBounds(35, 200, 250, 30);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        lblGender.setForeground(Color.RED);
        lblGender.setBounds(35, 240, 200, 30);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        lblCountry.setForeground(Color.BLUE);
        lblCountry.setBounds(35, 280, 250, 30);
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        lblReserveRoomNumber.setForeground(Color.RED);
        lblReserveRoomNumber.setBounds(35, 320, 250, 30);
        p1.add(lblReserveRoomNumber);

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        lblCheckInStatus.setForeground(Color.BLUE);
        lblCheckInStatus.setBounds(35, 400, 200, 30);
        p1.add(lblCheckInStatus);

        JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setFont(new Font("Time the new roman", Font.ITALIC, 20));
        lblDeposite.setBounds(35, 460, 400, 40);
        p1.add(lblDeposite);

        JLabel la1 = new JLabel(pack[11]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Time the new roman", Font.ITALIC, 30));
        la1.setBounds(600, 460, 400, 40);
        p1.add(la1);

        return p1;
    }
}
