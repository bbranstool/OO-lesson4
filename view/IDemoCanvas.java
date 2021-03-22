package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.idemo.IRender;

public class IDemoCanvas extends JPanel{
    private static final long serialVersionUID = 1L;

    private IDemoPanel panel;
    private ArrayList<IRender> pictures = new ArrayList<IRender>();
    private int selectedIndex = -1;

    public IDemoCanvas(IDemoPanel panel) {
        this.panel = panel;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < pictures.size(); i++) {
            IRender pic = pictures.get(i);
            pic.render(g2);
            if (i == selectedIndex) {
                g2.setStroke(new BasicStroke(5));
                g2.setColor(Color.RED);
                g2.draw(pic.getBoundingBox());
            }

        }
    }

    public ArrayList<IRender> getPictures() {
        return pictures;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

}
