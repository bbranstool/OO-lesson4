package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Circle;
import model.Rectangle;
import model.Shape;

public class ShapeCanvas extends JPanel{

    private static final long serialVersionUID = 1L;

    private ShapePanel panel;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCanvas(ShapePanel panel) {
        this.panel = panel;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);

        shapes.add(new Circle(50, 50, Color.YELLOW, 50));
        shapes.add(new Rectangle(100, 100, Color.red, 70, 90));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.render(g2);
        }
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

}
