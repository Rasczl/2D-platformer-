package main;
//This class opens up the game
public class Game {
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	public Game() {
		gamePanel = new GamePanel();
		gameWindow = new GameWindow(gamePanel);
		gamePanel.requestFocus();
	}
}
