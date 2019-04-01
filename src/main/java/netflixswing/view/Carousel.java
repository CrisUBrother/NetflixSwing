package netflixswing.view;

import javax.swing.*;
import java.awt.*;

public class Carousel {


    public Object Carousel() {
        //public static void main(String[] args)  {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button1"), gbc);


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        return frame;
    }
}
