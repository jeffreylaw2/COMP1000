package incoming;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUIDemo extends JComponent implements MouseListener {

	private JFrame frame;
	
	// Just to keep track of the last click position
	int x = 0;
	int y = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIDemo window = new GUIDemo();
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
	public GUIDemo() {
		initialize();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				x++;
				y++;
				repaint();
			}
		};
		this.addMouseListener(this);
		new Timer().schedule(tt, 0, 10);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Menu stuff */
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStart = new JMenuItem("Start");
		mnFile.add(mntmStart);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		JComponent canvas = this;
		// Set the coordinate boundaries of the component
		canvas.setBounds(0, 0, 450, 256);
		frame.getContentPane().add(canvas);
	}
	// Draws the component on the screen
	// Using the graphics object
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.RED);		
		g2.drawLine(-7, -12, 45, 88);
		
		g2.setColor(Color.BLACK);
		g2.setFont(new Font("Helvetica", Font.PLAIN, 30));
		g2.drawString("Hello", 99, 200);
		
		g2.setColor(new Color(10,75,90));
		// Draw a rectangle at that location
		g2.fillRect(x, y, 10, 10);
		
	}

	// when the mouse is clicked, do something
	@Override
	public void mouseClicked(MouseEvent e) {
		// set the x and y coordinates to the mouse position
		x = e.getX();
		y = e.getY();
		this.repaint();
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
