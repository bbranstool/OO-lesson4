package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.IDemoEventListener;
import model.idemo.Airplane;
import model.idemo.Bird;
import model.idemo.Car;
import model.idemo.Dog;
import model.idemo.IRender;
import model.images.ImageStore;

public class IDemoPanel {
    
    private JFrame window;
    private JButton quitButton = new JButton("Quit");
    private IDemoCanvas canvas;

    public IDemoPanel(JFrame window) {
        this.window = window;
    }

    public void init() {
        window.setTitle("Demo Panel");
        Container cp = window.getContentPane();

        canvas = new IDemoCanvas(this);

        JPanel southPanel = new JPanel();
        southPanel.add(quitButton);

        cp.add(canvas, BorderLayout.CENTER);
        cp.add(southPanel, BorderLayout.SOUTH);

        populatePicture();

        IDemoEventListener listener = new IDemoEventListener(this);
        canvas.addMouseListener(listener);
        canvas.addKeyListener(listener);
        canvas.requestFocusInWindow();
        canvas.setFocusable(true);

        //Set focusable config
        quitButton.setFocusable(false);
    }

    private void populatePicture() {
        ArrayList<IRender> pics = canvas.getPictures();

        Car v1 = new Car(50, 50, "Ford", 9000, "SUV");
        v1.setImage(ImageStore.car);
        pics.add(v1);

        Airplane v2 = new Airplane(150, 50, "Boeing", 1200000, 350);
        v2.setImage(ImageStore.airplane);
        pics.add(v2);

        Bird v3 = new Bird(150, 150, "Eagle", 5, 10);
        v3.setImage(ImageStore.bird);
        pics.add(v3);

        Dog v4 = new Dog(50, 150, "Bulldog", 3, "white");
        v4.setImage(ImageStore.dog);
        pics.add(v4);
    }

    public IDemoCanvas getCanvas() {
        return canvas;
    }
}
