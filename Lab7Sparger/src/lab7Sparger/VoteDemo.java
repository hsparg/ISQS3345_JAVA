package lab7Sparger;

import javax.swing.*;

public class VoteDemo {
	public static void main(String[] args) {

        int numOfCan =0;
        numOfCan = Integer.parseInt(JOptionPane.showInputDialog("How Many" + " candidates in this election?"));

       

        Vote myVote = new Vote (numOfCan);
        String[] can = new String [numOfCan];
        int[] v = new int[numOfCan];

        for (int i=0; i < numOfCan; i++){
               can[i]=JOptionPane.showInputDialog("Enter candidates Name: ");
               v[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the" + " votes recieved by " + can[i]));

        }

        myVote.setCandidates(can);
        myVote.setVotes(v);
        JOptionPane.showMessageDialog(null, myVote.getOutput ());
        JOptionPane.showMessageDialog(null, myVote.getWinnerIndex(v));
  }
}