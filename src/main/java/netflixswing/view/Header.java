package netflixswing.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header {

	public static void main(String[] args) throws IOException {
		
		
		// CREATING THE BASE FRAME
		JFrame jframe = new JFrame("NetFlix");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setExtendedState(jframe.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		
		
		// FETCHING IMAGES
		BufferedImage iconNetflix = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-icon.png"));
		JLabel netflixIcon = new JLabel();
		netflixIcon.setIcon(new ImageIcon(iconNetflix));
		
		BufferedImage homeIcon = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-icon-home.png"));
		JLabel homeIconLabel = new JLabel();
		homeIconLabel.setIcon(new ImageIcon(homeIcon));
		
		BufferedImage menuListIcon = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-icon-TVShows-Movies-RecentlyAdded.png"));
		JLabel menuListIconLabel = new JLabel();
		menuListIconLabel.setIcon(new ImageIcon(menuListIcon));
		
		BufferedImage myListIcon = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-icon-MyList.png"));
		JLabel myListLabel = new JLabel();
		myListLabel.setIcon(new ImageIcon(myListIcon));
		
		BufferedImage searchBar = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-searchBar.png"));
		JLabel searchBarLabel = new JLabel();
		searchBarLabel.setIcon(new ImageIcon(searchBar));
		
		BufferedImage magnifierIcon = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-icon-search.png"));
		JLabel magnifierLabel = new JLabel();
		magnifierLabel.setIcon(new ImageIcon(magnifierIcon));
		
		BufferedImage notificationIcon = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-icon-notification.png"));
		JLabel notificationIconLabel = new JLabel();
		notificationIconLabel.setIcon(new ImageIcon(notificationIcon));
		
		BufferedImage userIcon = ImageIO.read(new File(
				"C:/Users/rfarias/Documents/ProgramacaoII/NetflixSwing/src/main/java/netflixswing/view/icons/newIcons/netflix-icon-user.png"));
		JLabel userIconLabel = new JLabel();
		userIconLabel.setIcon(new ImageIcon(userIcon));
		
		
		
		
		// ASSIGNING IMAGES INSIDE PANELS
		JPanel jpanel1 = new JPanel();
		jpanel1.add(netflixIcon);
		jpanel1.add(homeIconLabel);
		jpanel1.add(homeIconLabel);
		jpanel1.add(menuListIconLabel);
		jpanel1.add(myListLabel);
		jpanel1.add(searchBarLabel);
		jpanel1.add(magnifierLabel);
		jpanel1.add(notificationIconLabel);
		jpanel1.add(userIconLabel);

		
		// ASSIGNING COLOR TO BACKGROUND
		jpanel1.setBackground(new Color(20, 20, 20));
		
		
		// ASSIGNING PANELS INSIDE THE FRAME
		jframe.setLayout(new GridLayout(1, 8, 0, 0));
		jframe.add(jpanel1);
		
		
		// SETTING UP FINAL CONFIGURATIONS
		jframe.pack();
		jframe.setVisible(true);
	}
}
