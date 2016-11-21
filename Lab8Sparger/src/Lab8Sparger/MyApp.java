package Lab8Sparger;

import javax.swing.JOptionPane;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, examSelect; 
		int questions, missed, lScore,grammar, content;
		
		if (name != String){
			JOptionPane.showMessageDialog(null, "Please Enter Student Name", "Error",
					JOptionPane.ERROR_MESSAGE); 
		}
		else {
		name = JOptionPane.showInputDialog("Enter Student Name: ");
		}
	}
	
	if (exam != 1 || 2 || 3){
		JOptionPane.showMessageDialog(null, "Error in Exam Selection", "Error",
				JOptionPane.ERROR_MESSAGE); 
	}
	else {
	exam = JOptionPane.showInputDialog("Which exam do you want to grade:\n"
			+ "1: Lab Assignment \n"
			+ "2: Mid-Term Exam \n"
			+ "3: Final Essay Exam ");
	}
}

}
