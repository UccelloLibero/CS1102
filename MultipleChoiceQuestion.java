// importing JOptionPane
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {

	// adding class variables
	static int nQuestions = 0;
	static int nCorrect = 0;

	// adding instance variables
	String question;
	String correctAnswer;

	// constructor method
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {

		// initializing question with query parameter and with each choice parameter letter
		question = query + "\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";

		// initializing correctAnswer to parameter answer and converting to upper case
		correctAnswer = answer;
		correctAnswer = correctAnswer.toUpperCase();
	}

	// instance method that asks a question until the user provided a valid input
	String ask() {
		while (true) {
			// asking a question
			String answer = JOptionPane.showInputDialog(question);
			// converting the captured answer into upper case letter
			answer = answer.toUpperCase();
			// evaluating the answer input from user
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
			// if input is a valid letter then we are returning the value
			if (valid) return answer;
			// if input is an invalid letter we warn the user and ask to provide the correct letter
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
		}
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

	// class method to display the number of questions and correct answers
	void showResults() {
		// displaying the score
		JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions.");
	}	
}
