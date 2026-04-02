// -- JCheckbox -- //

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckbox_Component {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckbox Component");

        JLabel label = new JLabel("Checkboxes:");
        label.setBounds(50, 20, 200, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.BLUE);
        frame.add(label);

        // -- JCheckbox -- //

        // JCheckBox checkbox_name = new JCheckBox("Text") - Creates a checkbox with a label
        JCheckBox cb1 = new JCheckBox("Java");
        cb1.setBounds(50, 60, 100, 30);

        JCheckBox cb2 = new JCheckBox("Python");
        cb2.setBounds(50, 100, 100, 30);
        
        // checkbox_name.setSelected(true) - Sets the checkbox to be checked by default
        cb2.setSelected(true);

        // frame.add(checkbox_name) - Adds the checkbox to the frame
        frame.add(cb1);
        frame.add(cb2);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}