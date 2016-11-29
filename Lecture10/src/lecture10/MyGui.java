package lecture10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGui extends JFrame {
	JLabel jlbInput;
	JTextField jtfInput, jtfBlank, jtfOutput;
	JRadioButton jrbMiles, jrbFeet, jrbInches; 
	JPanel p1, p2;
	ButtonGroup bg;
	
	public MyGui(){
		createInterface();
	}
	
	public void createInterface(){
		Container c = getContentPane();
		c.setLayout(new GridLayout (4,1));
		//GridLayout myLayout = new Gridlayout(4,1);
		//c.setLayout (myl=myLayout) ;
		p1 = new JPanel();
		p1.setLayout(new GridLayout (1,3));
		jlbInput = new JLabel ("Enter a distance in kilometers");
		jtfInput = new JTextField();
		p1.add (jlbInput);
		p1.add(jtfInput);
		c.add(p1);
		
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout (1,3));
		jrbMiles = new JRadioButton ("Convert to Miles");
		jrbFeet = new JRadioButton("Convert to Feet");
		jrbInches = new JRadioButton("Convert to Inches");
		bg = new ButtonGroup();
		bg.add(jrbMiles);
		bg.add(jrbFeet);
		bg.add(jrbInches);

		ButtonHandler myH = new ButtonHandler();
		jrbMiles.addActionListener(myH);
		jrbFeet.addActionListener(myH);
		jrbInches.addActionListener(myH);
		
		
		p2.add(jrbMiles);
		p2.add(jrbFeet);
		p2.add(jrbInches);
		c.add(p2);
		
		jtfBlank = new JTextField();
		jtfBlank.setEditable(false);
		jtfOutput = new JTextField();
		jtfOutput.setEditable(false);
		
		c.add(jtfBlank);
		c.add(jtfOutput);
		
		pack();
		setVisible(true);
		
	}
	public class ButtonHandler implements ActionListener{
		public void actionPerformed (ActionEvent ae){
			String input;
			double out = 0.0;
			if(ae.getSource()==jrbMiles){
				out = Double.parseDouble(jtfInput.getText())*0.62;
			}
			if (ae.getSource() == jrbFeet){
					out = Double.parseDouble(jtfInput.getText())*3280;
			}
			if (ae.getSource() == jrbInches){
					out = Double.parseDouble(jtfInput.getText())*39370.079;
			}
			jtfOutput.setText(jtfInput.getText() + " kilometers is " + String.valueOf(out));
		}
	}
	
}
