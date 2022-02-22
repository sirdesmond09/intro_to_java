import javax.swing.JOptionPane;

public class Quiz {
	static int nQuestions = 0;
	static int nCorrect = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String question = "Who won the champions league in 2021?\n";
		
		question += "A. Chelsea \n";
		question += "B. Manchester United \n";
		question += "C. Real Madrid \n";
		question += "D. Juventus \n";
		question += "E. Fc Porto \n";
		
		check(question, "A");
		
		String question2 = "Who is the highest international goal scorer in the world?\nA. Mokhtar Dahari \n"
				+ "B. Ali Daei\n"
				+ "C. Cristiano Ronaldo\n"
				+ "D. Ferenc Puskas";
		check(question2, "C");
		
		String question3 = "What year was fifa founded?\nA. 1928 \n"
				+ "B. 1904\n"
				+ "C. 1923\n"
				+ "D. 1902";
		check(question3, "B");
		
		JOptionPane.showMessageDialog(null, nCorrect+ " correct out of " + nQuestions + " questions");
	}
	
	static String ask(String question) {
		String answer ;
		while (true) {
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			} 	
		
		}
		return answer;
	}
	
	
	static void check(String question, String correctAnswer) {
		nQuestions++;
		
		String answer = ask(question);
		if (answer.equals(correctAnswer)){
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + correctAnswer);
		}
	}

}
