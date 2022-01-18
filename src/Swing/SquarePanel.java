package Swing;
import java.awt.*;
import javax.swing.*;

public class SquarePanel extends JPanel{
    int factor;

    public SquarePanel(int factor) {
        this.factor = factor;
    }

    public void paintComponent(Graphics g) {
        this.setBackground(Color.white);

        g.setColor(Color.magenta);
        g.drawRect(10,50,100*factor,100*factor);
    }
}
