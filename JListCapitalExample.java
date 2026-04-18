package exp6exeSwings;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListCapitalExample extends JFrame {

    JList<String> countryList;

    public JListCapitalExample() {

        // ================= MODEL =================
        DefaultListModel<String> model = new DefaultListModel<>();

        // Add countries
        model.addElement("USA");
        model.addElement("India");
        model.addElement("Vietnam");
        model.addElement("Canada");
        model.addElement("Denmark");
        model.addElement("France");
        model.addElement("Great Britain");
        model.addElement("Japan");
        model.addElement("Africa");
        model.addElement("Greenland");
        model.addElement("Singapore");

        // ================= JLIST =================
        countryList = new JList<>(model);

        // Allow single selection
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // ================= CAPITAL MAP =================
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // ================= EVENT =================
        countryList.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {

                    String country = countryList.getSelectedValue();

                    // Print exact required output
                    System.out.println("Capital of " + country + " is: " + capitals.get(country));
                }
            }
        });

        // ================= ADD COMPONENT =================
        add(new JScrollPane(countryList));

        // ================= FRAME =================
        setTitle("Country List");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListCapitalExample();
    }
}