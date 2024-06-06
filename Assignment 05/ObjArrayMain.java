class ObjArrayMain{
	
	public static void main(String args[]){
		
	
	
	 ///BankCustomerInfo [] B =new BankCustomerInfo();//defaoult-1
		//	B[0]=new BankCustomerInfo();
		   // B[0].SetName("Akkha");
		//	B[0].AC(5467);
			//B[0].CB(12000);
			//B[0].AT("Current");
			
			//B[1]=new BankCustomerInfo();
		   // B[1].SetName("Halin");
			//B[1].AC(7896);
			//B[1].CB(15000);
			//B[1].AT("Current");
			BankCustomerInfo [] B=new BankCustomerInfo[4];
			
			B[0]=new BankCustomerInfo("Dirta",300,40,"Current");
			B[1]=new BankCustomerInfo("Nivan",5898,19000,"Current");
			B[2]=new BankCustomerInfo("Vanli",1589,18000,"Current");
			B[3]=new BankCustomerInfo("Diana",9876,1900,"Current");
			
			System.out.println("\nCurrent Account Info ---");
			int index=0;
			
			while(index<4){
				
				B[index].ShowDetails();
				 
				 index++;
			}
			
			SavingBanking[] S=new SavingBanking[4];
				
			S[0]=new SavingBanking("Billu",200,50,"Savings",10,5);
			S[1]=new SavingBanking("Rakib",5898,19000,"Savings",12,10);
			S[2]=new SavingBanking("Muntasir",1589,18000,"Savings",8,15);
			S[3]=new SavingBanking("Syed",9876,1900,"Savings",11,10);
			
			
			System.out.println("\nSaving's Account Info ---");
			int i=0;
			
			while(i<4){
				
				S[i].ShowDetails();
				 
				 i++;
			}
		
	
		
	}
	
	
}