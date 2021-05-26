import java.awt.event.*;

import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener {

	// instance variable
	String answer;

	// implementing a method to support ActionListener interface
	public void actionPerformed(ActionEvent e) {

		// setting answer to the label of the button that generated the event "e"
		answer = e.getActionCommand();

		// return control by closing the dialog
		dispose();
	}

}
