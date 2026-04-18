package swings1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener {

    JButton button;
    JLabel label;

    public MouseEventExample() {
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        button = new JButton("Click Me");
        label = new JLabel("Perform mouse action");

        button.addMouseListener(this);

        add(button);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            label.setText("Double Click detected");
        } else {
            label.setText("Single Click detected");
        }
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}