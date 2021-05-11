public class Quiz {

	// constructing and using MultipleChoiceQuestion class
	public static void main(String[] args) {

		// first set of questions to be asked
		Question question1 = new MultipleChoiceQuestion(
				"What is the longest river in the world?",
				"Amazon.",
				"Nile.",
				"Congo.",
				"Yangtze.",
				"Mekong.",
				"b");

		// check if the answer is correct with call to class method check()
		question1.check();


		// second set of questions to be asked
		Question question2 = new MultipleChoiceQuestion(
				"What is the tallest mountain in the world?",
				"Mount K2.",
				"Mount Lhotse.",
				"Mount Everest.",
				"Mount Kilimanjaro.",
				"Mount Kangchenjunga.",
				"c");

		// check if the answer is correct with call to class method check()
		question2.check();


		// third set of questions to be asked
		Question question3 = new MultipleChoiceQuestion(
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
		Question question4 = new MultipleChoiceQuestion(
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
		Question question5 = new MultipleChoiceQuestion(
				"What is personality?",
				"A three pound organ that is a seat of intelligence, interpreter of the senses, initiator of body movement, and controller of behavior, the source of all the qualities that define our humanity.", // brain
				"The totality of the human mind, conscious and unconscious.", // psyche
				"A nearly perfect sphere of hot plasma, heated to incandescence by nuclear fusion reactions in its core, radiating energy mainly as visible light and infrared radiation.", // The Sun
				"The largest natural satellite in the Solar System relative to the size of its planet, and the fifth largest satellite in the Solar System overall.", // The Moon
				"The combination of characteristics or qualities that form an individual's distinctive character.", // personality
				"e");

		// check if the answer is correct with call to class method check()
		question5.check();

		// sixth question of true or false type
		Question question6 = new TrueFalseQuestion(
				"A day on planet Earth is 23 hours and 56 minutes long.",
				"TRUE");

		// check if the answer is correct with call to class method check()
		question6.check();

		// seventh question of true or false type
		Question question7 = new TrueFalseQuestion(
				"Burj Khalifa is the world's tallest building.",
				"TRUE");

		// check if the answer is correct with call to class method check()
		question7.check();

		// eight question of true or false type
		Question question8 = new TrueFalseQuestion(
				"Smallest bones in the human body are found in the hand.",
				"FALSE");

		// check if the answer is correct with call to class method check()
		question8.check();

		// ninth question of true or false type
		Question question9 = new TrueFalseQuestion(
				"Largest human body's organ is skin.",
				"TRUE");

		// check if the answer is correct with call to class method check()
		question9.check();

		// tenth question of true or false type
		Question question10 = new TrueFalseQuestion(
				"Magma is molten rock expelled by a volcano.",
				"FALSE");

		// check if the answer is correct with call to class method check()
		question10.check();



		// show the results of the quiz with call to class method showResults()
		MultipleChoiceQuestion.showResults();
	}
}
