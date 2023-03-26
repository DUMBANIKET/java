package practicals.graphics;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse extends Frame {

    Mouse(){
        super("Mouse Event");
        setSize(200,200);
        setVisible(true);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setBackground(Color.BLUE);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(Color.GREEN);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(Color.YELLOW);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Color.DARK_GRAY);
            }
        });
    }

    public static void main(String[] args) {
        new Mouse();
    }
}
