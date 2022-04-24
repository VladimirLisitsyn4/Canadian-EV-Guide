import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

public class leafFrame extends JFrame {

    private JFrame f = new JFrame("Nissan Leaf SV");
    private JLabel Title = new JLabel("Nissan Leaf SV");
    private JLabel Price = new JLabel("Price: $37,498");
    private JLabel Range = new JLabel("Range: 363km");
    private JLabel Charge = new JLabel("Charge Length: est. 8h");
    private JLabel Colours = new JLabel("Colourways: White, Black, Blue, Grey, Red");
    private JButton buy = new JButton("Purchase");

    public leafFrame() {
        f.setSize(400, 500);
        f.setLocation(new Point(750, 250));
        f.setLayout(null);
        f.setResizable(false);

        initComponent();
        initEvent();
        f.setVisible(true);
    }

    private void initComponent() {

        try {
            JPanel panel = new JPanel();
            panel.setBounds(0, 30, 350, 250);

            BufferedImage img = ImageIO.read(MyFrame.class.getResource("images/Nissan_Leaf_SV.png"));
            JLabel pic = new JLabel(new ImageIcon(img));
            panel.add(pic);

            f.add(panel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        buy.setBounds(120, 410, 110, 25);
        Price.setBounds(30, 280, 400, 25);
        Range.setBounds(30, 310, 400, 25);
        Charge.setBounds(30, 340, 400, 25);
        Colours.setBounds(30, 370, 400, 25);
        Title.setBounds(130, 5, 1400, 23);
        buy.setBackground(Color.BLACK);
        buy.setForeground(Color.WHITE);
        Title.setFont(new Font("Serif", Font.BOLD, 20));
        Title.setForeground(Color.BLACK);
        Price.setForeground(Color.BLACK);
        Range.setForeground(Color.BLACK);
        Charge.setForeground(Color.BLACK);
        Colours.setForeground(Color.BLACK);

        f.add(Price);
        f.add(Range);
        f.add(Charge);
        f.add(Colours);
        f.add(buy);
        f.add(Title);
    }

    private void initEvent() {

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

        buy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                purchaseClick(e);
            }
        });
    }

    private void purchaseClick(ActionEvent evt) {
    }
}


