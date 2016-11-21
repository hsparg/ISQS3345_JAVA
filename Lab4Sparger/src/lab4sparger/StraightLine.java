package lab4sparger;

import java.text.DecimalFormat;

import javax.swing.*;


public class StraightLine {

	public static void main(String[] args){
		
		float cost, residual, depCost, yearDep, carryVal, accumDep=0;
		int usefullife;
		String strCost, strResidual, strUsefulLife; 

		
		do{
		   strCost = JOptionPane.showInputDialog("Enter Cost (>0)"); 
		   cost = Integer.parseInt(strCost);
			if(cost<=0){
				JOptionPane.showMessageDialog(null, "Cost should be more than 0", "Error",
						JOptionPane.ERROR_MESSAGE); 
			}
		}while(cost<=0);
		
		do{
			   strResidual = JOptionPane.showInputDialog("Enter Residual Value (>0)"); 
			   residual = Integer.parseInt(strResidual);
				if(residual<=0){
					JOptionPane.showMessageDialog(null, "The Residual Value should be more than 0", "Error",
							JOptionPane.ERROR_MESSAGE); 
				}
			}while(residual<=0);
		
		do{
			   strUsefulLife = JOptionPane.showInputDialog("Enter the Useful Life (>0)"); 
			   usefullife = Integer.parseInt(strUsefulLife);
				if(usefullife<=0){
					JOptionPane.showMessageDialog(null, "The Residual Value should be more than 0", "Error",
							JOptionPane.ERROR_MESSAGE); 
				}
			}while(usefullife<=0);
		
	DecimalFormat myFormat = new DecimalFormat("0.00");
	JTextArea outputArea = new JTextArea (7,55);
	
	outputArea.append("\t\t Depreciation Schedule\n" +
	              "End of Year\tCost\tYearly Depreciation\tAccumulated Dep\tCarryValue\n");
		
	for (int i=1; i<= usefullife; i++){
		depCost = cost - residual; 
		yearDep = depCost / usefullife;
		accumDep = accumDep + yearDep;
		carryVal = cost - accumDep;
		outputArea.append(i + "\t" + cost + "\t" + myFormat.format(yearDep)+"\t\t" + myFormat.format(accumDep) +
				      "\t\t" + myFormat.format(carryVal) + "\n");
		
		JOptionPane.showMessageDialog(null, outputArea, "Depreciation", JOptionPane.INFORMATION_MESSAGE);
	}
	}
}
