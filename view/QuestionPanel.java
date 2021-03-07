package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuestionPanel {
    
    private JFrame window;

    private JButton nextButton = new JButton("Next");
    private JButton prevButton = new JButton("Previous");
    private JButton quitButton = new JButton("Quit");

    private JButton enterButton = new JButton("Enter");
    private JTextField asnwerField = new JTextField(20);

    private QuestionCanvas canvas;

    public QuestionPanel(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2, 1));
        cp.add(southPanel, BorderLayout.SOUTH);

        JPanel south1 = new JPanel();
        south1.add(new JLabel("Answer: "));
        south1.add(asnwerField);
        south1.add(enterButton);
        southPanel.add(south1);

        JPanel south2 = new JPanel();
        south2.add(prevButton);
        south2.add(nextButton);
        south2.add(quitButton);
        southPanel.add(south2);

        canvas = new QuestionCanvas(this);
        cp.add(canvas, BorderLayout.CENTER);
        
    }

}
