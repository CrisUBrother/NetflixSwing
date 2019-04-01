package netflixswing.view;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Carousel extends javax.swing.JPanel {

    public void setBackgroundImage() throws IOException {

        //PUT YOUR DIRECTORY'S FIRST STEPS
        BufferedImage img = ImageIO.read(new File("PUT_YOUR_DIRECTORY_PATH/Documents/NetflixSwing/src/main/java/netflixswing/view/gradientblack.jpg"));
        ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1200, 1300);
        frame.setExtendedState( frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
