class SavingBanking extends BankCustomerInfo{
	
	
	private int parsentage;
	private int time;
	
	
	public void Setparsentage(int parsentage){
		
		
		this.parsentage=parsentage;
		
		
	}
	
	
	public int Getparsentage(){
		
		
		return this.parsentage;
		
	}
	
	
	public void SetTime(int time){
		
		
		this.time=time;
		
		
	}
	
	
	public int GetTime(){
		
		
		return this.time;
		
	}
	
	
	public SavingBanking (String name,int AC,int CB,String AT,int parsentage,int time){//parameterize 
		
		
		super(name,AC,CB,AT);
		/*this.name=name;
		this.AC=AC;
		this.CB=CB;
		this.AT=AT;
		*/
		//this.SetAC(AC);
		//this.SetCB(CB);
		this.parsentage=parsentage;
		this.time=time;
		
	}
	
	//@override 
	public void ShowDetails(){
		
		super.ShowDetails();
		System.out.println("Saving Time                 : "+this.GetTime()+" Years");
		System.out.println("Parsentage(%) of Net Balace : "+this.Getparsentage()+" %");
		
		
	}
	
	
	
	
	
	
	
}