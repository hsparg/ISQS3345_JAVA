package lab9sparger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui extends JFrame{
	
	public String output = "";
	JLabel jlbName, jlbCategory, jlbHours;
	JTextField jtfName, jtfCategory, jtfHours, jtfPayRate;
	JButton jbnCal, jbnClear, jbnExit;
	JTextArea jtaOutput;
	
	public MyGui(){
		createInterface();
	}
	
	public void createInterface(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout (3,2));
		jlbName = new JLabel ("Name: ");
		jtfName = new JTextField();
		jlbCategory = new JLabel ("Category: ");
		jtfCategory = new JTextField();
		jlbHours = new JLabel ("Hours: ");
		jtfHours = new JTextField();
		p1.add (jlbName);
		p1.add(jtfName);
		p1.add (jlbCategory);
		p1.add(jtfCategory);
		p1.add (jlbHours);
		p1.add(jtfHours);
		c.add(p1);
		c.add(p1, BorderLayout.NORTH);


		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout (1,3));
		jbnCal = new JButton ("Calculate");
		jbnClear = new JButton("Clear");
		jbnExit = new JButton("Exit");
		
		ButtonHandler myH = new ButtonHandler();
		jbnCal.addActionListener(myH);
		jbnClear.addActionListener(myH);
		jbnExit.addActionListener(myH);
		
		p2.add(jbnCal);
		p2.add(jbnClear);
		p2.add(jbnExit);
		c.add(p2);
		c.add(p2, BorderLayout.CENTER);

	
	//JPanel p3 = new JPanel();
	//p3.jsetLayout(new GridLayout ());
	jtaOutput = new JTextArea ();
	//p3.add(jtaOutput);
	//c.add(p3);
	c.add(jtaOutput, BorderLayout.SOUTH);
	pack();
	setVisible(true);
	
	}
	
	public class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==jbnCal){
				Payroll pay = new Payroll();
				String m = jtfName.getText();
				if (pay.checkName(m)==false ){
					JOptionPane.showMessageDialog(null, "Please enter a valid name!", "Error Message",JOptionPane.ERROR_MESSAGE);
					
				}else{
					pay.setName(m);
					int n = Integer.parseInt(jtfCategory.getText());
					int h = Integer.parseInt(jtfHours.getText());
					pay.setPayRate(n);
					pay.setHoursWorked(h);
						if(pay.checkRate(n)==false)
						{
							jtaOutput.append("Error \n");
						}else{
							jtaOutput.append("Weekly Salary for " + pay.getName() + " is " + pay.getPayRate() + "\n");
						}
				}
			}
			if (e.getSource()==jbnClear){
				jtfName.setText("");
				jtfCategory.setText("");
				jtfHours.setText("");
			}
			if (e.getSource()==jbnExit){
				System.exit(0);
			}
		}
	}
}