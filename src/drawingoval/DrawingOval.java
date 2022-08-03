/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingoval;

import javax.swing.JFrame;

public class DrawingOval extends JFrame {

    public static void main(String[] args) {
        Drawing draw = new Drawing();
        draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw.setSize(580,300);
        draw.setVisible(true);
    }
    
}