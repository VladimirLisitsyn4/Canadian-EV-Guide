import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class otherFrame extends JFrame {
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

    private JFrame f = new JFrame("Other Vehicles");
    private JLabel Title = new JLabel("Other Vehicles");
    private JButton Ioniq = new JButton("Hyundai IONIQ 5");
    private JButton Kona = new JButton("Hyundai KONA E.");
    private JButton HSE = new JButton("Jaguar I-PACE HSE");
    private JButton Niro = new JButton("Kia Niro EV");
    private JButton Soul = new JButton("Kia Soul EV");
    private JButton Leaf = new JButton("Nissan Leaf SV");
    private JButton Leafp = new JButton("Nissan Leaf SV+");

    public otherFrame() {
        f.setSize(400, 200);
        f.setLocation(new Point(750, 250));
        f.setLayout(null);
        f.setResizable(false);

        try {
            BufferedImage backgroundImage = ImageIO.read(MyFrame.class.getResource("images/others.png"));
            f.setContentPane(new ImagePanel(backgroundImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        initComponent();
        initEvent();
        f.setVisible(true);
    }

    private void initComponent() {
        Ioniq.setBounds(30, 30, 125, 25);
        Kona.setBounds(210, 30, 130, 25);
        HSE.setBounds(20, 65, 145, 25);
        Niro.setBounds(210, 65, 130, 25);
        Soul.setBounds(30, 95, 125, 25);
        Leaf.setBounds(210, 95, 130, 25);
        Leafp.setBounds(120, 130, 130, 25);
        Title.setBounds(125, 5, 130, 20);
        Title.setFont(new Font("Serif", Font.BOLD, 20));
        Title.setBackground(Color.BLACK);
        Title.setOpaque(true);
        Title.setForeground(Color.WHITE);
        Ioniq.setBackground(Color.BLACK);
        Ioniq.setForeground(Color.WHITE);
        Kona.setBackground(Color.BLACK);
        Kona.setForeground(Color.WHITE);
        HSE.setBackground(Color.BLACK);
        HSE.setForeground(Color.WHITE);
        Niro.setBackground(Color.BLACK);
        Niro.setForeground(Color.WHITE);
        Soul.setBackground(Color.BLACK);
        Soul.setForeground(Color.WHITE);
        Leaf.setBackground(Color.BLACK);
        Leaf.setForeground(Color.WHITE);
        Leafp.setBackground(Color.BLACK);
        Leafp.setForeground(Color.WHITE);


        f.add(Ioniq);
        f.add(Kona);
        f.add(HSE);
        f.add(Niro);
        f.add(Soul);
        f.add(Leaf);
        f.add(Leafp);
        f.add(Title);
    }

    private void initEvent() {

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
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

        HSE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hseClick(e);
            }
        });

        Niro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                niroClick(e);
            }
        });

        Soul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                soulClick(e);
            }
        });

        Leaf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                leafClick(e);
            }
        });

        Leafp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                leafpClick(e);
            }
        });
    }

    private void ioniqClick(ActionEvent evt) {
        new ioniqFrame();
    }
    private void konaClick(ActionEvent evt) {
        new konaFrame();
    }
    private void hseClick(ActionEvent evt) {
        new hseFrame();
    }
    private void niroClick(ActionEvent evt) {
        new niroFrame();
    }
    private void soulClick(ActionEvent evt) {
        new soulFrame();
    }
    private void leafClick(ActionEvent evt) {
        new leafFrame();
    }
    private void leafpClick(ActionEvent evt) {
        new leafpFrame();
    }
}
