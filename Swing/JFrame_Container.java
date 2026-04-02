// -- JFrame -- //

import javax.swing.JFrame;

public class JFrame_Container {
    public static void main(String[] args) {

        // JFrame frame_name = new JFrame("Name") - Creates a JFrame/Window
        JFrame frame = new JFrame("My First Frame");

        // frame.setSize(width, height) - Sets size of frame
        frame.setSize(400, 300);

        // frame.setlayout(LayoutManager layout)
        frame.setLayout(null);

        // frame.setVisible(boolean) - Sets visibility of frame (on/off)
        frame.setVisible(true);

        // frame.setDefaultCloseOperation(int operation) - Sets operation/action on frame close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}