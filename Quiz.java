import javax.swing.JOptionPane;

public class Quiz {

	// static member variables: number of questions and number of correct answers initialized to the value 0
	static int nQuestions = 0;
	static int nCorrect = 0;

	// static method that asks a question until the user provided a valid input
	static String ask(String question) {
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

	// static method to check if the answer supplied by user is correct
	static void check(String question, String correctAnswer) {
		// counting the question
		nQuestions++;
		String answer = ask(question);

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

	public static void main(String[] args) {

		// first set of questions to be asked
		String question = "What is the longest river in the world?\n";
		question += "A. Amazon. \n";
		question += "B. Nile. \n";
		question += "C. Congo. \n";
		question += "D. Yangtze. \n";
		question += "E. Mekong. \n";

		// check if the answer is correct
		check(question,"B");

		question = "What is the tallest mountain in the world?\n";
		question += "A. Mount K2. \n";
		question += "B. Mount Lhotse. \n";
		question += "C. Mount Everest. \n";
		question += "D. Mount Kilimanjaro. \n";
		question += "E. Mount Kangchenjunga. \n";

		// check if the answer is correct
		check(question,"C");

		question = "What is the third planet from the Sun?\n";
		question += "A. Venus. \n";
		question += "B. Earth. \n";
		question += "C. Mars. \n";
		question += "D. Saturn. \n";
		question += "E. Mercury. \n";

		// check if the answer is correct
		check(question,"B");

		// displaying the score
		JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions.");
	}
}
