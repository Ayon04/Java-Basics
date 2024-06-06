class Employee{
	
	private String id;
	private String name;
	private String dateOfBirth;
	private String joiningDate;
	private String bloodGroup;
	private String address;
	private int monthlySalary;
	
	
	public void setId(String id){
		
		this.id=id;
		
	}
	
	
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setDateOfBirth(String dateOfBirth){
		
		 this.dateOfBirth=dateOfBirth;
		
	}
	
	public void setJoiningDate(String joiningDate){
		
		this.joiningDate=joiningDate;
	}
	
	public void setBloodGroup(String bloodGroup){
		
		this.bloodGroup=bloodGroup;
		
	}
	
	public void setAddress(String address){
		
		this.address=address;
		
	}
	
	public void setMonthlySalary(int monthlySalary){
		
		this.monthlySalary=monthlySalary;
		
	}
	
	public int getMonthlySalary(){
		
		return this.monthlySalary;			///geter method
		
	}
	
	
	
	
	public Employee(){
		
		//System.out.println("\nDefault----");
	}
	
	public Employee(String id,String name,String dateOfBirth,String joiningDate,String bloodGroup,String address,int monthlySalary){
		
		//System.out.println("\nParameterize----");
		
		this.id=id;
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.joiningDate=joiningDate;
		this.bloodGroup=bloodGroup;
		this.address=address;
		this.monthlySalary=monthlySalary;
	}
	public void showEmplyeeInfo(){
		System.out.println();
		System.out.println("ID : "+this.id);
		System.out.println("Nmae: "+this.name);
		System.out.println("Date Of Birth: "+this.dateOfBirth);
		System.out.println("Joing Date: "+this.joiningDate);
		System.out.println("Blodd Group: :"+this.bloodGroup);
		System.out.println("Address :"+this.address);
		System.out.println("Monthy Salary:"+this.monthlySalary+" TK");
		
	}
	
}