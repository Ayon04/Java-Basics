class Students{
	
	private int id;
	private String name;
	
	
	
	public void SetId(int id ){
		
		if(id<0){
			
			System.out.println("invalid id");
		}
		
		else {
			
			this.id=id;
			
		}
		
	}

		public int getId(){
			
			
			return this.id;
		}
		
		public void SetName(String name){
			
			
			this.name=name;
		}
		
		
	
		public String getName(){
			
			
			return this.name;
		}
		
		
		
	//	public Students(){//cons 
		//}
		
		
		public void DisplayInfo(){
			
			System.out.println("id :"+this.getId());
			System.out.println("Name :"+this.getName());
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
