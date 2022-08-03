/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingoval;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Drawing extends JFrame implements ActionListener {

    JButton colorbtn = new JButton("Change Background Color");
    JButton drawOval = new JButton("Draw Oval");
    JButton drawFiloval = new JButton("Draw fill Oval");
    JButton colorshape = new JButton("Change Oval Color ");
    JPanel drawingArea = new JPanel();
    JPanel btns = new JPanel();
    BorderLayout borderlayout = new BorderLayout();
    Color color = Color.BLACK;
    Color Bgcolor = Color.WHITE;
    Boolean flag = true;
    Boolean flag2 = true;
    DrawingPanal dp = new DrawingPanal();

    public Drawing() {
        super("Drawing");
        btns.setLayout(new FlowLayout());

        this.setLocationRelativeTo(null);
        Dimension preferredSize = new Dimension(200, 200);
        dp.setPreferredSize(preferredSize);
        add(dp);

        btns.add(colorbtn);
        btns.add(colorshape);
        btns.add(drawOval);
        btns.add(drawFiloval);
        add(btns, BorderLayout.SOUTH);

        colorbtn.addActionListener(this);
        drawOval.addActionListener(this);
        colorshape.addActionListener(this);
        drawFiloval.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorbtn) {
            Bgcolor = JColorChooser.showDialog(Drawing.this, "Choose a color", color);
            dp.repaint();
        }

        if (e.getSource() == drawOval) {
            flag = !flag;
            dp.repaint();

        }
        if (e.getSource() == colorshape) {
            color = JColorChooser.showDialog(Drawing.this, "Choose a color", color);
            dp.repaint();

        }
        if (e.getSource() == drawFiloval) {
            flag2 = !flag2;
            dp.repaint();
        }
    }

    public class DrawingPanal extends JPanel {

        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            this.setBackground(Bgcolor);
            if (!flag) {
                g.setColor(color);
                g.drawOval(130, 50, 100, 100);
            }
            if (!flag2) {
                g.setColor(color);
                g.fillOval(320, 50, 100, 100);
            }
        }
    }
}
