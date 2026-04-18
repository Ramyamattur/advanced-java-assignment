package Swings1;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonExample {

    JLabel l1; // Label to display message

    ButtonExample() {

        // Create JFrame
        JFrame f = new JFrame("Button Example");

        // Create JLabel
        l1 = new JLabel();
        l1.setBounds(50, 50, 400, 80); // position and size
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30)); // set font

        // Create Buttons
        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Sri Lanka");

        // Set button positions
        b1.setBounds(80, 150, 120, 50);
        b2.setBounds(220, 150, 120, 50);

        // Add ActionListener to Button 1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Set text when button clicked
                l1.setText("India is pressed");
            }
        });

        // Add ActionListener to Button 2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Set text when button clicked
                l1.setText("Sri Lanka is pressed");
            }
        });

        // Add components to frame
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // Frame settings
        f.setSize(450, 300); // increased size for proper display
        f.setLayout(null);   // using absolute positioning
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        // Create object to run program
        new ButtonExample();
    }
}