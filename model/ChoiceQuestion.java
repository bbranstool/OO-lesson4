package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    
    private ArrayList<String> choices;

    public ChoiceQuestion(String text, String answer) {
        super(text, answer);
        choices = new ArrayList<String>();
    }

    public void addChoice(String c) {
        choices.add(c);
    }

    @Override
    public void display() {
        super.display();
        int number = 1;

        for (String c : choices) {
            System.out.println("\t" + number + ". " + c);
            number++;
        }
    }

    @Override
    public void render(Graphics2D g2) {
        super.render(g2);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Courier New", Font.BOLD, 12));
        int number = 1;
        for (String c : choices) {
            g2.drawString(number + ". " + c, 80, number * 50 + 100);
            number++;
        }
    }

}
