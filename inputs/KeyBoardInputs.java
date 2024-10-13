package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//This class dictates the movement of the program
public class KeyBoardInputs implements KeyListener {
	private main.GamePanel gamePanel;
	
	public KeyBoardInputs(main.GamePanel gamePanel) {
		this.gamePanel = gamePanel;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			System.out.println("W presed");
			gamePanel.yDeltaMove(-5);
			break;
		case KeyEvent.VK_A:
			System.out.println("A pressed");
			gamePanel.xDeltaMove(-5);
			break;
		case KeyEvent.VK_S:
			System.out.println("S pressed");
			gamePanel.yDeltaMove(5);
			break;
		case KeyEvent.VK_D:
			System.out.println("D pressed");
			gamePanel.xDeltaMove(5);
			break;

		}
		
	}
	
}
