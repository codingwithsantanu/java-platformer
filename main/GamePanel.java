package main;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GamePanel extends JPanel {
    GamePanel() {
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.fillRect(100, 100, 150, 50);
    }
}