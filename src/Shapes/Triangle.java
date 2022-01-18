package Shapes;
import Swing.SquarePanel;
import Swing.TrianglePanel;

import java.awt.*;
import javax.swing.*;
public class Triangle extends Shape {
    public Triangle() {
        super.name = "Треугольник";
    }

    @Override
    public void drawShape(int factor) {
        JFrame frame = new JFrame("Фигурки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TrianglePanel trianglePanel = new TrianglePanel(factor);
        trianglePanel.setBackground(Color.white);
        frame.add(trianglePanel);
        frame.setSize(500,300);
        frame.setVisible(true);

    }
}
