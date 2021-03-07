package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ShapeEventListener;

public class ShapePanel {
    
    private JFrame window;

    private JButton exitButton = new JButton("Exit");
    private JButton randomShapeButton = new JButton("Random Shape");

    private ShapeCanvas canvas;

    public ShapePanel(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();
        JPanel southPanel = new JPanel();
        cp.add(southPanel, BorderLayout.SOUTH);

        southPanel.add(randomShapeButton);
        southPanel.add(exitButton);

        canvas = new ShapeCanvas(this);
        cp.add(canvas, BorderLayout.CENTER);

        ShapeEventListener listener = new ShapeEventListener(this);
        randomShapeButton.addActionListener(listener);
        exitButton.addActionListener(listener);

    }

    public JButton getRandomShapeButton() {
        return randomShapeButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public ShapeCanvas getCanvas() {
        return canvas;
    }

    public JFrame getWindow() {
        return window;
    }

}
