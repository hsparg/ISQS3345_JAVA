package finalSparger;

public class Registration {
	private final double GEN_REG = 699; //General Registration
	private final double STU_REG = 499; //Student Registration
	private double ECOMM = 295;   // Introduction to E-Commerce
	private double WEB = 395; // Web Application Development 
	private double JAVA = 395; // Web Application
	private double security = 349;  // Internet Security
	private double total;
	double regCost;
	double shopCost;

	public void setRegistrationCost(int a){
		 
		if (a==1){
			regCost = GEN_REG; }
		if (a==2){
			regCost = STU_REG;}
	}
	public void setWorkshopCost(int wsIndex){
		if (wsIndex==1){
			shopCost = ECOMM; }
		if (wsIndex==2){
			shopCost = WEB; }
		if (wsIndex==3){
			shopCost = JAVA; }
		if (wsIndex==4){
			shopCost = security; }
	
	}
	public double getTotal(){
		total = shopCost + regCost;
		return total;
		
	}


}
