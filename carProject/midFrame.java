import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class midFrame extends JFrame {
    class ImagePanel extends JComponent {
        private Image image;

        public ImagePanel(Image image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }

    private JFrame f = new JFrame("Mid-Range Vehicles");
    private JLabel Title = new JLabel("Mid-Range Vehicles");
    private JButton iX = new JButton("BMW iX");
    private JButton i4 = new JButton("BMW i4");
    private JButton i4_M50 = new JButton("BMW i4 M50 xDRIVE");
    private JButton Ioniq = new JButton("Hyundai IONIQ 5");
    private JButton Kona = new JButton("Hyundai KONA E.");
    private JButton three = new JButton("Tesla Model 3");
    private JButton Y = new JButton("Tesla Model Y");
    private JButton truck = new JButton("Tesla Cybertruck");

    public midFrame() {
        f.setSize(450, 200);
        f.setLocation(new Point(750, 250));
        f.setLayout(null);
        f.setResizable(false);

        try {
            BufferedImage backgroundImage = ImageIO.read(MyFrame.class.getResource("images/mid.png"));
            f.setContentPane(new ImagePanel(backgroundImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        initComponent();
        initEvent();
        f.setVisible(true);
    }

    private void initComponent() {
        iX.setBounds(15, 55, 110, 25);
        i4.setBounds(150, 55, 110, 25);
        i4_M50.setBounds(275, 55, 150, 25);
        Ioniq.setBounds(5, 85, 130, 25);
        Kona.setBounds(140, 85, 130, 25);
        three.setBounds(285, 85, 130, 25);
        Y.setBounds(80, 120, 130, 25);
        truck.setBounds(215, 120, 150, 25);
        Title.setBounds(130, 10, 175, 23);
        iX.setBackground(Color.BLACK);
        iX.setForeground(Color.WHITE);
        i4.setBackground(Color.BLACK);
        i4.setForeground(Color.WHITE);
        i4_M50.setBackground(Color.BLACK);
        i4_M50.setForeground(Color.WHITE);
        Ioniq.setBackground(Color.BLACK);
        Ioniq.setForeground(Color.WHITE);
        Kona.setBackground(Color.BLACK);
        Kona.setForeground(Color.WHITE);
        three.setBackground(Color.BLACK);
        three.setForeground(Color.WHITE);
        Y.setBackground(Color.BLACK);
        Y.setForeground(Color.WHITE);
        truck.setBackground(Color.BLACK);
        truck.setForeground(Color.WHITE);
        Title.setFont(new Font("Serif", Font.BOLD, 20));
        Title.setBackground(Color.BLACK);
        Title.setOpaque(true);
        Title.setForeground(Color.WHITE);


        f.add(iX);
        f.add(i4);
        f.add(i4_M50);
        f.add(Ioniq);
        f.add(Kona);
        f.add(three);
        f.add(Y);
        f.add(truck);
        f.add(Title);
    }

    private void initEvent() {

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

        iX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iXClick(e);
            }
        });

        i4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i4Click(e);
            }
        });

        i4_M50.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i4_M50Click(e);
            }
        });

        Ioniq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ioniqClick(e);
            }
        });

        Kona.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                konaClick(e);
            }
        });

        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                threeClick(e);
            }
        });

        Y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                yClick(e);
            }
        });

        truck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                truckClick(e);
            }
        });
    }

    private void iXClick(ActionEvent evt) {
        new iXFrame();
    }
    private void i4Click(ActionEvent evt) {
        new i4Frame();
    }
    private void i4_M50Click(ActionEvent evt) {
        new i4M50Frame();
    }
    private void ioniqClick(ActionEvent evt) {
        new ioniqFrame();
    }
    private void konaClick(ActionEvent evt) {
        new konaFrame();
    }
    private void threeClick(ActionEvent evt) {
        new threeFrame();
    }
    private void yClick(ActionEvent evt) {
        new yFrame();
    }
    private void truckClick(ActionEvent evt) {
        new truckFrame();
    }
}
