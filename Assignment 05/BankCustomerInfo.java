class BankCustomerInfo{//current 
	
	private String name;
	private int AC;
	private int CB;
	private String AT;
	
	
	public void SetName(String name){
		
		this.name=name;
		
	}
	
	public String GetName(){
		
		return name;
		
	}
	
	
	public void SetAC(int AC){
		
		if (AC>0){
			
			this.AC=AC;
		
		}
		else {
			
		System.out.println("invalid AC");
		}
			
	}
	
	public int GetAC(){
		
		return AC;
	}
	
	
	////-2
	public void SetCB(int CB){
		
		if (CB>0 && 500<=CB){
			
			this.CB=CB;
		
		}
		else {
			
		System.out.println("invalid CB");
		}
			
	}
	
	public int GetCB(){
		
		return this.CB;
	}
	
	
	public void SetAT(String AT){
		
		this.AT=AT;
		
		
	}
	
	public String GetAT(){
		
		return this.AT;
		
		
	}
	
	//public BankCustomerInfo{
		
	//}//defoult
	
	
	public BankCustomerInfo(String name,int AC,int CB,String AT){//parameterize 
		
		this.name=name;
		this.SetAC(AC);
		this.SetCB(CB);
		this.AT=AT;
		
	}
	
	
	public void ShowDetails(){
		System.out.println();
		System.out.println("Customer Name               : "+this.GetName());
		System.out.println("Account Number A/C          : "+this.GetAC());
		System.out.println("Current Balance             : "+this.GetCB()+" TK");
		System.out.println("Acciunting Type             : "+this.GetAT());
		
		
		
		
		
	}
	
	
	
	
}