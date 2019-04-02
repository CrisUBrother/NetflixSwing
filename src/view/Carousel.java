/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author anacvignola
 */
public class Carousel {
    
public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Netflix");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        
        JLabel jlogo = new JLabel(new ImageIcon("//home/anacvignola/NetBeansProjects/Netflix/src/img/logo-netflix-256.png"));
        JLabel jmenu = new JLabel("Browse");
        JLabel jcampo = new JLabel("");
        JLabel jbusca = new JLabel(new ImageIcon("//home/anacvignola/NetBeansProjects/Netflix/src/img/search-13-24.png"));
        JLabel jnotificacao= new JLabel(new ImageIcon("//home/anacvignola/NetBeansProjects/Netflix/src/img/icos8-notification-30.png"));
        JLabel jperfil = new JLabel(new ImageIcon("//home/anacvignola/NetBeansProjects/Netflix/src/img/user.png"));
        JLabel jseta = new JLabel(new ImageIcon("//home/anacvignola/NetBeansProjects/Netflix/src/img/seta_branca.png"));
        JLabel jrodape = new JLabel("rodape");
        
        JButton jb15 = new JButton("Movie 1");
        JButton jb16 = new JButton("Movie 2");
        JButton jb17 = new JButton("Movie 3");
        JButton jb18 = new JButton("Movie 4");
        JButton jb19 = new JButton("Movie 5");
        JButton jb20 = new JButton("Movie 6");
        JButton jb21 = new JButton("Movie 7");
        JButton jb22 = new JButton("Movie 8");
        JButton jb23 = new JButton("Movie 9");
        JButton jb24 = new JButton("Movie 10");
        JButton jb25 = new JButton("Movie 11");
        JButton jb26 = new JButton("Movie 12");
        
        JPanel topo = new JPanel();
        topo.setLayout(new FlowLayout ());
        topo.add(jlogo, FlowLayout.LEADING);
        topo.add(jmenu, FlowLayout.LEADING);
        topo.add(jcampo, FlowLayout.LEADING);
        topo.add(jbusca, FlowLayout.LEADING);
        topo.add(jnotificacao, FlowLayout.LEADING);
        topo.add(jperfil, FlowLayout.LEADING);
        topo.add(jseta, FlowLayout.LEADING);
        
        JPanel rodape = new JPanel();
        rodape.setLayout(new FlowLayout ());
        rodape.add(jrodape, FlowLayout.CENTER);
        //
        JPanel carousel = new JPanel();
        carousel.setLayout(new FlowLayout (FlowLayout.LEFT, 20, 20));
        carousel.add(jb15);
        carousel.add(jb16);
        carousel.add(jb17);
        carousel.add(jb18);
        carousel.add(jb19);
        carousel.add(jb20);
        carousel.add(jb21);
        carousel.add(jb22);
        carousel.add(jb23);
        carousel.add(jb24);
        carousel.add(jb25);
        carousel.add(jb26);
        
        
        main.add(topo, FlowLayout.CENTER);
        main.add(carousel, FlowLayout.CENTER);
        main.add(rodape, FlowLayout.CENTER);
        

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
}
    
}
