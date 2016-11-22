package lab6sparger;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PayrollDemo {

	public static void main(String[] args){
		String name = "";
		int idNumber = 0; 
		double payRate,
		   hoursWorked;
			
		
		
		//Get name 
		do{
			name = JOptionPane.showInputDialog ("Enter the employee's name: ");
		} while (name.length() <=0 );
		
		//Get idNumber
		do{ 
			idNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the employee's ID number:"));
		} while (idNumber <=0);
		
		Payroll worker = new Payroll ();
		worker.setName(name);
		worker.setIdNumber(idNumber);
		
		//Get PayRate
		do{
			payRate = Double.parseDouble(JOptionPane.showInputDialog("What is your job?" + "\n1: Programmer\n2: Sales\n3: Office Worker"));
		} while (worker.checkRate(payRate)== false); 
		
		worker.setPayRate(payRate);
		
		//Get Hours Worked
		do{
		hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter number of hours worked:"));
		}while (worker.checkHoursWorked(hoursWorked)== false);	
		
		worker.setHoursWorked(hoursWorked);
		
		//Display Payroll information
			
			JTextArea outputArea = new JTextArea (7,40);
			outputArea.append("Employee Payroll Information" + "\n --------------------------------------- \n" 
					+ "Name:   " + worker.getName() 
					+ "\n ID Number:   " + worker.getIdNumber()
					+ "\n Hourly Payrate:   " + worker.getPayRate()
					+ "\n Hours Worked:   " + worker.getHoursWorked()
					+ "\n Gross Pay:   " + worker.getGrossPay()
					);
			JOptionPane.showMessageDialog(null, outputArea, "PayRoll", JOptionPane.INFORMATION_MESSAGE);		
	}
}
