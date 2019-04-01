package netflixswing.view;


import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Background {

    public static void maian(String[] args) throws IOException {

        //PUT YOUR DIRECTORY'S FIRST STEPS
        BufferedImage img = ImageIO.read(new File("C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/gradientblack.jpg"));
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
