package practicals.graphics;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx extends Frame {

    ChoiceEx(){
        super("Choice Example");
        setVisible(true);
        setSize(300,200);
        setLayout(new GridLayout(2,1));

        Choice c = new Choice();
        c.add("Pen");
        c.add("Pencil");
        c.add("Eraser");
        add(c);

        Label lab = new Label();
        add(lab);
        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String val = e.getItem().toString();
                if (val == "Pen"){
                    lab.setText("Rs10");
                } else if (val == "Pencil") {
                    lab.setText("Rs5");
                } else if (val == "Eraser") {
                    lab.setText("Rs3");
                }
            }
        });
    }

    public static void main(String[] args) {
        new ChoiceEx();
    }
}
