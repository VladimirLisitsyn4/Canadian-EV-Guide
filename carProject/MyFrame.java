import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class MyFrame extends JFrame {
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

  private JButton Brands = new JButton("Brands");
  private JButton Price = new JButton("Price");
  private JButton Type = new JButton("Car Type");
  private JButton Exit = new JButton("Exit");
  private JLabel Title = new JLabel("Select Your Search Criteria");

  public MyFrame() {
    setTitle("The Canadian EV Guide");
    setSize(400, 200);
    setLocation(new Point(750, 250));
    setLayout(null);
    setResizable(false);

    try {
      BufferedImage backgroundImage = ImageIO.read(MyFrame.class.getResource("images/highway.jpg"));
      setContentPane(new ImagePanel(backgroundImage));
    } catch (IOException e) {
      e.printStackTrace();
    }

    initComponent();
    initEvent();
  }

  private void initComponent() {
    Exit.setBounds(300, 130, 80, 25);
    Brands.setBounds(50, 45, 80, 25);
    Price.setBounds(140, 45, 80, 25);
    Type.setBounds(230, 45, 100, 25);
    Title.setBounds(80, 10, 400, 25);
    Title.setFont(new Font("Serif", Font.BOLD, 20));
    Title.setForeground(Color.BLACK);
    Exit.setBackground(Color.BLACK);
    Exit.setForeground(Color.WHITE);
    Brands.setBackground(Color.BLACK);
    Brands.setForeground(Color.WHITE);
    Price.setBackground(Color.BLACK);
    Price.setForeground(Color.WHITE);
    Type.setBackground(Color.BLACK);
    Type.setForeground(Color.WHITE);

    add(Exit);
    add(Brands);
    add(Price);
    add(Type);
    add(Title);
  }

  private void initEvent() {

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(1);
      }
    });

    Exit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ExitClick(e);
      }
    });

    Brands.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        BrandsClick(e);
      }
    });

    Price.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        PriceClick(e);
      }
    });

    Type.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        TypeClick(e);
      }
    });
  }

  private void ExitClick(ActionEvent evt) {
    System.exit(0);
  }

  private void BrandsClick(ActionEvent evt) {
    new brandFrame();
  }

  private void PriceClick(ActionEvent evt) {
    new priceFrame();
  }

  private void TypeClick(ActionEvent evt) {
    new typeFrame();
  }

  public static void main(String[] args) {
    MyFrame f = new MyFrame();
    f.setVisible(true);
  }
}