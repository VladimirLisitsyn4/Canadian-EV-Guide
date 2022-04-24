import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class budgetFrame extends JFrame {
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

    private JFrame f = new JFrame("Budget Vehicles");
    private JLabel Title = new JLabel("Budget Vehicles");
    private JButton Niro = new JButton("Kia Niro Ev");
    private JButton Soul = new JButton("Kia Soul Ev");
    private JButton Leaf = new JButton("Nissan Leaf SV");
    private JButton Leafp = new JButton("Nissan Leaf SV +");

    public budgetFrame() {
        f.setSize(400, 200);
        f.setLocation(new Point(750, 250));
        f.setLayout(null);
        f.setResizable(false);

        try {
            BufferedImage backgroundImage = ImageIO.read(MyFrame.class.getResource("images/budget.png"));
            f.setContentPane(new ImagePanel(backgroundImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        initComponent();
        initEvent();
        f.setVisible(true);
    }

    private void initComponent() {
        Niro.setBounds(60, 75, 110, 25);
        Soul.setBounds(210, 75, 110, 25);
        Leaf.setBounds(50, 105, 130, 25);
        Leafp.setBounds(200, 105, 130, 25);
        Title.setBounds(120, 30, 140, 23);
        Niro.setBackground(Color.BLACK);
        Niro.setForeground(Color.WHITE);
        Soul.setBackground(Color.BLACK);
        Soul.setForeground(Color.WHITE);
        Leaf.setBackground(Color.BLACK);
        Leaf.setForeground(Color.WHITE);
        Leafp.setBackground(Color.BLACK);
        Leafp.setForeground(Color.WHITE);
        Title.setFont(new Font("Serif", Font.BOLD, 20));
        Title.setBackground(Color.BLACK);
        Title.setOpaque(true);
        Title.setForeground(Color.WHITE);


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

        Niro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NiroClick(e);
            }
        });

        Soul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SoulClick(e);
            }
        });

        Leaf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LeafClick(e);
            }
        });

        Leafp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LeafpClick(e);
            }
        });
    }

    private void NiroClick(ActionEvent evt) {
        new niroFrame();
    }
    private void SoulClick(ActionEvent evt) {
        new soulFrame();
    }
    private void LeafClick(ActionEvent evt) {
        new leafFrame();
    }
    private void LeafpClick(ActionEvent evt) {
        new leafpFrame();
    }
}
