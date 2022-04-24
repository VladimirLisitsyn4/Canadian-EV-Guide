import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class BMWFrame extends JFrame {
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

    private JFrame f = new JFrame("BMW Vehicles");
    private JLabel Title = new JLabel("BMW Vehicles");
    private JButton iX = new JButton("BMW iX");
    private JButton iX_M60 = new JButton("BMW iX M60");
    private JButton i4 = new JButton("BMW i4");
    private JButton i4_M50 = new JButton("BMW i4 M50 xDrive");

    public BMWFrame() {
        f.setSize(400, 200);
        f.setLocation(new Point(750, 250));
        f.setLayout(null);
        f.setResizable(false);

        try {
            BufferedImage backgroundImage = ImageIO.read(MyFrame.class.getResource("images/BMW.png"));
            f.setContentPane(new ImagePanel(backgroundImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        initComponent();
        initEvent();
        f.setVisible(true);
    }

    private void initComponent() {
        iX.setBounds(70, 75, 80, 25);
        iX_M60.setBounds(200, 75, 110, 25);
        i4.setBounds(70, 105, 80, 25);
        i4_M50.setBounds(185, 105, 150, 25);
        Title.setBounds(125, 30, 130, 20);
        iX.setBackground(Color.BLACK);
        iX.setForeground(Color.WHITE);
        iX_M60.setBackground(Color.BLACK);
        iX_M60.setForeground(Color.WHITE);
        i4.setBackground(Color.BLACK);
        i4.setForeground(Color.WHITE);
        i4_M50.setBackground(Color.BLACK);
        i4_M50.setForeground(Color.WHITE);
        Title.setFont(new Font("Serif", Font.BOLD, 20));
        Title.setBackground(Color.BLACK);
        Title.setOpaque(true);
        Title.setForeground(Color.WHITE);


        f.add(iX);
        f.add(iX_M60);
        f.add(i4);
        f.add(i4_M50);
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

        iX_M60.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iX_M60Click(e);
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
    }

    private void iXClick(ActionEvent evt) {
        new iXFrame();
    }
    private void iX_M60Click(ActionEvent evt) {
        new iXM60Frame();
    }
    private void i4Click(ActionEvent evt) {
        new i4Frame();
    }
    private void i4_M50Click(ActionEvent evt) {
        new i4M50Frame();
    }
}
