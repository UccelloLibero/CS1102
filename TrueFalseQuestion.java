import javax.swing.*;

public class TrueFalseQuestion extends Question {


	// constructor method for TrueFalseQuestion initialized with two parameters
	TrueFalseQuestion(String question, String answer) {

		// call to the Question constructor
		super(question);

		// creating new JPanel to organize true/false buttons
		JPanel buttons = new JPanel();

		// add true button
		addButton(buttons, "TRUE");

		// add false button
		addButton(buttons, "FALSE");

		// add buttons to the dialog box
		this.question.add(buttons);

		// call to the initQuestionDialog method inherited from Question
		initQuestionDialog();

		// initialize the string answer
		answer = answer.toUpperCase();

		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";

		if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
	}

	// method to add buttons
	void addButton(JPanel buttons, String label) {

		// creating a new button
		JButton button = new JButton(label);

		// adding a listener to the new button, question object is programmed to respond to button clicks
		button.addActionListener(question);

		// add button to the "buttons" panel
		buttons.add(button);
	}

}
