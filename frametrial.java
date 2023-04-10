package WordOccurences;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;

public class frametrial {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=150,21
	 */
	private final JLabel lblWordOccurences = new JLabel("Word Occurences");
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frametrial window = new frametrial();
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
	public frametrial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel wordtxt = new JLabel("Word? :");
		wordtxt.setBounds(6, 6, 61, 16);
		frame.getContentPane().add(wordtxt);
		
		textField = new JTextField();
		textField.setBounds(133, 1, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel occText = new JLabel("# of Occurences :");
		occText.setBounds(6, 51, 130, 16);
		frame.getContentPane().add(occText);
		
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buildWordMap("/Users/kiaunamalesh/eclipse-workspace/TextAnalyzer/src/Text Analyzer");
				
			}
		});
		btnNewButton.setBounds(176, 237, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

	protected Map<String, Integer> buildWordMap(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
