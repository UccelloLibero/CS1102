import javax.swing.JOptionPane;

public abstract class Question {

	// adding class variables
	static int nQuestions = 0;
	static int nCorrect = 0;

	// adding instance variables
	String question;
	String correctAnswer;


	// abstract declaration of ask method
	abstract String ask();

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

	// class method to display the number of questions and correct answers
	static void showResults() {
		// displaying the score
		JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions.");
	}
}
