package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.images.ImageStore;

public class IDemoCanvas extends JPanel{
    private static final long serialVersionUID = 1L;

    private IDemoPanel panel;

    public IDemoCanvas(IDemoPanel panel) {
        this.panel = panel;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(ImageStore.airplane, null, 50, 50);
    }

}
