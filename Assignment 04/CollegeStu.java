class CollegeStu extends StudentAll{
	
	
	private double gpa;
	
	
	public void setGpa(double gpa){
		
		this.gpa=gpa;
		
	}
	
	public double getGpa(){
		
		return this.gpa;
		
	}
	
	//public CollegeStu(){
		
	//}		
	
	
	
	
		public CollegeStu(int id,String name,String bloodGroup,double gpa){//cons
	
		 super(id,name, bloodGroup);
		
		this.setGpa(gpa);
			
			
}
	
	
	public void CommonInfo(){
		
		
		super.CommonInfo();
		
		System.out.println("GPA          :"+this.gpa);
	}
	
	
	
	
	
	
}