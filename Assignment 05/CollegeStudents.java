class CollegeStudents extends Students{
	
	private double gpa;
	
	public void SetGPA(double gpa){
		
		this.gpa=gpa;
		
		
	}
	
	
	public double getGPA(){
		
		return this.gpa;
		
		
	}
	
	//public CollegeStudents (){
		
	//}
	
	
	public void DisplayInfo(){
			
			//System.out.println("id :"+this.getId());
			//System.out.println("Name :"+this.getName());
			
			super.DisplayInfo();
			System.out.println("GPA :"+this.getGPA());
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}