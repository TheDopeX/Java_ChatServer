import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BottomPanel extends JPanel {

	
	
	
	public BottomPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		setSize(300, 300);
		setVisible(true);
	}

}
