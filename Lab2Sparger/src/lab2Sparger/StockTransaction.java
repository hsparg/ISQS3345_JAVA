package lab2Sparger;

	import java.text.DecimalFormat;

import javax.swing.JOptionPane;
	
public class StockTransaction {
		
	public static void main(String[] args) {

	 	double numSharesPurchased, 
	 		   purchasingPrice,
	 	       numShareSold,
	 	       sellingPrice;
        
		numSharesPurchased = Double.parseDouble(JOptionPane.showInputDialog("What is the number of shares you purchased?"));

		purchasingPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the purchasing price of the shares?")); 

		numShareSold = Double.parseDouble(JOptionPane.showInputDialog("What is the number of shares you sold?")); 
		
		sellingPrice = Double.parseDouble(JOptionPane.showInputDialog("What was the selling price of the shares?"));
		
			double payOut = 0.02 * purchasingPrice * numSharesPurchased,
				   TotalPayout = (purchasingPrice * numSharesPurchased) + payOut,
				   payOut2 = 0.02 * sellingPrice * numShareSold,
			       Gain = (sellingPrice * numShareSold) - payOut2,
			       profitLoss = Gain - TotalPayout;
			
		DecimalFormat myFormat = new DecimalFormat("0.00");
			
		JOptionPane.showMessageDialog(null, "You paid $" + myFormat.format(purchasingPrice) +" for the stock\n" 
										  + "You paid your broker commission of $" + payOut + " on the purchase\n" 
				                          + "So, You paid a total of $" + TotalPayout + "\n" 
										  + "You sold the stock for $" + sellingPrice + "\n"
		                                  + "You paid his broker a commission of $" + payOut2 + "\n"
		                                  + "So, you recieved a total of $" + Gain + "\n \n"
		                                  + "Your profit or loss: $" + profitLoss);
		
		
	}

}
