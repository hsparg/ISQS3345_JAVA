package Lab8Sparger;

import javax.swing.JOptionPane;

public class CourseGrade extends GradeActivity{

	int numQuestions, numMissed;
	double pointsEach, mScore, grammer, content, fScore;
	
	public CourseGrade(){
		numQuestions = q;
		numMissed = 0.0; 
		pointsEach = 0.0;
		
	}
	public boolean checkSelect (int se){
		if (se < 1 || se > 3)
			return true; 
		else 
		 return false; 
	}
	
	public void setQuestions (){
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
	
	public void setGrammar(){
		grammer = Double.parseDouble(JOptionPane.showInputDialog("Enter the Final Essay's Grammer Score:(<=70)"));

	}
	
	public double getGrammer(){
		return grammer;
	}
		
	public void setContent (double co){
		content = Integer.parseInt(JOptionPane.showInputDialog("Enter the Final Essay's Content Score: (<=70)"));

	}

	public double getContent(){
		return content; 
	}

	public double getFScore(){
		fScore = (grammer *.30)+ (content *.30);
		return fScore;
	}
	
}



