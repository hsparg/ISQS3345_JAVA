package lab6sparger;

public class Payroll {
	
	private  String name = "";
	private  int idNumber = 0; 
	private double payrate,
	       hoursWorked;
	
	
	
	public void setName(String na)
	{
		name = na;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setIdNumber(int id){
		idNumber = id;
	}
	
	public int getIdNumber(){
		return idNumber; 
	}
	
	public void setHoursWorked(double hr){
		hoursWorked = hr; 
	}
	
	public double getHoursWorked(){
		return hoursWorked;
	}
	
	public void setPayRate(double rate)
	{
		if(rate==1)
			payrate = 40;
		else if(rate==2)
			payrate = 30;
		else 
			payrate = 20;
	}
	
	public double getPayRate(){
		return payrate;
	}
	
	public boolean checkRate (double rate){
		if(rate<1 || rate>3)
			return false;
		else 
			return true;
	}
	
	public boolean checkHoursWorked (double hr){
		if(hr<0 || hr>80)
			return false;
		else 
			return true;
	}
	
	public double getGrossPay(){
		double grossPay = hoursWorked * payrate; 
		return grossPay;
	}
}
