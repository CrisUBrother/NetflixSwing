package netflixswing.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Header {

	public static void main(String[] args) throws IOException {

		JFrame frame = new JFrame("NetFlix");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);

		Box titleText = Box.createHorizontalBox();
		JLabel title = new JLabel("<html><span style='color: Red;'>NetFlix</span></html>");
		BufferedImage img = ImageIO
				.read(new File("C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/gradientblack.jpg"));
		JLabel jlabel = new JLabel();
		title.setFont(title.getFont().deriveFont(64.0f));
		// JLabel version = new
		// JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Version
		// 1.0<br>Created by Luke Carr</html>");
		// JLabel slogan = new JLabel("<html>Full Potential<br>Minimal Knowledge</html>");
		// titleText.add(version);
		jlabel.setIcon(new ImageIcon(img));
		titleText.add(title);
		// titleText.add(slogan);
		titleText.setAlignmentX(frame.getWidth() / 2);

		/*
		 * Box inputContent = Box.createHorizontalBox(); JTextArea code = new JTextArea(35,65); code.setEditable(true);
		 * code.setBorder(null); inputContent.add(code);
		 */
		frame.add(jlabel);
		frame.add(titleText);
		// frame.add(inputContent);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	    frame.getLayeredPane().add(title,JLayeredPane.PALETTE_LAYER);	
	}
}
