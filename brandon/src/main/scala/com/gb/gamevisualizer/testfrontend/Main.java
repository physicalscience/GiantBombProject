package com.gb.gamevisualizer.testfrontend;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;

import com.gb.gamevisualizer.game.GameRetrieve;
import net.miginfocom.swing.MigLayout;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new MigLayout("", "[]", "[][]"));
        JTextField textField = new JFormattedTextField();
        JButton button = new JButton("Run");

        button.addActionListener(a -> {
            GameRetrieve retrieve = new GameRetrieve();
            JSONObject object = retrieve.searchGames(textField.getText());

            JSONArray names = object.getJSONArray("results");
            names.forEach(n -> System.out.println(n.toString()));
        });

        textField.setPreferredSize(new Dimension(100, 10));
        panel.add(textField, "cell 0 0, gapleft 30px");
        panel.add(button, "cell 0 1, gapleft 50px");

        frame.add(panel);
        frame.setPreferredSize(new Dimension(200, 150));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
