// -- Mouse click count event handling -- //

import javax.swing.*; 
import java.awt.event.*;

public class Mouse_Click_Count extends JFrame implements MouseListener { 
    int count = 0; 
    JLabel label; 
    public Mouse_Click_Count() { 
        label = new JLabel("Click anywhere inside the window", JLabel.CENTER); 
        add(label); 
        addMouseListener(this); 
        setTitle("Mouse Click Counter"); 
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); 
    } 
    
    public void mouseClicked(MouseEvent e) { 
        count++; 
        label.setText("Mouse Click Count: " + count); 
    } 
    
    public void mousePressed(MouseEvent e) {} 
    public void mouseReleased(MouseEvent e) {} 
    public void mouseEntered(MouseEvent e) {} 
    public void mouseExited(MouseEvent e) {} 
    public static void main(String[] args) { 
        new Mouse_Click_Count(); 
    } 
}
