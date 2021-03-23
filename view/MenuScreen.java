package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {

    private JFrame window;
    
    public MenuScreen(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();
    
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 200));
        panel.setLayout(new GridLayout(2, 1));

        JButton idemoButton = new JButton("Interface Demo");
        idemoButton.addActionListener(event -> {
            window.getContentPane().removeAll();
            IDemoPanel demoPanel = new IDemoPanel(window);
            demoPanel.init();

            window.pack();
            window.revalidate();
        });
        JButton drawingButton = new JButton("Drawing Demo");
        drawingButton.addActionListener(event -> {
            window.getContentPane().removeAll();
            DrawingDemoPanel drawingPanel = new DrawingDemoPanel(window);
            drawingPanel.init();

            window.pack();
            window.revalidate();
        });
        panel.add(idemoButton);
        panel.add(drawingButton);

        cp.add(panel, BorderLayout.CENTER);

    }

}
