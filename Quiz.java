public class Quiz {

	// constructing and using MultipleChoiceQuestion class
	public static void main(String[] args) {

		// first set of questions to be asked
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"What is the longest river in the world?",
				"Amazon.",
				"Nile.",
				"Congo.",
				"Yangtze.",
				"Mekong.",
				"b");

		// check if the answer is correct with call to class method check()
		question.check();

		// uncomment as an option to show the result with call to class method showResults() after the first questions
//		question.showResults();

		// second set of questions to be asked
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"What is the tallest mountain in the world?",
				"Mount K2.",
				"Mount Lhotse.",
				"Mount Everest.",
				"Mount Kilimanjaro.",
				"Mount Kangchenjunga.",
				"c");

		// check if the answer is correct with call to class method check()
		question2.check();

		// uncomment as an option to show the result with call to class method showResults()
//		question2.showResults();

		// third set of questions to be asked
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"What is the third planet from the Sun?",
				"Venus.",
				"Earth.",
				"Mars.",
				"Saturn.",
				"Mercury.",
				"b");

		// check if the answer is correct with call to class method check()
		question3.check();

		// fourth set of questions to be asked
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"What is cognition?",
				"The ability to see, hear, or become aware of something through the senses.", // perception
				"A biological system used by an organism for sensation, the process of gathering information about the world and responding to stimuli.", // sense
				"The ability to acquire knowledge without recourse to conscious reasoning.", // intuition
				"The mental action or process of acquiring knowledge and understanding through thought, experience and the senses.", // cognition
				"The faculty of the brain by which data or information is encoded, stored, and retrieved when needed.", // memory
				"d");

		// check if the answer is correct with call to class method check()
		question4.check();

		// fifth set of questions to be asked
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
				"What is personality?",
				"A three pound organ that is a seat of intelligence, interpreter of the senses, initiator of body movement, and controller of behavior, the source of all the qualities that define our humanity.", // brain
				"The totality of the human mind, conscious and unconscious.", // psyche
				"A nearly perfect sphere of hot plasma, heated to incandescence by nuclear fusion reactions in its core, radiating energy mainly as visible light and infrared radiation.", // The Sun
				"The largest natural satellite in the Solar System relative to the size of its planet, and the fifth largest satellite in the Solar System overall.", // The Moon
				"The combination of characteristics or qualities that form an individual's distinctive character.", // personality
				"e");

		// check if the answer is correct with call to class method check()
		question5.check();

		// show the results of the quiz with call to class method showResults()
		question.showResults();
	}
}
