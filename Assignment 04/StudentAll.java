class StudentAll{
	
	private int id;
	private String name;
	private String bloodGroup;
	
	
	public void setId(int id){
		
		if(id<0){
			
			System.out.println("invalid ID");
			
		}
		
		else{
		
		this.id=id;
	}
		
		}
	
	
	public int getId(){
		
		return this.id;
		 
	}
	
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public String getName(){
		
		return this.name;
		
	}
	
	public void setBloodGroup(String bloodGroup){
		
		this.bloodGroup=bloodGroup;
		
	}
	
	public String getBloodGroup(){
		
		return this.bloodGroup;
		
	}
	
	StudentAll(){
		
	}
	
	
	public StudentAll (int id,String name,String bloodGroup){
		
		//super(id,name, bloodGroup)
		if(id<0){
			System.out.println("invalide ID");
		}
		else{
		 
		 this.id=id;
	  }
	  
		//this.id=id;
		this.name=name;
		this.bloodGroup=bloodGroup;
		
	}
	
	
	
	public void CommonInfo(){
		
		System.out.println();
		
		System.out.println("Student ID   :"+this.id);
		System.out.println("Student Name :"+this.name);
		System.out.println("Blood Group  :"+this.bloodGroup);
		
		
	}
	
	
}