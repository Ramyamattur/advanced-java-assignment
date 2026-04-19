//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).
package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Button Event Handling");

        // Create Buttons
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");

        // Create Label to display message
        JLabel label = new JLabel("Press a button");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setHorizontalAlignment(JLabel.CENTER);

        // Set Layout
        frame.setLayout(new FlowLayout());

        // Add Action Listener for India Button
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Add Action Listener for Srilanka Button
        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Frame settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}