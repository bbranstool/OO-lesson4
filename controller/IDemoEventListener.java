package controller;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import model.idemo.IRender;
import view.IDemoPanel;

public class IDemoEventListener implements MouseListener,KeyListener{

    private IDemoPanel panel;

    public IDemoEventListener(IDemoPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mousePressed(MouseEvent e) {    
        ArrayList<IRender> pictures = panel.getCanvas().getPictures();
        for (int i = 0; i < pictures.size(); i++) {
            Rectangle r = pictures.get(i).getBoundingBox();
            if (r.contains(e.getX(), e.getY())) {
                panel.getCanvas().setSelectedIndex(i);
                panel.getCanvas().repaint();
                return;
            }
        }

        panel.getCanvas().setSelectedIndex(-1);
        panel.getCanvas().repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_UP:
                break;
            case KeyEvent.VK_DOWN:
                break;

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
    
}
