package Lab8Sparger;
// A class holds a grade for a graded activity

public class GradeActivity {
		
		 double score; // Numeric Score
		 String name, exam;
		 char letterGrade;
		 
		private GradeActivity(){
			name = "";
			exam = "";
			score = 0.0;
		}
		
		public void setExam(int e){
			if(e==1)
				exam = "Lab";
			else if (e==2)
				exam = "Mid-term Exam";
			else if (e==3)
				exam = "Final Essay Exam";
			} 
		
		public double getExam()
		{
			return Double.parseDouble(exam);
		}

		/** 
		 * The getGrade method returns a letter grade 
		 * determined from the score field.
		 * @return The letter grade.
		 */
			public char getGrade(){
				if(score >= 90 && score <=100)
					letterGrade = 'A';
				else if(score >= 80 && score <=90)
					letterGrade = 'B';
				else if(score >= 70 && score <=80)
					letterGrade = 'C';
				else if(score >= 60 && score <=70)
					letterGrade = 'D';
				else
					letterGrade = 'F';
		
			return letterGrade;
			
	}
}