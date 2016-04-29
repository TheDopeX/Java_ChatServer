import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StartQuestion extends JDialog {



	public StartQuestion() {
		
		JTextField adresse = new JTextField();
		JTextField name = new JTextField();
		//Array for fields
		Object [] question = {"Server-Adresse: ", adresse, "Name: ", name};
		//create Dialog 	
			int result = JOptionPane.showOptionDialog(
					null, 
					question, 
					"Abfrage", 
					JOptionPane.OK_CANCEL_OPTION, 
					JOptionPane.PLAIN_MESSAGE, 
					null, null, null
				);	
		
		
		if(result == JOptionPane.YES_OPTION){
			
			
		}
		else{
			System.exit(0);
		}
		
		
		
		
	}

}
