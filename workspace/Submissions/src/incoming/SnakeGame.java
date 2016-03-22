package incoming;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import incoming.SnakeGameModel.Direction;

// JComponent is for our views
// MouseListener, KeyListener
public class SnakeGame extends JComponent implements MouseListener, KeyListener {

	SnakeGameModel model = new SnakeGameModel(5,10);
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Incantations to run in the background
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SnakeGame window = new SnakeGame();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SnakeGame() {
		initialize();
		// Move periodically
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				model.move();
				repaint();
			}
		};
		new Timer().schedule(tt, 0, 100);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnGame.add(mntmNew);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnGame.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		SnakeGame game = this;
		game.setBounds(0, 0, 450, 255);
		frame.getContentPane().add(game);
		
		// Respond to key events
		frame.addKeyListener(this);
	}
	final int boxSize = 20;
	// This is our view
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		// draw the food
		g2.setColor(Color.RED);
		g2.fillRect(model.getFood().x * boxSize, model.getFood().y * boxSize, boxSize, boxSize);
		// draw the snake
		g2.setColor(Color.BLUE);
		for (SnakeGameModel.Coordinate chunk : model.getSnake()) {
			g2.fillRect(chunk.x * boxSize, chunk.y * boxSize, boxSize, boxSize);
		}
		if (model.gameIsOver()) {
			g2.setColor(Color.BLACK);
			g2.drawString("Game over!", 50, 50);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_DOWN:
			model.turn(Direction.DOWN);
			break;
		case KeyEvent.VK_UP:
			model.turn(Direction.UP);
			break;
		case KeyEvent.VK_LEFT:
			model.turn(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			model.turn(Direction.RIGHT);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
