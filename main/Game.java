package main;

public class Game {
    private GamePanel panel;
    private GameWindow window;
    
    Game() {
        panel = new GamePanel();
        window = new GameWindow(panel);
    }
}