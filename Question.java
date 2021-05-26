import java.awt.*;
import javax.swing.*;

public abstract class Question {

	// adding class variables
	static int nQuestions = 0;
	static int nCorrect = 0;

	// adding instance variables
	QuestionDialog question;
	String correctAnswer;

	Question(String question) {
		// setting instance variables
		this.question = new QuestionDialog();

		// adding grid layout with one column and any number of rows
		this.question.setLayout(new GridLayout(0,1));

		// adding question string to the window as a JLabel
		this.question.add(new JLabel("     " + question + "     ",JLabel.CENTER));
	}


	String ask() {

		// making the question dialog visible
		question.setVisible(true);

		// return the answer after the question dialog box returns from setVisible and sets the answer
		return question.answer;
	}

	// instance method to check if the answer supplied by user is correct
	void check() {
		// counting the question
		nQuestions++;
		String answer = ask();

		// if answer is correct notify user and proceed to next question
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			// increase the count of the correct answer
			nCorrect++;
			} else {
				// if answer is incorrect notify the user that it's incorrect and provide the correct answer letter
				JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
			}
		}

	// method to finish the initialization of the "question" instance variable
	void initQuestionDialog() {
		// make the dialog box modal
		this.question.setModal(true);

		// resize the dialog box based on its contents
		this.question.pack();

		// center the dialog box
		this.question.setLocationRelativeTo(null);
	}

	// class method to display the number of questions and correct answers
	static void showResults() {
		// displaying the score
		JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions.");
	}
}
