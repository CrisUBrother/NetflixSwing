package netflixswing.view;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Background {

    public static void main(String[] args) throws IOException {

        //PUT YOUR DIRECTORY'S FIRST STEPS
        BufferedImage img = ImageIO.read(new File("/home/naipe/Documents/NetflixSwing/src/main/java/netflixswing/view/gradientblack.jpg"));
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1200, 1300);
        frame.setExtendedState( frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        JLabel jlabel = new JLabel();
        jlabel.setIcon(new ImageIcon(img));
        frame.add(jlabel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
