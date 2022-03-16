import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {

    MultipleChoiceQuestion(String query, String a, String b, String
    c, String d, String e, String answer) {
        question = query+'\n'
        + "A. " + a +"\n"
        + "B. " + b +"\n"
        + "C. " + c +"\n"
        + "D. " + d +"\n"
        + "E. " + e +"\n";

        correctAnswer = answer.toUpperCase();
    }

    String ask() {
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

}
