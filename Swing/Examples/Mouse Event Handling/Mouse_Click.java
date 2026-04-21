// -- Mouse click event handling -- //

import javax.swing.*;
import java.awt.event.*;

public class Mouse_Click { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Mouse Click Event Handling"); 
        JLabel label = new JLabel("Click anywhere"); 
        label.setBounds(100, 100, 200, 30); 
        frame.add(l); 
        frame.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
                label.setText("Clicked at: " + e.getX() + "," + e.getY()); 
            } 
        }); 
        frame.setSize(400, 300); 
        frame.setLayout(null); 
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}
