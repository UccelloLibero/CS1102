// importing all AWT and Swing classes
import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

	// constructor method
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {

		// call to the Question constructor
		super(query);

		// add choices to build the dialog box
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);

		// initialization of the rest of the dialog box
		initQuestionDialog();

		// initializing correctAnswer to parameter answer and converting to upper case
		correctAnswer = answer;
		correctAnswer = correctAnswer.toUpperCase();
	}

	// method to create answer choices
	void addChoice(String name, String label) {

		// create the panel to arrange the button and label
		JPanel choice = new JPanel(new BorderLayout());

		// create a button with a given name (from the method parameter)
		JButton button = new JButton(name);

		// record the answer if button is clicked
		button.addActionListener(question);

		// add the button above to the choice panel aligning it to the left, WEST
		choice.add(button, BorderLayout.WEST);

		// add answer label to the center section of the panel
		choice.add(new JLabel(label + "     ", JLabel.LEFT), BorderLayout.CENTER);

		// add the panel holding the button and label to the dialog box
		question.add(choice);
	}


}
