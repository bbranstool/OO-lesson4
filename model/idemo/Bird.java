package model.idemo;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bird extends Animal{

    private int wingspan;

    public Bird(int x, int y, String name, int age, int wingspan) {
        super(x, y, name, age);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return "[Bird] " + super.toString() + ", wingspan = " + wingspan;
    }

    @Override
    public String getSound() {
        return "[Bird] chirrrrrrr r ~~~~~~ ing";
    }

    @Override
    public void render(Graphics2D g2) {
        g2.drawImage(getImage(), null, getX(), getY());
        g2.setColor(Color.YELLOW);
        g2.drawString("Wingspan=" + wingspan, getX(), getY());
    }
    
}
