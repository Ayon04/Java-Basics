class ITExecutive extends Employee{
	
	private int projectBonus;
	
	public void setProjectBonus(int projectBonus){
		
		this.projectBonus=projectBonus;
	}
	
	public int getProjectBonus(int projectBonus){
		
		return this.projectBonus;
	}
	
	public ITExecutive(){
		
		//System.out.println("\nDefault----");
	}
	
	
	public ITExecutive(String id,String name,String dateOfBirth,String joiningDate,String bloodGroup,String address,int monthlySalary,int projectBonus ){
		
		//System.out.println("\nParameterize----");
		super(id, name,dateOfBirth,joiningDate,bloodGroup,address,monthlySalary);
		
		this.projectBonus=projectBonus;
	}
	
	public void InfoIT_Executive(){
		
		System.out.println("\nIT Executive Info :");
		showEmplyeeInfo();
		System.out.println("IT Executive Project Bonus : "+this.projectBonus+" TK");
		int total=this.getMonthlySalary()+this.projectBonus;
		
		System.out.println("IT Executive Total Income: "+total+" TK");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}