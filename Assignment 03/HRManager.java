class HRManager extends Employee{
	
	private int KPI;
	
	public void setKPI(int KPI){
		
		this.KPI=KPI;
	}
	
	public int getKPI(){
		
		return this.KPI;
	}
	
	public HRManager(){
		
		//System.out.println("\nDefault----");
	}
	
	
	public HRManager(String id,String name,String dateOfBirth,String joiningDate,String bloodGroup,String address,int monthlySalary,int KPI ){
		
		//System.out.println("\nParameterize----");
		super(id, name,dateOfBirth,joiningDate,bloodGroup,address,monthlySalary);
		
		this.KPI=KPI;
	}
	
	public void HR_ManagerInfo(){
		
		System.out.println("\nHR Manager Info :");
		showEmplyeeInfo();
		System.out.println("HR Manager KPI :"+this.KPI+" TK");
		
		int total=this.getMonthlySalary()+this.KPI;
		
		System.out.println("HR Manager Total Income: "+total+" TK");
		
	}
	
	
	
	
	
}