package com.extrajava.simple_animation;

import com.extrajava.two_buttons_and_random_position.TwoButtonsAndRandomPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

            JButton moveButton = new JButton("Move Circle");
            moveButton.addActionListener(new ColorListener());

            MyDrawPanel drawPanel = new MyDrawPanel();

            frame.getContentPane().add(BorderLayout.SOUTH, moveButton);
            frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

            frame.setSize(300, 300);
            frame.setVisible(true);
        }


        class ColorListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                frame.repaint();
            }
        }


        class MyDrawPanel extends JPanel {

            public void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                x =+ 5;
                y =+ 5;

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
                g2d.fillOval(x ,y ,100,100);
            }
        }
}
