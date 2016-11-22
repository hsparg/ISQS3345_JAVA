package Lab8Sparger;

import javax.swing.JOptionPane;

public class CourseGrade extends GradeActivity{

	int numQuestions, numMissed;
	double pointsEach, mScore, grammar, content, fScore;
	
	public CourseGrade(){
		super();
		numQuestions = 0;
		numMissed = 0; 
		pointsEach = 0.0;
		mScore = 0.0;
		grammar = 0.0;
		content = 0.0;
		
	}
	public boolean checkSelect (int se){
		if (se < 1 || se > 3)
			return false; 
		else 
		 return true; 
	}
	
	public boolean checkName(String na){
		if(na.length()<1 || na.length()>20 )
			return false;
		else 
			return true;
	}
	
	public void setQuestions (int q){
		numQuestions = q;
		numQuestions = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of questions in the exam: "));
	}
	
	public int getQuestions(){
		return numQuestions;  
	}	
	
	public void setMissed (int m){
		numMissed = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of questions missed: "));
	}
	
	public int getMissed(){
		return numMissed; 
	}
	
	public double getPointsEach(){
		pointsEach = 100.0/numQuestions;
		return pointsEach;
	}
	
	public double getMScore(){
		mScore = 100 - (numMissed*getPointsEach());
		return mScore;
		}
	
	public void setGrammar(double g){
		grammar =g;
		grammar = Double.parseDouble(JOptionPane.showInputDialog("Enter the Final Essay's Grammer Score:(<=30)"));

	}
	
	public double getGrammar(){
		return grammar;
	}
		
	public void setContent (double co){
		content = Integer.parseInt(JOptionPane.showInputDialog("Enter the Final Essay's Content Score: (<=70)"));

	}

	public double getContent(){
		return content; 
	}

	public double getFScore(){
		score = (grammar *.30)+ (content *.70);
		return score;
	}
	
	
}



