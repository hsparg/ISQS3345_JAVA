package lab5sparger;

import javax.swing.*;
import java.text.DecimalFormat; 

public class Payroll {

public static void main(String[] args) { 
	
    final double taxRate = 0.15; 
	         double hoursWorked,
	                 hourlyRate,
	                 grossSalary,
	                 incomeTax,
	                 netSalary
	                 ; 
	         
	String employeeName;
	
	employeeName = JOptionPane.showInputDialog("Enter Employee's Name:");
	hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours Worked:"));
	hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Hourly Rate:"));
	grossSalary = calcuateGrossSalary (hourlyRate, hoursWorked);
	incomeTax = calculateTax (grossSalary, taxRate);
	netSalary = calculateNetSalary ( grossSalary, incomeTax);
	
	DecimalFormat myFormat = new DecimalFormat("0.00");
	JTextArea outputArea = new JTextArea (7,55);
	
	outputArea.append("Employee Name" + "\t Hours Worked \t Hourly Rate \t Gross Salary \t Tax \t\t Net Salary \n" );
	
	outputArea.append(employeeName+ "\t\t" + myFormat.format(hoursWorked) + "\t" + hourlyRate +"\t" + myFormat.format(grossSalary) +
		      "\t" + myFormat.format(incomeTax) + "\t\t" + myFormat.format(netSalary));
	
	JOptionPane.showMessageDialog(null, outputArea, "Payroll", JOptionPane.INFORMATION_MESSAGE);

};


public static double calcuateGrossSalary (double hourlyRate, double hoursWorked)
	{
	 double GrossSalary = hourlyRate * hoursWorked; // Gross salary = (hours worked) * (hourly rate)
	 return GrossSalary;
	}; 
	
public static double calculateTax (double grossSalary, double taxRate)
	{
	double incomeTax = grossSalary * taxRate; 
	return incomeTax; 
	}; 	
public static double calculateNetSalary (double grossSalary, double incomeTax)
	{
	double netSalary = grossSalary - incomeTax; 
	return netSalary; 
	}; 	
	
	
};
