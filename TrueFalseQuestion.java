import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	@Override
	String ask() {
		// pose a question until the valid answer is provided
		while (true) {

			String answer = JOptionPane.showInputDialog(question);

			answer = answer.toUpperCase();

			if (answer.equals("T") || answer.equals("Y") || answer.equals("YES")) answer = "TRUE";

			if (answer.equals("F") || answer.equals("N") || answer.equals("NO")) answer = "FALSE";

			boolean valid = (answer.equals("TRUE") || answer.equals("FALSE"));

			if (valid) return answer;

			JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
		}
	}

	// constructor method for TrueFalseQuestion initialized with two parameters
	TrueFalseQuestion(String question, String answer) {

		// setting instance variables
		this.question = "TRUE or FALSE: " + question;

		answer = answer.toUpperCase();

		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";

		if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
	}

}
