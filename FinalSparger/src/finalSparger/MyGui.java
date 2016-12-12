package finalSparger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class MyGui extends JFrame{
	
	JLabel jlbSelect;
	JRadioButton jrbGenReg, jrbStuReg, jrbECOMM;
	JComboBox jcbCourses;
	JButton jbnCal, jbnExit;
	String workshop[] = {"Introduction to E-Commerce", "The Internet of things", "Web Application Development", "Internet Security" };
	ButtonGroup bg;
	JTextArea jtaOutput;
	
	public MyGui(){
		createInterface();
	}
	
	public void createInterface(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout (1,1));
		jlbSelect = new JLabel ("Select Registration Options ");
		p1.add(jlbSelect);
		c.add(jlbSelect, BorderLayout.NORTH);

		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout (1,1));
		jcbCourses = new JComboBox(workshop);
		jcbCourses.setMaximumRowCount(3);
		
		
		p2.add(jcbCourses);
		c.add(jcbCourses, BorderLayout.EAST);
		
		
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout (1,2));
		jrbGenReg = new JRadioButton ("General Registation");
		jrbStuReg = new JRadioButton("Student Registration");
		bg = new ButtonGroup();
		bg.add(jrbGenReg);
		bg.add(jrbStuReg);
		

		ButtonHandler myH = new ButtonHandler();
		jrbGenReg.addActionListener(myH);
		jrbStuReg.addActionListener(myH);
		jcbCourses.addActionListener(myH);
		
		
		p3.add(jrbGenReg);
		p3.add(jrbStuReg);
		c.add(p3);
		c.add(p3, BorderLayout.WEST);
		
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout (1,2));
		jbnCal = new JButton ("Calculate Charges");
		jbnExit = new JButton("Exit");
		p4.add(jbnCal);
		p4.add(jbnExit);
		c.add(p4);
		c.add(p4, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		
		
	}
	public class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){

			if (e.getSource()==jbnCal){
				String input;
				double out = 0.0;
				
				DecimalFormat myFormat = new DecimalFormat("0.00");
				JTextArea outputArea = new JTextArea (7,55);
				Registration cost = new Registration();
				
				if(e.getSource()==jrbGenReg){
					cost.setRegistrationCost(1);
				}
				if (e.getSource() == jrbStuReg){
					cost.setRegistrationCost(2);
			    }
				if (e.getSource() == workshop[0]){
					cost.setWorkshopCost(1);
			    }
				if (e.getSource() == workshop[1]){
					cost.setWorkshopCost(2);
			    }
				if (e.getSource() == workshop[2]){
					cost.setWorkshopCost(3);
			    }
				if (e.getSource() == workshop[3]){
					cost.setWorkshopCost(4);
			    }
				
		JOptionPane.showMessageDialog(null, "Your total cost is:" + myFormat.format(cost.getTotal()));

			}
			if (e.getSource()==jbnExit){
				System.exit(0);
			}
			}
		}
}