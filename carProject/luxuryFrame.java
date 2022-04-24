import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class luxuryFrame extends JFrame {
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

    private JFrame f = new JFrame("Luxury Vehicles");
    private JLabel Title = new JLabel("Luxury Vehicles");
    private JButton iX = new JButton("BMW iX M60");
    private JButton HSE = new JButton("Jaguar I-PACE HSE");
    private JButton S = new JButton("Tesla Model S");
    private JButton X = new JButton("Tesla Model X");

    public luxuryFrame() {
        f.setSize(400, 200);
        f.setLocation(new Point(750, 250));
        f.setLayout(null);
        f.setResizable(false);

        try {
            BufferedImage backgroundImage = ImageIO.read(MyFrame.class.getResource("images/luxury.png"));
            f.setContentPane(new ImagePanel(backgroundImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        initComponent();
        initEvent();
        f.setVisible(true);
    }

    private void initComponent() {
        iX.setBounds(55, 75, 110, 25);
        HSE.setBounds(180, 75, 150, 25);
        S.setBounds(50, 105, 120, 25);
        X.setBounds(190, 105, 120, 25);
        Title.setBounds(120, 30, 140, 23);
        iX.setBackground(Color.BLACK);
        iX.setForeground(Color.WHITE);
        HSE.setBackground(Color.BLACK);
        HSE.setForeground(Color.WHITE);
        S.setBackground(Color.BLACK);
        S.setForeground(Color.WHITE);
        X.setBackground(Color.BLACK);
        X.setForeground(Color.WHITE);
        Title.setFont(new Font("Serif", Font.BOLD, 20));
        Title.setBackground(Color.BLACK);
        Title.setOpaque(true);
        Title.setForeground(Color.WHITE);


        f.add(iX);
        f.add(HSE);
        f.add(S);
        f.add(X);
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

        HSE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HSEClick(e);
            }
        });

        S.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SClick(e);
            }
        });

        X.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                xClick(e);
            }
        });
    }

    private void iXClick(ActionEvent evt) {
        new iXFrame();
    }
    private void HSEClick(ActionEvent evt) {
        new hseFrame();
    }
    private void SClick(ActionEvent evt) {
        new sFrame();
    }
    private void xClick(ActionEvent evt) {
        new xFrame();
    }
}

