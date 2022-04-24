import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class priceFrame extends JFrame {
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

    private JFrame f = new JFrame("Price Range");
    private JButton BMW = new JButton("<45K");
    private JButton Tesla = new JButton("45-90K");
    private JButton Other = new JButton(">90K");
    private JLabel Title = new JLabel("Price Range");

    public priceFrame() {
        f.setSize(400, 200);
        f.setLocation(new Point(750, 250));
        f.setLayout(null);
        f.setResizable(false);

        try {
            BufferedImage backgroundImage = ImageIO.read(MyFrame.class.getResource("images/showroom.png"));
            f.setContentPane(new ImagePanel(backgroundImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        initComponent();
        initEvent();
        f.setVisible(true);
    }

    private void initComponent() {
        BMW.setBounds(60, 75, 80, 25);
        Tesla.setBounds(150, 75, 100, 25);
        Other.setBounds(260, 75, 80, 25);
        Title.setBounds(145, 25, 400, 23);
        BMW.setBackground(Color.BLACK);
        BMW.setForeground(Color.WHITE);
        Tesla.setBackground(Color.BLACK);
        Tesla.setForeground(Color.WHITE);
        Other.setBackground(Color.BLACK);
        Other.setForeground(Color.WHITE);
        Title.setFont(new Font("Serif", Font.BOLD, 20));
        Title.setForeground(Color.WHITE);

        f.add(BMW);
        f.add(Tesla);
        f.add(Other);
        f.add(Title);
    }

    private void initEvent() {

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

        BMW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BMWClick(e);
            }
        });

        Tesla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TeslaClick(e);
            }
        });

        Other.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OtherClick(e);
            }
        });
    }

    private void BMWClick(ActionEvent evt) {
        new budgetFrame();
    }
    private void TeslaClick(ActionEvent evt) {
        new midFrame();
    }
    private void OtherClick(ActionEvent evt) {
        new luxuryFrame();
    }
}
