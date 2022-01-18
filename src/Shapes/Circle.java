package Shapes;

import Swing.CirclePanel;
import Swing.SquarePanel;

import javax.swing.*;
import java.awt.*;

public class Circle extends Shape {
    public Circle() {
        super.name = "Круг";
    }

    @Override

    public void drawShape(int factor) {
        JFrame frame = new JFrame("Фигурки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CirclePanel circlePanel = new CirclePanel(factor);
        circlePanel.setBackground(Color.white);
        frame.add(circlePanel);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
