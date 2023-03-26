package practicals.graphics;

import java.awt.*;
import java.awt.event.*;

public class Form extends Frame {
    Form(){
        super("Form");
        setSize(200,200);
        setVisible(true);
        setLayout(new GridLayout(4,2));

        add(new Label("Enter Name:"));

        TextField nameInput = new TextField();
        add(nameInput);

        add(new Label("Enter Age:"));

        TextField ageInput = new TextField();
        add(ageInput);

        Button saveButton = new Button("Save");
        add(saveButton);
        Button cancelButton = new Button("Cancel");
        add(cancelButton);

        add(new Label("Result:"));

        Label resultField = new Label();
        add(resultField);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = String.format("%s is %s year(s) old", nameInput.getText(), ageInput.getText());
                resultField.setText(msg);
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameInput.setText("");
                ageInput.setText("");
                resultField.setText("");
            }
        });

        nameInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                //validate name field so that it is in upper case
                char c = Character.toUpperCase(e.getKeyChar());
                e.setKeyChar(c);
            }
        });
    }

    public static void main(String[] args) {
        new Form();
    }
}
