package com.extrajava.simple_animation;

/**
 * Класс простая анимация
 * @autor EvgeniiTiurin
 * @version 1.1
 */

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    JFrame frame;

    int x = 25;
    int y = 25;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
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

            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color сolor = new Color (red, green, blue);

            g.setColor(сolor);
            g.fillOval(x,y, 40,40);
        }
    }
}
