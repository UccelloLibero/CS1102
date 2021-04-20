import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// declaring a string and initializing with question to be asked
		String question = "What is a computer?\n";

		// assigning multiple choices to the question string
		question += "A. a person who has acquired the knowledge of computer science, the study of the theoretical foundations of information and computation and their application.\n";
		question += "B. a machine or device that performs processes, calculations and operations based on instructions provided by a software or hardware program.\n";
		question += "C. is a vast network that connects computers all over the world.\n";
		question += "D. is the process of designing and building an executable computer program to accomplish a specific computing result or to perform a specific task. \n";
		question += "E. a piece of code which is capable of copying itself and typically has a detrimental effect, such as corrupting the system or destroying data.\n";

		// staring a while loop to ask question and validate the answers provided by the user
		// the loop will continue until the conditions bellow are satisfied
		while (true) {

			// declaring a string to hold the answer provided by the user and then converting the letter supplied to upper case
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();

			// if else clause to check for the valid entry
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {

				// if else clause to check for the correct answer
				if (answer.equals("B")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
					continue;
				}

				} else {
					JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E.");
					continue;
			}
		}


	}

}
