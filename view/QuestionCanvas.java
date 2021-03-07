package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.Question;
import model.QuestionBank;

public class QuestionCanvas extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int questionIndex = -1;

    public QuestionCanvas() {
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        if (questionIndex >= 0) {
            Question q = QuestionBank.database.get(questionIndex);
            q.render(g2);
        }
    }

    public void setQuestionIndex(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public int getQuestionIndex() {
        return questionIndex;
    }
}
