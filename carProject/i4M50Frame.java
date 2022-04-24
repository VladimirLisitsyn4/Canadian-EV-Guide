import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

public class i4M50Frame extends JFrame {

    private JFrame f = new JFrame("BMW i4 M50 xDRIVE");
    private JLabel Title = new JLabel("BMW i4 M50 xDRIVE");
    private JLabel Price = new JLabel("Price: $72,990");
    private JLabel Range = new JLabel("Range: 435km");
    private JLabel Charge = new JLabel("Charge Length: est. 11h");
    private JLabel Colours = new JLabel("Colourways: White, Black, Graphite, Blue, Grey, Red,");
    private JLabel Colourscont = new JLabel("                        Orange, Green");
    private JButton buy = new JButton("Purchase");

    public i4M50Frame() {
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

            BufferedImage img = ImageIO.read(MyFrame.class.getResource("images/BMW_i4_M50_xDrive.png"));
            JLabel pic = new JLabel(new ImageIcon(img));
            panel.add(pic);

            f.add(panel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        buy.setBounds(120, 415, 110, 25);
        Price.setBounds(30, 280, 400, 25);
        Range.setBounds(30, 310, 400, 25);
        Charge.setBounds(30, 340, 400, 25);
        Colours.setBounds(30, 370, 400, 25);
        Colourscont.setBounds(30, 390, 400, 25);
        Title.setBounds(110, 5, 1400, 23);
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
        f.add(Colourscont);
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

