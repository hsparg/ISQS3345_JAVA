package lab7Sparger;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Vote {
	private int numOfCan, totalVotes, votes [];
	private String[] candidates;
	
	public Vote(int n)
	{
	 numOfCan = n;
	 totalVotes = 0;
	 candidates = new String[n];
	 votes = new int[n];
	 } 
	
	public void setCandidates(String s[]){

		 for(int i=0; i<s.length; i++)
		 candidates[i]=s[i];
		 } 
	
	public void setVotes(int v[]){

		 for(int i=0; i<v.length; i++)
		 votes[i]=v[i];
		 } 
	
	public int getSumVotes(int votes[]){
		int total = 0;
		for(int i=0; i < votes.length; i++)
			total += votes[i];
		return total;
	}
	
	public int getWinnerIndex (int list[])
	 {
	 int winInd = 0;
	for(int i = 0; i < list.length; i++)
	 {
	if(list[i] > list[winInd])
	winInd = i;
	}
	return winInd;
	} 
	
	DecimalFormat myFormat = new DecimalFormat("0.00");
	JTextArea outputArea = new JTextArea (7,55);
	
	public Object getOutput(){
		
		int k;
		totalVotes = getSumVotes(votes); 
		 k = getWinnerIndex(votes); 
		 
		 outputArea.append("Candidate\tVotes Received\t\t% of Total Votes\n");
		 for(int n = 0; n < candidates.length; n++)
		  {
		  outputArea.append(candidates[n] + " \t " + votes[n] + "\t\t "
		  + myFormat.format(((double)(votes[n]) / (double)(totalVotes) * 100))+"\n");
		 }
		return outputArea; 
	}
	
	
}
