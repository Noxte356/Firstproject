package Swing;

import javax.swing.*;
import java.awt.*;

public class CirclePanel extends JPanel {
    int factor;

    public CirclePanel(int factor) {
        this.factor = factor;
    }

    public void paintComponent(Graphics g) {
        this.setBackground(Color.white);

        g.setColor(Color.magenta);
        g.drawOval(10,50,100*factor,100*factor);
    }
}
