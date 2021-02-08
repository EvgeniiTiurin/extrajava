package com.extrajava.animation_with_gradient;

import javax.swing.*;
import java.awt.*;

/**
 * Класс простая анимация
 * @autor EvgeniiTiurin
 * @version 1.1
 */

public class AnimationWithGradient {

    JFrame frame;

    int x = 25;
    int y = 25;

    public static void main(String[] args) {
        AnimationWithGradient gui = new AnimationWithGradient();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        for (int i = 0; i < 400; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(50); // замедление
            } catch (Exception ex) { }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.white);
            g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color startColor = new Color (red, green, blue);

            red = (int) (Math.random() * 255);
            green = (int) (Math.random() * 255);
            blue = (int) (Math.random() * 255);
            Color endColor = new Color (red, green, blue);

            GradientPaint gradient = new GradientPaint(x,y,startColor, x + 80,y + 80, endColor);
            g2d.setPaint(gradient);
            g2d.fillOval(x,y, 40,40);
        }
    }
}
