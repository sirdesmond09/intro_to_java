public class Quiz {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question question = new MultipleChoiceQuestion(
			"Which of these is NOT a programming language?", 
			"CSS", 
			"Javascript",
			"Python",
			"Java",
			"C++",
			"a"
			);
		question.check();

		question = new MultipleChoiceQuestion(
			"Which of these is a programming language?", 
			"CSS", 
			"HTML",
			"Python",
			"LASER",
			"Amharic",
			"C"
			);
		question.check();

		question = new MultipleChoiceQuestion(
			"What year was python created?", 
			"1982", 
			"1993",
			"1991",
			"1891",
			"1981",
			"C"
			);
		question.check();

		question = new MultipleChoiceQuestion(
			"What year was java created?", 
			"1982", 
			"1996",
			"1991",
			"1891",
			"1981",
			"b"
			);
		question.check();

		question = new MultipleChoiceQuestion(
			"Who invented Java?", 
			"James Gosling", 
			"Dennis Ritchie",
			"Raj Reddy",
			"Guido van Ross",
			"Bill Joy",
			"a"
			);
		question.check();

		question = new TrueFalseQuestion("Java is a programming language?", "TRUE");
		question.check();

		question = new TrueFalseQuestion("HTML is a programming language?", "FALSE");
		question.check();

		question = new TrueFalseQuestion("PYTHON is NOT programming language?", "FALSE");
		question.check();

		question = new TrueFalseQuestion("CSS is a NOT programming language?", "TRUE");
		question.check();

		question = new TrueFalseQuestion("RUST is a programming language?", "TRUE");
		question.check();

		MultipleChoiceQuestion.showResults();
		

	}
	

}
