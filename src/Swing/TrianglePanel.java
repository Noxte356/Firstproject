package Swing;

import javax.swing.*;
import java.awt.*;

public class TrianglePanel extends JPanel {
    int factor;

    public TrianglePanel(int factor) {
        this.factor = factor;
    }

    public void paintComponent(Graphics g) {
        this.setBackground(Color.white);

        g.setColor(Color.magenta);
        g.drawPolygon(new int[]{10,20,30},new int[]{100,50,100},3);
    }
}
