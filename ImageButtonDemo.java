//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).

package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Image Button Demo");

        // Load Images (Make sure images are in project folder or give correct path)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with Images
        JButton btnClock = new JButton(clockIcon);
        JButton btnHourglass = new JButton(hourglassIcon);

        // Create Label
        JLabel label = new JLabel("Click an image");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setHorizontalAlignment(JLabel.CENTER);

        // Layout
        frame.setLayout(new FlowLayout());

        // Event Handling for Digital Clock
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Event Handling for Hour Glass
        btnHourglass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(btnClock);
        frame.add(btnHourglass);
        frame.add(label);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}