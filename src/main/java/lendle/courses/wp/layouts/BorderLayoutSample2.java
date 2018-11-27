/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class BorderLayoutSample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        BorderLayout layout=new BorderLayout();
        frame.setLayout(layout);
        
        //1. create five CustomComponents, add them to North, West, South, East, Center
        //2. change the preferred size of CustomComponent
        JButton button1 = new JButton("1");
        button1.setPreferredSize(new Dimension(100, 100));
        frame.add(button1,"North");
        JButton button2 = new JButton("2");
        button2.setPreferredSize(new Dimension(100, 100));
        frame.add(button2,"West");
        JButton button3 = new JButton("3");
        button3.setPreferredSize(new Dimension(100, 100));
        frame.add(button3,"South");
        JButton button4 = new JButton("4");
        button4.setPreferredSize(new Dimension(100, 100));
        frame.add(button4,"East");
        CustomComponent component = new CustomComponent();
        frame.add(component);        
        frame.setLocationRelativeTo(null);
        //////////////////////////////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
