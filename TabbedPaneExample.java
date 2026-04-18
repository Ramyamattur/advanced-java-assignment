package Swings;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class TabbedPaneExample extends JFrame {

    public TabbedPaneExample() {

        // ================= CREATE TABBED PANE =================
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with colors
        JPanel p1 = new JPanel();
        p1.setBackground(Color.CYAN);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.MAGENTA);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.add("Cyan", p1);
        tabbedPane.add("Magenta", p2);
        tabbedPane.add("Yellow", p3);

        // ================= EVENT HANDLING =================
        tabbedPane.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);

                // Print selected tab color
                System.out.println("Selected Tab: " + title);
            }
        });

        // ================= ADD COMPONENT =================
        add(tabbedPane);

        // ================= FRAME =================
        setTitle("Tabbed Pane Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}