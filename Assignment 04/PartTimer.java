class PartTimer extends Employee{
	
	public PartTimer(){
		
		//System.out.println("\nDefault----");
	}
	
	
	public PartTimer (String id,String name,String dateOfBirth,String joiningDate,String bloodGroup,String address,int monthlySalary ){
		
		//System.out.println("\nParameterize----");
		super(id, name,dateOfBirth,joiningDate,bloodGroup,address,monthlySalary);
		
	}
	
	public void PartTimerInfo(){
		
		System.out.println("\nPart Timer Info :");
		showEmplyeeInfo();
		System.out.println("Does not have anything extra");
		
	}
	
	
	
	
	
}
	
	
	
