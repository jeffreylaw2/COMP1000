package incoming;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGameGUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblEnterAGuess;
	private JLabel output;
	private JButton btnGuess;
	private GuessingGame game = new GuessingGame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessingGameGUI window = new GuessingGameGUI();
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
	public GuessingGameGUI() {
		initialize();
		btnGuess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				// Convert the string into a number
				int guess = Integer.parseInt(textField.getText());
				GuessingGame.Outcome result = game.makeGuess(guess);
				lblEnterAGuess.setText("Enter a guess [" + game.lo + "-" + game.hi + "]");
//				System.out.println("Hello! Stop clicking me!");
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow][]", "[][]"));
		
		lblEnterAGuess = new JLabel("Enter a guess [1-100]");
		frame.getContentPane().add(lblEnterAGuess, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		btnGuess = new JButton("Guess");
		frame.getContentPane().add(btnGuess, "cell 2 0");
		
		output = new JLabel("Too high or too low or you won");
		frame.getContentPane().add(output, "cell 1 1");
	}

}
