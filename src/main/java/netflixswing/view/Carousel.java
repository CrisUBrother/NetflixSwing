package netflixswing.view;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Carousel extends javax.swing.JPanel {

    public static void main(String[] args) throws IOException {

        BufferedImage image = ImageIO.read(new File("/netflixswing/view/gradientblack.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(image));
    }

}
