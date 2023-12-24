package travel.and.tourism;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash {

    public static void main(String[] args) {
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        for (int i = 1, x = 1; i <= 700; i += 6, x += 7) {
            frame.setBounds(1000 - ((x + i) / 2), 500 - (i / 2), i + x, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}

class SplashFrame extends JFrame implements Runnable {

    Thread t1;

    SplashFrame() {
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("travel/and/tourism/icon/home.jpg"));
        Image i2 = icon.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(i2);
        JLabel l1 = new JLabel(icon2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(7000);
            this.setVisible(false);
            new Login().setVisible(true);
        } catch (Exception e) {
        }
    }
}
