package Shapes;

import Swing.SquarePanel;

import javax.swing.*;
import java.awt.*;

public class Square extends Shape {
    int side;

    public Square(int factor) {
        super.name = "Квадрат";
        this.side=side;
    }

    @Override
    public void drawShape(int factor) {
        JFrame frame = new JFrame("Фигурки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SquarePanel squarePanel = new SquarePanel(factor);
        squarePanel.setBackground(Color.white);
        frame.add(squarePanel);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
