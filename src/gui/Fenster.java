package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {
    private JButton bBombe;
    private JPanel pMain;
    private int counter;

    public Fenster() {
        super(); // ruft den Konstruktur von JFrame auf, muss 1. Zeile sein

        counter = 0;

        bBombe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                if (counter % 10 == 0) {
                    JOptionPane.showMessageDialog(null, "Bumm!");
                }
            }
        });

        add(pMain);

        setSize(800, 600);
        setTitle("Sortierer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e) {
            System.err.println(e.getCause());
        }

        setVisible(true); // sollte am Ende stehen
    }

    public static void main(String[] args) {
        new Fenster();
    }
}
