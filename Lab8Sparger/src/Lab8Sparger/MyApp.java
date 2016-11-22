package Lab8Sparger;

import javax.swing.JOptionPane;


public class MyApp {
	String name, exam;
	int questions, missed, grammar, content, numExam, examSelect;
	double score,mScore, fScore;
	
	public static void main(String[] args){
		
		String name = "",
			   exam = "";
		int questions = 0, 
			missed = 0, 
			grammar = 0, 
			content = 0, 
			numExam = 0, 
			examSelect = 0;
		double score = 0;
		
		CourseGrade assignment = new CourseGrade();
		GradeActivity labGrade = new GradeActivity ();
		GradeActivity midGrade = new GradeActivity ();
		GradeActivity essayGrade = new GradeActivity ();
		
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

	labGrade.setName(name);
	midGrade.setName(name);
	essayGrade.setName(name);

	if (examSelect == 1){
	score = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Lab Score"));
	labGrade.setScore(score);
	JOptionPane.showMessageDialog(null,labGrade.getName() + "'s Lab score is " + 
								 labGrade.getScore() + " land their grade is a " + labGrade.getGrade());
	}
	if (examSelect == 2){
		assignment.setQuestions(numExam);
		assignment.setMissed(missed);
		assignment.getQuestions();
		assignment.getMissed();
		assignment.getMScore();
		assignment.getPointsEach();
		score = 100 - (assignment.getMScore() - assignment.getPointsEach());
		midGrade.setScore(score);
		JOptionPane.showMessageDialog(null,midGrade.getName() + "'s mid-term score is " + 
				midGrade.getScore() + " and their grade is " + midGrade.getGrade());
	}
	if (examSelect == 3){
		assignment.setGrammar(grammar);
		assignment.setContent(content);
		assignment.getGrammar();
		assignment.getContent();
		essayGrade.setScore(score);
		JOptionPane.showMessageDialog(null,essayGrade.getName() + "'s essay score is " + 
				assignment.getFScore() + " and their grade is " + essayGrade.getGrade());
	}
	}


}

