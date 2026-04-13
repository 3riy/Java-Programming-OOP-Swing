// -- Mouse press and release event handling -- //

import javax.swing.*; 
import java.awt.event.*; 

public class Mouse_Press_and_Release extends JFrame implements MouseListener { 
    JLabel label;

    public Mouse_Press_and_Release() { 
        label = new JLabel("Press or Release the Mouse", JLabel.CENTER); 
        add(label); 
        addMouseListener(this); 
        setTitle("Mouse Event Demo"); 
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); 
    } 
    
    public void mousePressed(MouseEvent e) { 
        label.setText("Mouse Pressed"); 
    } 

    public void mouseReleased(MouseEvent e) { 
        label.setText("Mouse Released"); 
    } 
    
    public void mouseClicked(MouseEvent e) {} 
    public void mouseEntered(MouseEvent e) {} 
    public void mouseExited(MouseEvent e) {} 
    public static void main(String[] args) { 
        new Mouse_Press_and_Release(); 
    } 
}
