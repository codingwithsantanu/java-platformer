package main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame window;
    
    GameWindow(GamePanel panel) {
        window = new JFrame();
        
        window.setTitle("Super Pirate Platformer");
        window.setSize(1280, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        
        window.add(panel);
        
        window.setVisible(true);
    }
}