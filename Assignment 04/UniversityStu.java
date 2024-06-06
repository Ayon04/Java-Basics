class UniversityStu extends StudentAll{
	
	
	private double cgpa;
	
	public void setCgpa(double cgpa ){
		
		this.cgpa=cgpa;
		
	}
	
	public double getCgpa(){
		
		return this.cgpa;
		
	}
	
	//public UniversityStu(){
		
		//default called 
	//}
	
	public  UniversityStu (int id,String name,String bloodGroup,double cgpa){
		
		super(id,name,bloodGroup);
		
		this.setCgpa(cgpa);
	  
	  
	  
		
	}
	
	
	
	public void CommonInfo(){
		
		
		super.CommonInfo();
		System.out.println("CGPA         :"+this.cgpa);
	}
	
	
	
}