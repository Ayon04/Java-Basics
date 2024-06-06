class MarketAnalyst extends Employee{
	
	private int commission;
	
	public void setCommission(int commission){
		
		this.commission=commission;
	}
	
	public int getCommission(int commission){
		
		return this.commission;
	}
	
	public MarketAnalyst(){
		
		//System.out.println("\nDefault----");
	}
	
	
	public MarketAnalyst(String id,String name,String dateOfBirth,String joiningDate,String bloodGroup,String address,int monthlySalary,int commission ){
		
		//System.out.println("\nParameterize----");
		super(id, name,dateOfBirth,joiningDate,bloodGroup,address,monthlySalary);
		
		this.commission=commission;
	}
	
	public void MarketAnalystInfo(){
		
		System.out.println("\nMarket Analyst Info :");
		showEmplyeeInfo();
		System.out.println("Market Analyst commission: "+this.commission+" TK");
		int total=this.getMonthlySalary()+this.commission;
		
		System.out.println("Market Analyst Total Income: "+total+" TK");
		
	}
	
	
	
	
	
}