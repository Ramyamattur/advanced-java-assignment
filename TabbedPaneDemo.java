//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display the concerned color whenever the specific tab is selected in the Pan.

package swingdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Tabbed Pane Color Demo");

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels for each tab
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Set Background Colors
        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Optional: Event handling when tab changes
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);
                System.out.println("Selected Tab: " + title);
            }
        });

        // Add tabbedPane to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}