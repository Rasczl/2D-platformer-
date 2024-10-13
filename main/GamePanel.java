package main;

import java.awt.Graphics;


import javax.swing.JPanel;
//This class creates the Game panel
public class GamePanel extends JPanel {
	private inputs.MouseInputs mouseInputs;
	private int xDelta = 100;
	private int yDelta = 100;
	
	public GamePanel() {
		mouseInputs = new inputs.MouseInputs(this);
		addKeyListener(new inputs.KeyBoardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
		}
	
	public void xDeltaMove(int value) {
		this.xDelta += value;
		repaint();
	}
	public void yDeltaMove(int value) {
		this.yDelta += value;
		repaint();
	}
	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(xDelta,yDelta, 200, 50);
	}
}
