class ComputerMain{
	
	public static void main(String args []){

          Computer c1 = new Computer();
		  
		  c1.SetRamSpeed(1333);
		  c1.SetharddiskCapacity(2);
		  c1.SetCPUclockSpeed(8.5);
		  c1.SetGPUmemorySize(4);
		  
		  
		  c1.getCPUclockSpeed();
		  
		  c1.showComputerInfo();
		  
		  
		 Computer c2 = new Computer(2400,4,5.5,8);
		 
		 c2.showComputerInfo();
		 
		  
		  c2.getCPUclockSpeed();
		   
		  

		  if(c1.getCPUclockSpeed()>c2.getCPUclockSpeed()){
			   
			   System.out.println("\nC1 CPU clock Speed Is High");
			   
		   }
		   
		   else{
			   
			   
			  System.out.println("\nC2 CPU clock Speed Is High");
			   
		   }
		   
		   

	}
}