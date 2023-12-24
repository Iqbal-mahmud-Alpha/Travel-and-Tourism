package travel.and.tourism;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Loding extends JFrame implements Runnable {

    private Container c;
    private JLabel l1, l2, l3;
    private Font font;
    private JProgressBar progressBar;
    private Thread t;
    String name;
    Loding(String username) {
        name = username;

        t = new Thread(this);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 300, 1000, 500);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        font = new Font("Time the new roman", Font.BOLD, 40);

        l1 = new JLabel("Travel and Tourism Management System ");
        l1.setForeground(new Color(72, 209, 204));
        l1.setFont(font);
        l1.setBounds(100, 10, 800, 60);
        c.add(l1);
       // System.out.println(name);
        l2 = new JLabel("Wellcome  " +name);
        l2.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        l2.setForeground(Color.RED);
        l2.setBounds(80, 350, 300, 60);
        c.add(l2);

        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
        progressBar.setStringPainted(true);
        progressBar.setBounds(280, 135, 450, 40);
        c.add(progressBar);

        l3 = new JLabel("Please Wait....");
        l3.setFont(new Font("Time the new roman", Font.PLAIN, 20));
        l3.setForeground(Color.GRAY);
        l3.setBounds(450, 180, 300, 60);
        c.add(l3);
        
        setUndecorated(true);
        t.start();
    }

    public static void main(String[] args) {
        new Loding("").setVisible(true);
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 101; i++) {
                int v = progressBar.getValue();
                int m = progressBar.getMaximum();
                if (v < m) {
                    progressBar.setValue(progressBar.getValue() + 1);
                } else {
                    i = 101;
                    //System.out.println("logding"+name);
                    this.setVisible(false);
                    new home(name).setVisible(true);
                }
                Thread.sleep(30);
            }
        } catch (InterruptedException ex) {

        }
    }
}
