import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		//Start dialog
		JDialog start = new StartQuestion();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(
				(int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2)-225, 
				(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)-150, 
				450, 300);
		
		contentPane = new BottomPanel();
		setContentPane(contentPane);
		
		BottomPanel view = new BottomPanel();
		contentPane.add(view, BorderLayout.PAGE_END);
		TextEntry entry = new TextEntry();
		view.add(entry, BorderLayout.CENTER);
		SendButton send = new SendButton();
		view.add(send, BorderLayout.LINE_END);
		
		
		
		
		
	}

}
