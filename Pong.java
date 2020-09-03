import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;

class Pong extends JFrame {

	private int leftScore = 0;
	private int rightScore = 0;
	private JLabel leftLabel;
	private JLabel rightLabel;


	public Pong() {

		super("Pong");
	
		this.setLayout(new BorderLayout());

		PongCanvas canvas = new PongCanvas(this);
		this.add(canvas, BorderLayout.CENTER);

		JPanel scorePanel = new JPanel();
		scorePanel.setLayout(new GridLayout(1, 2));

		leftLabel = new JLabel("Player 1: " + leftScore);
		rightLabel = new JLabel("Player 2: " + rightScore);
		Font f = new Font("Arial", Font.BOLD, 16);
		leftLabel.setFont(f);
		rightLabel.setFont(f);
		scorePanel.add(leftLabel);
		scorePanel.add(rightLabel);

		this.add(scorePanel, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(500, 300);
	}


	public void leftPlayerScored() {
		leftScore++;
		leftLabel.setText("Player 1: " + leftScore);
		repaint();

		if (leftScore == 3) {
			JOptionPane.showMessageDialog(this, "Player 1 wins!");
		}
	}

	
	public void rightPlayerScored() {
		rightScore++;
		rightLabel.setText("Player 2: " + rightScore);
		repaint();

		if (rightScore == 3) {
			JOptionPane.showMessageDialog(this, "Player 2 wins!");
		}
	}


	public static void main(String[] args) {
		new Pong().setVisible(true);
	}

}
