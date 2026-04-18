package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample extends JFrame implements ActionListener {

    JButton digitalClockBtn, hourGlassBtn;
    JLabel messageLabel;

    public ImageButtonExample() {
        setTitle("Image Button Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Load images (place images in project folder)
        ImageIcon digitalIcon = new ImageIcon("digital.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        digitalClockBtn = new JButton(digitalIcon);
        hourGlassBtn = new JButton(hourGlassIcon);

        // Label to display message
        messageLabel = new JLabel("Click a button");

        // Add ActionListener
        digitalClockBtn.addActionListener(this);
        hourGlassBtn.addActionListener(this);

        add(digitalClockBtn);
        add(hourGlassBtn);
        add(messageLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalClockBtn) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == hourGlassBtn) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}