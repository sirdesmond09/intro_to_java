import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question{
    
    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: "+question;
        
        correctAnswer = answer.toUpperCase();
    }

    @Override
    String ask() {
        String answer ;
		while (true) {
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")){
                answer = "FALSE";
				break;
			} else if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")){
                answer = "TRUE";
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Invalid answer. Valid answers are f, false, False, FALSE, n, no, No, NO, t, true, T, True, TRUE, y, yes, Y, Yes, YES");
			} 	
		
		}
		return answer;
	}
}