package Lab8Sparger;

import javax.swing.JOptionPane;


public class MyApp {
	String name, exam;
	int questions, missed, grammar, content, numExam, examSelect;
	double score,mScore, fScore;
	
	public static void main(String[] args){
		
		String name = "";
			
		int missed = 0, 
			grammar = 0, 
			content = 0, 
			numExam = 0, 
			examSelect = 0;
		double score = 0;
		
		CourseGrade assignment = new CourseGrade();
		//GradeActivity labGrade = new GradeActivity ();
		//GradeActivity midGrade = new GradeActivity ();
		//GradeActivity essayGrade = new GradeActivity ();
		
		do{
			name = JOptionPane.showInputDialog("Enter Student Name: ");
			if (assignment.checkName(name)== false){
				JOptionPane.showMessageDialog(null, "Please Enter Student Name", "Error",
						JOptionPane.ERROR_MESSAGE);
			} 		
			} while (assignment.checkName(name)== false); 

		
		do{
	examSelect = Integer.parseInt(JOptionPane.showInputDialog("Which exam do you want to grade:\n"
			+ "1: Lab Assignment \n"
			+ "2: Mid-Term Exam \n"
			+ "3: Final Essay Exam "));	
		if (assignment.checkSelect(examSelect)== false){
			JOptionPane.showMessageDialog(null, "This is not a valid number. (Please choose a number 1-3)", "Error",
				JOptionPane.ERROR_MESSAGE);
		}
		} while (assignment.checkSelect(examSelect)== false);

	assignment.setName(name);
	//	labGrade.setName(name);
	//midGrade.setName(name);
	//essayGrade.setName(name);

	if (examSelect == 1){
	score = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Lab Score"));
	assignment.setScore(score);
	JOptionPane.showMessageDialog(null,assignment.getName() + "'s Lab score is " + 
								 assignment.getScore() + " land their grade is a " + assignment.getGrade());
	}
	if (examSelect == 2){
		assignment.setQuestions(numExam);
		assignment.setMissed(missed);
		assignment.getQuestions();
		assignment.getMissed();
		assignment.getMScore();
		assignment.getPointsEach();
		score = assignment.getMScore();
		assignment.setScore(score);
		JOptionPane.showMessageDialog(null,assignment.getName() + "'s mid-term score is " + 
				assignment.getScore() + " and their grade is " + assignment.getGrade());
	}
	if (examSelect == 3){
		assignment.setGrammar(grammar);
		assignment.setContent(content);
		assignment.getGrammar();
		assignment.getContent();
		score = assignment.getFScore();
		assignment.setScore(score);
		JOptionPane.showMessageDialog(null,assignment.getName() + "'s essay score is " + 
				assignment.getFScore() + " and their grade is " + assignment.getGrade());
	}
	}


}

