package lab3sparger;

	import javax.swing.*;
	import java.text.DecimalFormat; //For the DecimalFormat class'
	
public class Lab3Sparger {
	
	public static void main(String[] args){

final double PACKAGE_A = 9.95, // Package A base charge
			 PACKAGE_B = 13.95, // Package B base charge
			 PACKAGE_C = 19.95, // Package C base charge
			 PACKAGE_A_HOURS = 10.0, // Package A hour threshold
			 PACKAGE_B_HOURS = 20.0; // Package B hour threshold
char isPackage; // Customer package
	double hours, // Hours used
	charges = 0.0, // Calculated charges
    compSavingsB = 0.0, // Comparison savings
    compSavingsC;
	String input;
	
	input = JOptionPane.showInputDialog("Enter the customer's package (A, B, or C):"); 
	isPackage = input.charAt(0);
	
	if (isPackage <'A' || isPackage > 'C'){
		JOptionPane.showMessageDialog(null, "Invalid Package. Please " 
	    + "Enter A, B, or C", "Error Message",JOptionPane.ERROR_MESSAGE);

	}else{
	
			 hours = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the "
			+ "number of hours used"));
				switch(isPackage)
				{
					case 'A':	
						if (hours > PACKAGE_A_HOURS){
						  charges = PACKAGE_A + (hours - PACKAGE_A_HOURS)*2.00;
						  compSavingsB = charges + (PACKAGE_B + (hours - PACKAGE_B_HOURS)*2.00);
						  compSavingsC = charges - PACKAGE_C;
						  JOptionPane.showMessageDialog(null, "Your charges are $" + charges);
						  if (compSavingsB > 0.0){  
							  JOptionPane.showMessageDialog(null, "With package B you would have saved $" + compSavingsB);
						}
						  if (compSavingsC > 0.0){  
							  JOptionPane.showMessageDialog(null, "With package C you would have saved $" + compSavingsC);
							}
						}else{
							  JOptionPane.showMessageDialog(null, "Your charges are $" + PACKAGE_A);
						}
						  break; 
						
					case 'B':
						if (hours > PACKAGE_B_HOURS){
						  charges = PACKAGE_B + (hours - PACKAGE_B_HOURS)*1.00;	
						  JOptionPane.showMessageDialog(null, "Your charges are $" + charges);
						  compSavingsC = charges - PACKAGE_C;
						  if (compSavingsC > 0.0){  
							  JOptionPane.showMessageDialog(null, "With package C you would have saved $" + compSavingsC);
							}
						}else{
						JOptionPane.showMessageDialog(null, "Your charges are $" + PACKAGE_B);
						} 				
					break; 
					
					case 'C':
						JOptionPane.showMessageDialog(null, "Your charges are $" + PACKAGE_C);
					break;
				};
		      };
			};
};   
