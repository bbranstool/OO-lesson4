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
        cp.add(panel, BorderLayout.CENTER);

        JButton questionButton = new JButton("Question Classes");
        JButton shapeButton = new JButton("Shape classes");
        panel.add(questionButton);
        panel.add(shapeButton);

        questionButton.addActionListener(e -> {
            window.getContentPane().removeAll();
            QuestionPanel questionPanel = new QuestionPanel(window);
            questionPanel.init();
            window.pack();
            window.revalidate();
        });

        shapeButton.addActionListener(e -> {
            window.getContentPane().removeAll();
            // TriangleDrawingPanel triangle = new TriangleDrawingPanel(window);
            // triangle.init();
            window.pack();
            window.revalidate();
        });
    }

}
